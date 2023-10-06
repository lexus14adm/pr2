package ru.mirea.lab3;

import java.util.Scanner;
public class convertor {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        double dol = 0.0101;
        double eur = 0.0107;
        System.out.println("Перевести в: 1 - доллар, 2 - евро");
        Integer b = a.nextInt();
        if ((b != 1) && (b != 2)){
            System.out.println("Ошибка: веверный ввод данных");
            return;
        }
        System.out.println("Рублей: ");
        Double c = a.nextDouble();
        if (b == 1) {
            System.out.println(c*dol);
        }
        if (b == 2) {
            System.out.println(c*eur);
        }
    }
}
