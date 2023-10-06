package ru.mirea.lab1;

import java.util.Scanner;
public class _3 {
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
        for (int i = 0; i != leght; i++){
            b += a[i];
        }
        float c = b/leght;
        System.out.println("Сумма всех элементов массива равна = "+b+", а среднее арифметическое его элементов равняется = "+c);
    }
}