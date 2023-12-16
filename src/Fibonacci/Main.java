package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci series: \n Enter an Integer: ");
        int input = scanner.nextInt();
                Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacciSeries(input);
    }
}
