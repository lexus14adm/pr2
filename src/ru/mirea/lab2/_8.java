package ru.mirea.lab2;

import java.util.Scanner;
public class _8 {

    public static void main(String[] args){
        String[] a = {"Пример ","массива ","строчного ","типа "};
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        int b = a.length;
        String temp;
        for (int i = 0; i < b/2; i++) {
            temp = a[b-i-1];
            a[b-i-1] = a[i];
            a[i] = temp;
        }
        for (int i=0; i<b; i++){
            System.out.print(a[i]);
        }
    }
}