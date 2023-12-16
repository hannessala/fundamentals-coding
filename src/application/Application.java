package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    private static final List<String> ALLOWED_SYMBOLS = Arrays.asList("+", "-", "/", "*");

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Give me a symbol: ");
        String symbol = scanner.next();
        System.out.println("Give me second number: ");
        float secondNumber = scanner.nextFloat();
        if (!ALLOWED_SYMBOLS.contains(symbol)) {
            System.out.println("Invalid symbol");
        } else {
            calculate(symbol, firstNumber, secondNumber);
        }

    }
    private static void calculate(String symbol, float firstNumber, float secondNumber) {
        if ("+".equals(symbol)) {
            System.out.println("Result: " + (firstNumber + secondNumber));
        } else if ("-".equals(symbol)) {
            System.out.println("Result: " + (firstNumber - secondNumber));
        } else if ("/".equals(symbol)) {
            divide(firstNumber, secondNumber);
        } else if ("*".equals(symbol)) {
            System.out.println("Result: " + (firstNumber * secondNumber));
        }
    }

    private static void divide(float firstNumber, float secondNumber) {
        if(secondNumber == 0){
            System.out.println("Cannot calculate.");
        } else {
            System.out.println("Result: " + (firstNumber / secondNumber));
        }
    }
}
