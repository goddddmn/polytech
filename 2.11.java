package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1;
        double x2;
        double x;
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        double discr = b * b - 4 * a * c;
        if (discr > 0) {
            x1 = (-b + Math.sqrt(discr)) / (2 * a);
            x2 = (-b - Math.sqrt(discr)) / (2 * a);
            System.out.println( x1 + " " + x2);
        }
        else if (discr == 0) {
            x= (-b  / (2 * a));
            System.out.println( x);

        }
        if (discr < 0) {
            System.out.println( "Нет корней");

        }


    }

}