package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario");
        }
        if ("Tanks".equals(name)) {
            System.out.println("Start - tanks");
        }
        if ("Tetris".equals(name)) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        menu("Tanks");
    }
}
