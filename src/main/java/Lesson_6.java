/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
3. У каждого животного есть ограничения на действия
   (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
5. Добавить подсчет созданных котов, собак и животных.
 */
abstract class Animals{
    private final int LimitRun = 0;
    private final int LimitSwim = 0;
    abstract void run (int l);
    abstract void swim (int l);
    }
class Cat extends Animals {
    private final int LimitRun = 200;

    @Override
    void run(int l) {
        if ((l >= 0) && (l <= LimitRun)) System.out.println("Барсик пробежал " + l + " м");
        else System.out.println("Барсик не бегал");
    }

    @Override
    void swim(int l) {
        System.out.println("Барсик не умеет плавать");
    }
}
class Dog extends Animals {
    private final int LimitRun = 500;

    @Override
    void run(int l) {
        if ((l >= 0) && (l <= LimitRun)) System.out.println("Бобик пробежал " + l + " м");
        else System.out.println("Бобик не бегал");
    }

    private final int LimitSwim = 10;

    @Override
    void swim(int l) {
        if ((l >= 0) && (l <= LimitRun)) System.out.println("Бобик проплыл " + l + " м");
        else System.out.println("Бобик не плавал");
    }
}
public class Lesson_6 {
    public static void main(String[] args) {
        Cat Barsik = new Cat();
        Barsik.run(150);
        Barsik.swim(10);
        Dog Bobik = new Dog();
        Bobik.run(450);
        Bobik.swim(9);
    }
}
