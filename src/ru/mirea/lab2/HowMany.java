package ru.mirea.lab2;

import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String input = a.nextLine();
        if(input.length() == 0) {
            System.out.println("Хоть что-то бы ввёл для приличия((");
            return;
        }
        int b = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                b++;
            }
        }
        System.out.println(b);
    }
}

