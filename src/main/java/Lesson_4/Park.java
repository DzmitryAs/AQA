package Lesson_4;

public class Park {
    private final String parkName;
    private final Attractions[] attractions;

    public Park(String parkName, int attractionQuanity) {
        this.parkName = parkName;
        this.attractions = new Attractions[attractionQuanity];
    }

    public static class Attractions {
        private final String attractionName;
        private final String workingHours;
        private final String price;

        public Attractions(String attractionName, String workingHours, String price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void getInfo() {
            System.out.println("Attraction: " +
                    attractionName + "\n" +
                    "WorkingHours: " +
                    workingHours + "\n" +
                    "Price: " + price);
        }
    }

    public void addAttractions(int id, String attractionName, String workingHours, String price) {
        if (id >= 0 && id < attractions.length) {
            attractions[id] = new Attractions(attractionName, workingHours, price);
        } else
            System.out.println("Invalid attraction id");
    }

    public void getParkAttrections() {
        System.out.println("Park attractions" + parkName + ":");
        for (Attractions attraction : attractions) {
            if (attraction != null) {
                attraction.getInfo();
                System.out.println();
            }
        }
    }
}
