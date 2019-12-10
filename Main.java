package com.company;
public class Main {

    public static void main(String[] args) throws Exception {
        Xterm.clear();
        Xterm.setPosition(40,35);
        int a= Xterm.inputInt();
        int b= Xterm.inputInt();
        int c= Xterm.inputInt();
        Xterm.println(""+a,Xterm.Blue,Xterm.Yellow);
        Xterm.println(""+b,Xterm.Cyan,Xterm.Red);
        Xterm.println(""+c,Xterm.Black,Xterm.Green);
        int d=(a+b+c)/3;
        Xterm.println(""+d,Xterm.Yellow,Xterm.Black);


	// write your code here
    }
}
