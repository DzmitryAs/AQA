package Lesson_6;
/*
Реализовать сохранение данных в csv файл; Реализовать загрузку данных из csv файла. Файл читается целиком.
Структура csv файла:
Строка заголовок с набором столбцов
Набор строк с целочисленными значениями
Разделитель между столбцами - символ точка с запятой (;)
Пример (см. на прикрепленном скриншоте)
Для хранения данных использовать класс вида:
public class AppData {
   private String[] header;
   private int[][] data;
   // ...
}
Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            //записываем заголовок
            for (int i = 0; i < header.length; i++) {
                writer.append(header[i]);
                if (i < header.length - 1) {
                    writer.append(";");
                } else {
                    writer.append("\n");
                }
            }

            for (int[] datum : data) {
                for (int j = 0; j < datum.length; j++) {
                    writer.append(String.valueOf(datum[j]));
                    if (j < datum.length - 1) {
                        writer.append(";");
                    } else {
                        writer.append("\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData load(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            //читаем первую строку
            String[] header = reader.readLine().split(";");

            int numRows = 0;
            int numCols = header.length;
            while (reader.readLine() != null) {
                numRows++;
            }
            reader.close();

            int[][] data = new int[numRows][numCols];
            BufferedReader newReader = new BufferedReader(new FileReader(fileName));
            newReader.readLine();
            String line;
            int row = 0;
            while ((line = newReader.readLine()) != null) {
                String[] values = line.split(";");
                for (int i = 0; i < values.length; i++) {
                    data[row][i] = Integer.parseInt(values[i]);
                }
                row++;
            }
            return new AppData(header, data);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String[] header = {"Value1", "Value2", "Value3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500},
        };
        AppData appData = new AppData(header, data);

        appData.save("data.csv");

        AppData loadedData = AppData.load("data.csv");
        if (loadedData != null) {
            for (String element : loadedData.header) {
                System.out.print(element + "  ");
            }
            System.out.println();
            for (int[] row : loadedData.data) {
                for (int element : row) {
                    System.out.print(element + "  ");
                }
                System.out.println();
            }
        }
    }
}