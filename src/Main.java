import java.util.Scanner;

public class Main {
    static void addition() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void subtraction() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void multiplication() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void division() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter 0 as a divisor.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base value :");
        int base = scan.nextInt();
        System.out.print("Enter the exponent value :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void modulus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to be divided: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the divisor: ");
        int num2 = scan.nextInt();
        int mod = num1 % num2;
        System.out.println("Modulus: " + mod);
    }

    static void rectangleAreaPerimeter() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scan.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scan.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        do {
            System.out.println("1- Addition\n"
                    + "2- Subtraction\n"
                    + "3- Multiplication\n"
                    + "4- Division\n"
                    + "5- Exponential number calculation\n"
                    + "6- Factorial calculation\n"
                    + "7- Modulus\n"
                    + "8- Rectangle area and perimeter calculation\n"
                    + "0- Exit");
            System.out.print("Please select an operation :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulus();
                    break;
                case 8:
                    rectangleAreaPerimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered an incorrect value, please try again.");
            }
        } while (select != 0);

    }
}
