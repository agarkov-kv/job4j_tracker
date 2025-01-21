package ru.job4j.oop;

import java.util.Scanner;

public class Jukebox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        Jukebox song = new Jukebox();
        song.music(position);
    }

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюжие");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
}
