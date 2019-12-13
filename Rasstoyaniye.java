package com.company;
import java.util.Scanner;
public class Rasstoyaniye {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if(x > 1) {
            System.out.println(x - 1);
        }
        else if (x <= 1 && x >= 0) {
            System.out.println("Doesn't exist");
        }
        else if(x < 0) {
            System.out.println(0 - x);
        }
    }
}
