package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k=0;
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(a);
        System.out.println(b);
        a=a+b-(b=a);
        System.out.println(a);
        System.out.println(b);



    }

}