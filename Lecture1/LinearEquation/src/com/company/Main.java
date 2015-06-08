package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэффициент a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите коэффициент b: ");
        double b = Double.parseDouble(scanner.nextLine());

        double x = -b/a;
        System.out.println("Ваш корень равен: ");
        System.out.println(x);
    }
}
