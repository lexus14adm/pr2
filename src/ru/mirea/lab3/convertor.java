package ru.mirea.lab3;

import java.util.Scanner;
public class convertor {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double dol = 0.0101;
        double eur = 0.0107;
        int i = 0;
        Integer b = null;
        while (i == 0) {
            System.out.println("Перевести в: 1 - доллар, 2 - евро");
            b = a.nextInt();
            if ((b != 1) && (b != 2)) {
                System.out.println("Ошибка: веверный ввод данных");
            }
            else {
                i = 1;
            }
        }
        Double c = null;
        while (i == 1) {
            System.out.println("Рублей: ");
            c = a.nextDouble();
            if (c < 0) {
                System.out.println("Введите значение больше нуля");
            }
            else{
                i = 0;
            }
        }
        if (b == 1) {
            System.out.println(c * dol);
        }
        if (b == 2) {
            System.out.println(c * eur);
        }
    }
}
