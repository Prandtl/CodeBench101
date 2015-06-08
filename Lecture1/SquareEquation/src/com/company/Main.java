package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите коэффициент a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("ведите коэффициент b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("ведите коэффициент с: ");
        double c = Double.parseDouble(scanner.nextLine());

        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("Корней нет. :(");
        } else {
            if (d == 0) {
                double x = -b / (2 * a);
                System.out.println("Ваш корень равен:  ");
                System.out.println(x);
            } else {
                double x1 = (-b - Math.sqrt(d)) / (2 * a);
                double x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println("Первый корень: ");
                System.out.println(x1);
                System.out.println("Второй корень: ");
                System.out.println(x2);
            }
        }
    }
}
