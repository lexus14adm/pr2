package ru.mirea.lab4_1;

public class Person
{
    String fullName;
    int age;
    void move(){
        System.out.println(fullName + " говорит");
    }
    void talk(){
        System.out.println(fullName + " говорит");
    }
    public Person(){
        /*this("Ничего",10);*/
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public static void main(String[] args){
        Person person1 = new Person("Ничего", 10);
        person1.talk();
        Person person2 = new Person();
        person2.talk();
    }
}
