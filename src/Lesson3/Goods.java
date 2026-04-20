package Lesson3;

public class Goods {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro", "15.03.2025",
                "Apple Inc.", "USA", 5999, false);
        productsArray[2] = new Product("Xiaomi 14T", "10.01.2025",
                "Xiaomi Corp.", "China", 3499, true);
        productsArray[3] = new Product("Google Pixel 9", "20.02.2025",
                "Google LLC", "USA", 5299, false);
        productsArray[4] = new Product("OnePlus 12", "05.04.2025",
                "OnePlus", "China", 3999, true);

        System.out.println("=== ТОВАРЫ ===\n");
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println("Товар " + (i + 1) + ":");
            productsArray[i].displayInfo();
        }
    }
}
