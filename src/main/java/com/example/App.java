package com.example;

public class App {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        App app = new App();
        int result = app.divide(10, 2);
        System.out.println("Division result: " + result);
    }
}
