class Calculator {

    // add method with two integers
    int add(int a, int b) {
        return a + b;
    }

    // add method with three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // add method with two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 3 integers: " + calc.add(2, 3, 4));
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.5));
    }
}