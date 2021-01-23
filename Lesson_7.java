package org.apache.maven.homeworks;
/*
1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды,
   а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать
 (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт
   (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию
   о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */
class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Plate balance: " + food;
    }

    void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    int getfood() {
        return food;
    }

    void increaseFood(int q) {
        food += q;
    }
}

class Cat {
    private final String name;
    private final int appetite;
    private boolean isFull;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    @Override
    public String toString() {
        return name + " with appetite " + appetite + " is full: " + isFull;
    }

    void eat(Plate plate) {
        if (plate.getfood() >= appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }
    void overEat(Plate plate) {
        if (isFull = false || plate.getfood() < appetite) {
            plate.increaseFood(appetite);
        }
        else isFull = true;
    }
}
class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Pushok", 15),
                new Cat("Vasjka", 25)};
        Plate plate = new Plate(0);

        System.out.println("Our cats");
        for (Cat obj : cats) {
            System.out.println(obj);
        }
        System.out.println(plate);

        System.out.println("\n" + "Adding food");
        plate.increaseFood(25);
        System.out.println(plate);

        System.out.println("\n" + "Cats feeding");
        for (Cat obj : cats) {
            obj.eat(plate);
            System.out.println(obj);
            System.out.println(plate);
        }
        System.out.println("\n" + "Over feeding");
        for (Cat obj : cats) {
            obj.overEat(plate);
            System.out.println(obj);
            System.out.println(plate);
            obj.eat(plate);
        }
    }
}
