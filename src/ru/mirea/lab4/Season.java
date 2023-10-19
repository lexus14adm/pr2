package ru.mirea.lab4;

import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Seasons summer = Seasons.Summer;
        if(summer == Seasons.Summer) {
            System.out.println("Я обожаю лето");
        }
        Season enumMain = new Season();
        Scanner a = new Scanner(System.in);
        System.out.println("Какое ваше любимое время года?");
        String input = a.nextLine();
        if (input.equals("Лето")) {
            enumMain.printEnum(Seasons.Summer);
        }
        else if (input.equals("Весна")) {
            enumMain.printEnum(Seasons.Spring);
        }
        else if (input.equals("Зима")) {
            enumMain.printEnum(Seasons.Winter);
        }
        else if (input.equals("Осень")) {
            enumMain.printEnum(Seasons.Autumn);
        }
        else {
            System.out.println("Я не слышал о таком(((");
        }

        for (Seasons t : Seasons.values()) {
            System.out.println(t + " " + t.middleTemp + " " + t.coldOrHot(t));
        }
    }

    void printEnum(Seasons time) {
        switch (time) {
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Autumn:
                System.out.println("Я люблю осень");
                break;
            case Winter:
                System.out.println("Я люблю зиму");
                break;
            case Spring:
                System.out.println("Я люблю весну");
                break;
        }
    }
} enum Seasons {

    Winter(-10.4),
    Spring(9.2),
    Summer(23.6),
    Autumn(5.9);
    double middleTemp;
    Seasons(double middleTemp) {
        this.middleTemp = middleTemp;
    }
    public double getMiddleTemp() {
        return middleTemp;
    }

    public String coldOrHot(Seasons time) {
        String times = "";
        switch (time) {
            case Winter:
                times = "Холодное время года";
                break;
            case Autumn:
                times = "Холодное время года";
                break;
            case Spring:
                times = "Холодное время года";
                break;
            case Summer:
                times = "Теплое время года";
                break;

        }
        return times;
    }
}