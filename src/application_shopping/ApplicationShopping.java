package application_shopping;

import java.util.Scanner;

public class ApplicationShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to buy?");
        String answer = scanner.nextLine();
        if ("wine".equalsIgnoreCase(answer)) {
            System.out.println("Are you an adult?");
            String adult = scanner.nextLine();
            if ("yes".equalsIgnoreCase(adult)) {
                System.out.println("Give me please 8 euros.");
                int price = scanner.nextInt();
                if (price >= 8) {
                    System.out.println("You have paid for your wine.");
                } else {
                    System.out.println("You have not paid for your wine.");
                }
            } else {
                System.out.println("You are not old enough to buy wine.");
            }
        } else if ("milk".equalsIgnoreCase(answer)) {
            System.out.println("Give me please 2 euros.");
            int price = scanner.nextInt();
            if (price >= 2) {
                System.out.println("You have paid for your milk.");
            } else {
                System.out.println("You have not paid for your milk.");
            }
        } else {
            System.out.println("We don't sell it.");
        }
    }
}
