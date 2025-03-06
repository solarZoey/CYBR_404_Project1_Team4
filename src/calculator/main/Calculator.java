package calculator.main;

import calculator.utils.InputValidator;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    private static final int MAX_HISTORY_SIZE = 100;

    private ArrayList<String> history;
    private Scanner scanner;
    private InputValidator validator;

    public Calculator() {
        this.history = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.validator = new InputValidator();
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.run();
    }

    public void run() {
        displayWelcomeMessage();

        boolean isRunning = true;
        while (isRunning) {
            displayMenu();

            try {
                int choice = validator.getIntInput("Select an operation: ", 0, 11);

                switch (choice) {
                    case 0:
                        isRunning = false;
                        break;
                    case 1:
                        performOperation(OperationType.ADDITION);
                        break;
                    case 2:
                        performOperation(OperationType.SUBTRACTION);
                        break;
                    case 3:
                        performOperation(OperationType.MULTIPLICATION);
                        break;
                    case 4:
                        performOperation(OperationType.DIVISION);
                        break;
                    case 5:
                        performOperation(OperationType.SQUARE_ROOT);
                        break;
                    case 6:
                        performOperation(OperationType.SINE);
                        break;
                    case 7:
                        performOperation(OperationType.COSINE);
                        break;
                    case 8:
                        performOperation(OperationType.TANGENT);
                        break;
                    case 9:
                        performOperation(OperationType.LOGARITHM);
                        break;
                    case 10:
                        displayHistory();
                        break;
                    case 11:
                        clearHistory();
                        break;
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        displayExitMessage();
    }

    private void performOperation(OperationType type) {
        double result = 0;
        String operation = "";

        switch (type) {
            case ADDITION:
                result = calculator.main.BasicOperations.add(
                        validator.getDoubleInput("Enter first number: "),
                        validator.getDoubleInput("Enter second number: ")
                );
                operation = "+";
                break;
            case SUBTRACTION:
                result = calculator.main.BasicOperations.subtract(
                        validator.getDoubleInput("Enter first number: "),
                        validator.getDoubleInput("Enter second number: ")
                );
                operation = "-";
                break;
            case MULTIPLICATION:
                result = calculator.main.BasicOperations.multiply(
                        validator.getDoubleInput("Enter first number: "),
                        validator.getDoubleInput("Enter second number: ")
                );
                operation = "*";
                break;
            case DIVISION:
                result = calculator.main.BasicOperations.divide(
                        validator.getDoubleInput("Enter first number: "),
                        validator.getDoubleInput("Enter second number: ")
                );
                operation = "/";
                break;
            case SQUARE_ROOT:
                result = calculator.main.BasicOperations.squareRoot(
                        validator.getDoubleInput("Enter a number: ")
                );
                operation = "√";
                break;
            case SINE:
                result = calculator.main.BasicOperations.sine(
                        validator.getDoubleInput("Enter a number (in radians): ")
                );
                operation = "sin";
                break;
            case COSINE:
                result = calculator.main.BasicOperations.cosine(
                        validator.getDoubleInput("Enter a number (in radians): ")
                );
                operation = "cos";
                break;
            case TANGENT:
                result = calculator.main.BasicOperations.tangent(
                        validator.getDoubleInput("Enter a number (in radians): ")
                );
                operation = "tan";
                break;

            case LOGARITHM:
                double number = validator.getDoubleInput("Enter a number: ");
                double base = validator.getDoubleInput("Enter the logarithm base: ");
                result = calculator.main.BasicOperations.logarithm(number, base);
                operation = "log_" + base + "(" + number + ")";
                break;
        }

        displayResult(result);
        addToHistory(operation, result);
    }

    private void displayResult(double result) {
        System.out.printf("Result: %.2f%n", result);
    }

    private void addToHistory(String operation, double result) {
        String historyEntry = operation + " = " + result;

        if (history.size() >= MAX_HISTORY_SIZE) {
            history.remove(0);
        }

        history.add(historyEntry);
    }

    private void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("No calculation history.");
            return;
        }

        System.out.println("\n--- Calculation History ---");
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ": " + history.get(i));
        }
        System.out.println("-------------------------");
    }

    private void clearHistory() {
        if (history.isEmpty()) {
            System.out.println("No calculation history to clear.");
            return;
        }

        System.out.println("\n--- Calculation History Before Clearing ---");
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ": " + history.get(i));
        }
        System.out.println("-----------------------------------------");

        // Clear history
        history.clear();
        System.out.println("Calculation history cleared.");
    }

    private void displayWelcomeMessage() {
        System.out.println("=== Calculator ===");
        System.out.println("Welcome! Select an operation to begin.");
    }

    private void displayMenu() {
        System.out.println("\nSelect Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Sine");
        System.out.println("7. Cosine");
        System.out.println("8. Tangent");
        System.out.println("9. Logarithm");
        System.out.println("10. Show History");
        System.out.println("11. Clear History");
        System.out.println("0. Exit");
    }

    private void displayExitMessage() {
        System.out.println("Thank you for using the Calculator. Goodbye!");
    }

    private enum OperationType {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION,
        SQUARE_ROOT, SINE, COSINE, TANGENT, LOGARITHM
    }
}