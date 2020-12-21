package org.apache.maven.homeworks;

public class Lesson_2 {
    public static void main(String[] args) {
        System.out.println(" Задание 1");
        exOne();
        System.out.println("\n\n Задание 2");
        exTwo();
        System.out.println("\n\n Задание 3");
        exThree();
        System.out.println("\n\n Задание 4");
        exFour();
    }

    // Задание 1
    public static void exOne() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("\n");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Задание 2
    public static void exTwo() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }

    // Задание 3
    public static void exThree() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.print("\n");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + "  ");
        }
    }

    // Задание 4
    public static void exFour() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i == j) || (i + j == 3)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}




