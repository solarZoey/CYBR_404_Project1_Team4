package calculator.main;

public class BasicOperations {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is undefined");
    }
    return a / b;
}

    public static double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(a);
    }

    public static double sine(double a) {
        return Math.sin(a);
    }

    public static double cosine(double a) {
        return Math.cos(a);
    }

    public static double tangent(double a) {
        return Math.tan(a);
    }

    public static double logarithm(double a, double base) {
        if (a <= 0 || base <= 0) {
            throw new ArithmeticException("Cannot calculate logarithm of a non-positive number or with a non-positive base");
        }
        return Math.log(a) / Math.log(base);
    }
}
