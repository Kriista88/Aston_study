public class Homework2 {
    public static void main(String[] args) {

        // 1. printThreeWords
        printThreeWords();

        // 2. checkSumSign
        checkSumSign();

        // 3. printColor
        printColor();

        // 4. compareNumbers
        compareNumbers();

        // 5. checkSumRange
        System.out.println(checkSumRange(5, 7));

        // 6. checkPositiveOrNegative
        checkPositiveOrNegative(5);
        checkPositiveOrNegative(-3);

        // 7. isNegative
        System.out.println(isNegative(-5));
        System.out.println(isNegative(3));

        // 8. printStringMultipleTimes
        printStringMultipleTimes("Hello", 3);

        // 9. isLeapYear
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(1900));

        // 10. invertArray
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 0, 0};
        invertArray(binaryArray);

        // 11. fillArray
        int[] hundredArray = fillArray();

        // 12. multiplyLessThanSix
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(array);

        // 13. fillDiagonal
        fillDiagonal(5);

        // 14. createArray
        int[] newArray = createArray(5, 10);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 75;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 15;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void multiplyLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void fillDiagonal(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}