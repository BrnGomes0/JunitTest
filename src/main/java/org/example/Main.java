package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.plus(2, 3));
        System.out.println(calculator.plus(-4, -6));
        System.out.println(calculator.plus(0, 5));
        System.out.println(calculator.plus(0, -7));
        System.out.println(calculator.plus(0,0));



    }
}