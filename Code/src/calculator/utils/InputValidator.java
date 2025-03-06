package calculator.utils;

import java.util.Scanner;


public class InputValidator {
    private Scanner scanner;


    public InputValidator() {
        this.scanner = new Scanner(System.in);
    }


    public int getIntInput(String prompt, int min, int max) {
        int input;
        while (true) {
            try {
                System.out.print(prompt);
                input = Integer.parseInt(scanner.nextLine());

                if (input >= min && input <= max) {
                    return input;
                }

                System.out.printf("Error: Please enter a number between %d and %d%n", min, max);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }


    public double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}