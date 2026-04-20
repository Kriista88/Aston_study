package Lesson3;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isReservedByCustomer;

    public Product(String name, String productionDate, String manufacturer,
                   String countryOfOrigin, double price, boolean isReservedByCustomer) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReservedByCustomer = isReservedByCustomer;
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Забронирован: " + (isReservedByCustomer ? "Да" : "Нет"));
        System.out.println("------------------------");
    }
}
