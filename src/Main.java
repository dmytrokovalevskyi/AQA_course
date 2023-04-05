import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Enter number for Task 1, please:");
        Scanner scan = new Scanner(System.in);
        int numberOne = scan.nextInt();
        if (numberOne == 0) {
            System.out.println("Number is equal to 0");
        }
        else if (numberOne > 10) {
            System.out.println("Number is bigger than 10");
        }
        else if (numberOne < 10) {
            System.out.println("Number is less than 10");
        }
        else {
            System.out.println("This case is not described in the task, but your number is equal to 10.");
        }

        // Task 2
        System.out.println("Enter number for Task 2, please:");
        double numberTwo = scan.nextDouble();
        if (numberTwo == 0) {
            System.out.println("Your number is ZERO");
        }
        else if (numberTwo % 2 == 0) {
            System.out.println("Your number is even");
        }
        else {
            System.out.println("Your number is odd");
        }

        // Task 3
        System.out.println("Enter number for Task 3, please:");
        float numberThree = scan.nextFloat();
        if ((numberThree % 2 == 0 && numberThree > 10) || numberThree == 15) {
            System.out.println("First message");
        }
        else {
            System.out.println("Second message");
        }
    }
}