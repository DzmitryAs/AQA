package Lesson_4;

public class Park {
    /*
    Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
     */
    public static void main(String[] args) {
        Park park = new Park();
        Park.Attraction attraction1 = new Attraction();

        attraction1.attractionName = "The Sun";
        attraction1.workingHours = "12:00 - 24:00";
        attraction1.cost = "10";
        attraction1.getAttrInfo();
    }

    public static class Attraction {
        private String attractionName;
        private String workingHours;
        private String cost;

        public void getAttrInfo() {
            System.out.println("Attraction Name: " + attractionName + ";  Working Hours: " + workingHours + ";  Cost :" + cost);
        }
    }
}
