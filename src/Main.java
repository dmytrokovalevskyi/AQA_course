import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Provide length of first side of triangle, please:");
        Scanner scan = new Scanner(System.in);
        int sideA = scan.nextInt();
        System.out.println("Provide length of second side of triangle, please:");
        int sideB = scan.nextInt();
        System.out.println("Provide length of third side of triangle, please:");
        int sideC = scan.nextInt();

        //check if triangle is possible
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            System.out.println("Triangle is NOT possible.");
            return;
        }
        else {
            System.out.println("Triangle is possible.");
        }
        int p = (sideA + sideB + sideC) / 2;
        int triangleSquare = (int) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        System.out.println("Square of triangle equals " + triangleSquare);

        // Task 2
        int secondTask = 15;
        System.out.println("Initial value: " + secondTask);
        System.out.println("Post-increment operation: " + secondTask++);
        System.out.println("Post-increment value after: " + secondTask);
        System.out.println("Pre-increment operation: " + ++secondTask);
        System.out.println("Value after pre-increment: " + secondTask);
        System.out.println("Post-decrement operation: " + secondTask--);
        System.out.println("Value after post-decrement: " + secondTask);
        System.out.println("Pre-decrement operation: " + --secondTask);
        System.out.println("Value after pre-decrement: " + secondTask);
    }
}