package ru.job4j.oop;

public class Student {
    public void sing()  {
        System.out.println("I believe I can fly");
        System.out.println("I believe I can fly");
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.sing();
        petya.sing();
        petya.sing();
    }
}