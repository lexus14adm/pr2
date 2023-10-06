package ru.mirea.lab3;

import java.util.Random;
import java.util.Arrays;
public class _1 {
    public static void main(String[] args){
        double[] mas = new double[9];

        for (int i = 0; i < (mas.length / 2); i++) {
            mas[i] = Math.random() * 10;
            System.out.println(mas[i]);
        }
        for (int i = mas.length / 2; i < mas.length; i++) {
            Random random = new Random();
            mas[i] = random.nextDouble(10);
            System.out.println(mas[i]);
        }

        System.out.println("\n");
        Arrays.sort(mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}