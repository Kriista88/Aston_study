package Homework4;

abstract class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected static int animalCount = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (макс " + runLimit + " м.)");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. (макс " + swimLimit + " м.)");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name, 200, 0);
        this.isFull = false;
        catCount++;
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.getFood() >= amount) {
            bowl.decreaseFood(amount);
            isFull = true;
            System.out.println(name + " поел " + amount + " еды. Теперь сыт");
        } else {
            System.out.println(name + " не стал есть: нужно " + amount + ", есть " + bowl.getFood());
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }

    public String getName() {
        return name;
    }
}

class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0);
    }

    public int getFood() {
        return foodAmount;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды. Теперь в миске " + foodAmount);
        }
    }

    public void decreaseFood(int amount) {
        if (amount > 0 && amount <= foodAmount) {
            foodAmount -= amount;
        }
    }
}

public class CatAndDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Снежок");

        System.out.println("=== ДВИЖЕНИЯ ===");
        dog1.run(150);
        dog1.swim(5);
        cat1.run(180);
        cat1.swim(3);
        dog2.run(600);
        cat2.run(250);

        System.out.println("\n=== ПОДСЧЕТ ===");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());

        System.out.println("\n=== КОРМЛЕНИЕ ===");
        Bowl bowl = new Bowl(30);
        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.eat(bowl, 15);
        }

        System.out.println("\n=== СЫТОСТЬ ===");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + (cat.isFull() ? "Да" : "Нет"));
        }

        System.out.println("\n=== ДОБАВЛЯЕМ ЕДУ ===");
        bowl.addFood(20);

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 15);
            }
        }

        System.out.println("\n=== ИТОГОВАЯ СЫТОСТЬ ===");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + (cat.
                    isFull() ? "Да" : "Нет"));
        }
    }
}
