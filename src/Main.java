import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Please enter number for Task 1: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 0) {
            System.out.println("Error: number is negative.");
        }
        else if (number == 0) {
            System.out.println("Your number is 0, so there is nothing to print.");
        }
        else {
            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i != 0) {
                    System.out.println("The number is multiple to 3");
                    continue;
                } else if (i % 2 == 0 && i != 0) {
                    System.out.println(i + " - the number is even");
                    continue;
                }
                System.out.println(i);
            }
        }

        // Task 2
        System.out.println("Please enter number for Task 2: ");
        int number2 = scan.nextInt();
        if (number2 == 0) {
            System.out.println("Factorial of 0 is equal to 1");
        }
        else if (number2 < 0) {
            System.out.println("Stop! You're trying to get into the dark side of mathematics. Relax and enter a positive number.");
        }
        else {
            int result = number2;
            for (int i = 1; i < number2; i++) {
                result = result * i;
            }
            System.out.println("The factorial of number " + number2 + " is equal to " + result);
        }

        // Task 3
        System.out.println("Please enter number for Task 3: ");
        int number3 = scan.nextInt();
        if (number3 == 0) {
            System.out.println("Division by zero...");
        }
        else if (number3 < 0) {
            for (int largerDivisor = number3 + 1;  largerDivisor < 0; largerDivisor++) {
                if (number3 % largerDivisor == 0) {
                    System.out.println("Larger divisor for " + number3 + " is equal to " + largerDivisor);
                    break;
                }
            }
        }
        else {
            for (int largerDivisor = number3 - 1;  largerDivisor > 0; largerDivisor--) {
                if (number3 % largerDivisor == 0) {
                    System.out.println("Larger divisor for " + number3 + " is equal to " + largerDivisor);
                    break;
                }
            }
        }

        // Task 4
        System.out.println("Please age for Task 4: ");
        int age = scan.nextInt();
        while (true) {
            if (age <= 0 || age > 140) {
                System.out.println("Wrong age. Try again:");
                age = scan.nextInt();
            }
            else {
                System.out.println("Cool. Your age is valid.");
                break;
            }
        }

    }
}