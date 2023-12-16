package application_shopping;

import java.util.Scanner;

public class ApplicationShoppingMikk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to buy?");
        String answer = scanner.nextLine();
        if ("wine".equalsIgnoreCase(answer)) {
            System.out.println("Are you an adult?");
            String adult = scanner.nextLine();
            if ("yes".equalsIgnoreCase(adult)) {
                askMoney(scanner, answer.toLowerCase(),8);
            } else {
                System.out.println("You are not old enough to buy wine.");
            }
        } else if ("milk".equalsIgnoreCase(answer)) {
            askMoney(scanner,answer.toLowerCase(),2);
        } else {
            System.out.println("We don't sell it.");
        }
    }
    private static void askMoney(Scanner scanner, String drink, int requiredPrice) {
        System.out.println(String.format("Give me please %d euros.", requiredPrice));
        int price = scanner.nextInt();
        if (price >= requiredPrice) {
            System.out.println(String.format("You have paid for your %s.", drink));
        } else {
            System.out.println(String.format("You have not paid for your %s.", drink));
        }
    }
}
