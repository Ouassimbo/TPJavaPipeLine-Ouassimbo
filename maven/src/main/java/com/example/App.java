package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("  TP JavaPipeLine - Ouassimbo   ");
        System.out.println("=================================");
        System.out.println("Build réussi ! Application démarrée.");
        
        Calculator calc = new Calculator();
        System.out.println("Test : 5 + 3 = " + calc.add(5, 3));
        System.out.println("Test : 10 - 4 = " + calc.subtract(10, 4));
        System.out.println("Test : 6 * 7 = " + calc.multiply(6, 7));
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
}