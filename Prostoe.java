package com.company;
import java.util.Scanner;
public class Prostoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = 2;
        int count = 0;
        w: while(true) {
            for (int i = 2; i < p; i++) {
                if (p% i == 0) {
                    ++p;
                    continue w;
                }
            }
            ++count;
            if(n == count) {
                break w;
            }
            ++p;
        }
        System.out.println(p);
    }
}