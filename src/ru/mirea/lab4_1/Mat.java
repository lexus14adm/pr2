package ru.mirea.lab4_1;

import java.util.Arrays;
public class Mat{
    static int str = 2;
    static int sto = 2;
    static int[][] m = new int [str][sto];

    public static void set(){
        m[0][0]  = 0;
        m[0][1] = 0;
        m[1][0] = 0;
        m[1][1] = 0;
    }

    public static void get(){
        System.out.println(Arrays.deepToString(m));
    }

    public static void sum(int[][] n){
        if (n[0].length + n.length != str + sto){
            System.out.println("Неправильно введёная матрица");
            return;
        }
        for (int i = 0; i < str; i++){
            for (int j = 0; j < sto; j++){
                m[i][j] += n[i][j];
            }
        }
    }
    public static void mul(int g){
        for (int i = 0; i < str; i++){
            for (int j = 0; j < sto; j++){
                m[i][j] *= g;
            }
        }
    }

    public static void main(String[] args){
        set();
        get();
        int[][] n = {{3,2},{1, 0}};
        sum(n);
        mul(-4);
        get();
    }
}
