package Lesson_4;

public class Park {
    public static void main(String[] args) {
        Attractions[] attraction = new Attractions[2];
        attraction[0] = new Attractions("water", "12-24", "10");
        attraction[1] = new Attractions("fire", "12-24", "15");
        for (Attractions attractions : attraction) {
            System.out.println(attractions);
        }
    }

    public static class Attractions {
        private final String attractionName;
        private final String workingHours;
        private final String cost;

        public Attractions(String attractionName, String workingHours, String cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public String toString() {
            return ("Attraction Name: " + attractionName + ";  Working Hours: " + workingHours + ";  Cost:" + cost);
        }
    }
}
