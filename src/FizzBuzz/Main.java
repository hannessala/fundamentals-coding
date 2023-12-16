package FizzBuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int input = scanner.nextInt();
        new FizzBuzz(input);
    }
}
