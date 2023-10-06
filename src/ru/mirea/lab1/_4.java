package ru.mirea.lab1;

import java.util.Scanner;
public class _4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите длинну массива:");
        int leght = s.nextInt();
        int[] a = new int[leght];
        for (int i = 0; i != leght; i++){
            System.out.println("Элемент под индексом "+i+":");
            a[i] = s.nextInt();
        }
        float b = 0;
        int i = 0;
        while (i != leght){
            b += a[i];
            i += 1;
        }
        int j = 0, max = -1000000000;
        while (j != leght){
            if (a[j] > max){
                max = a[j];
            }
            j += 1;
        }
        int k = 0, min = 1000000000;
        do {
            if (a[k] < min){
                min = a[k];
            }
            k += 1;
        } while (k != leght);
        System.out.println("Сумма всех элементов массива равна = "+b+", максимальное значение элемента = "+max+", а минимальное = "+min);
    }
}
