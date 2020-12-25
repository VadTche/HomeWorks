package org.apache.maven.homeworks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class Lesson_3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Я загадаю число от 0 до 9, а ты попробуй его угадать за 3 попытки!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            Random r = new Random();
            int x = r.nextInt(9);
            int f;
            System.out.println("Введи любое число от 0 до 9 и нажми <ENTER>");
            for (int i = 1; i <= 3; i++) {
                f = Integer.parseInt(br.readLine());
                if (f == x) {
                    System.out.println("Точно, ты отгадал! Это число " + x);
                    break;
                }
                else if (f > x) System.out.println("Твое число больше загаданного");
                else if (f < x) System.out.println("Твое число меньше загаданного");
                if (i == 3) System.out.println("Ты проиграл! Это было число " + x);
            }
            System.out.println("Сыграем еще раз? 1 - ДА / 0 - НЕТ");
            int repeat = Integer.parseInt(br.readLine());
            while ((repeat != 0) && (repeat != 1)) {
                System.out.println("Будь внимательней!: 1 - ДА / 0 - НЕТ");
                repeat = Integer.parseInt(br.readLine());
            }
            if (repeat == 1) {
                System.out.println("Начинаем заново...");
            }
            else {
                System.out.println("Пока!");
                return;
            }
        } while (true);
    }

}
