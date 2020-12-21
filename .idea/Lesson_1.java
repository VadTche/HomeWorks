package org.apache.maven.homeworks;

public class Lesson_1 {
    // Задание №1 и №2
    public static void main(String[] args) {
        float a = 2.25f, b = 3.05f, c = 1.85f, d = 0.75f;
        int e = 7, f = 11, x = -11;
        byte g = -25;
        short j = 2034;
        long k = 300000L;
        double l = 456.789;
        char m = '\345';
        boolean n = false;
        System.out.println(hwThree(a, b, c, d));
        System.out.println(hwFour(e, f));
        hwFive(x);
        System.out.println(hwSix(x));
        hwSeven("Бесси");
    }
    //  Задание №3
    public static float hwThree(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    // Задание №4
    public static boolean hwFour(int e, int f) {
        int q = e + f;
        if (q > 10 && q < 20) return true;
        else return false;
    }
    // Задание №5
    public static void hwFive(int x) {
        if(x>=0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }

    // Задание №6
    public static boolean hwSix(int x) {
        if(x<0) return true;
        else return false;
    }
    // Задание №7
    public static void hwSeven(String im) {
        System.out.println("Привет," + im + "!");
    }
}

