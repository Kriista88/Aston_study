package Lesson3;

public class Park {
    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public class Attraction {
        private String name;
        private String workTime;
        private double cost;

        public Attraction(String name, String workTime, double cost) {
            this.name = name;
            this.workTime = workTime;
            this.cost = cost;
        }

        public void displayInfo() {
            System.out.println("Парк: " + parkName);
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workTime);
            System.out.println("Стоимость: " + cost + " руб.");
            System.out.println("------------------------");
        }
    }
}
