package main;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите своё имя: ");
        String name = scan.nextLine();
        System.out.println("Здравствуй " + name + "!");
        scan.close();


    }
}
