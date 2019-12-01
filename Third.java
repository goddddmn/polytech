package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k=0;
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a>b && a>c ){
            System.out.println("1");
        }
        if(b>a && b>c){
            System.out.println("1");
        }

        if(c>a && c>b){
            System.out.println("1");
        }
        if(a==b && a>c ){
            System.out.println("2");
        }
        if(b==c && b>a){
            System.out.println("2");
        }
        if(c==a && c>b){
            System.out.println("2");
        }
        if(a==b && a==c){
            System.out.println("3");
        }
    }
}
