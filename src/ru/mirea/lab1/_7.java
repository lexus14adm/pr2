package ru.mirea.lab1;

import java.util.Scanner;
public class _7 {
    public static void fact(int a){
        if (a < 0){
            System.out.println("Ошибка: нельзя вычислять факториал отрицательного числа!");
            return;
        }
        if (a == 0){
            System.out.println("1");
            return;
        }
        int j = 1;
        for (int i = 1; i <= a; i++){
            System.out.println(j);
            j *= i;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        int b = s.nextInt();
        fact(b);
    }
}