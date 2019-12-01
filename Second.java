package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a>b && a>c && b>c){
            System.out.println(b);
        }
        if(a>b && a>c && c>b){
            System.out.println(c);
        }
        if(b>a && b>c && a>c){
            System.out.println(a);
        }
        if(b>a && b>c && c>a){
            System.out.println(c);
        }
        if(c>a && c>b && a>b){
            System.out.println(a);
        }
        if(c>a && c>b && b>a){
            System.out.println(b);
        }
    }
}
