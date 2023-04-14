import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence for Task 1 please: ");
        String sentence = scan.nextLine();
        String sentenceWithoutSpaces = sentence.replace(" ", "");
        String sentenceUpperCase = sentenceWithoutSpaces.toUpperCase();
        char[] sentenceArray = sentenceUpperCase.toCharArray();
        for (char c: sentenceArray) {
            System.out.println(c);
        }

        // Task 2
        System.out.println("Enter your sentence for Task 2 please: ");
        String sentence2 = scan.nextLine();
        char[] sentence2Array = sentence2.toCharArray();
        String[] splittedSentence2 = sentence2.split(" ");
        if (sentence2.contains("java")) {
            char[] revertedArray = new char[sentence2Array.length];
            int j = 0;
            for (int i = sentence2Array.length-1; i >= 0; i--) {
                revertedArray[j] = sentence2Array[i];
                j++;
            }
            System.out.println(revertedArray);
        }
        else {
            for (int i = 0; i < splittedSentence2.length; i++) {
                    if (i % 2 == 0) {
                        System.out.print(splittedSentence2[i].toUpperCase() + " ");
                    }
                    else {
                        System.out.print(splittedSentence2[i] + " ");
                    }
            }
            System.out.println("");
        }

        // Task 3
        System.out.println("Enter your sentence for Task 3 please: ");
        String sentence3 = scan.nextLine();
        System.out.println("Enter symbol that must be counted: ");
        String countedSymbol = scan.nextLine();
        int counter = 0;
        for (int i = 0; i < sentence3.length(); i++ ) {
            String symbol = sentence3.substring(i, i+1);
            if (symbol.equals(countedSymbol)) {
                counter++;
            }
        }
        System.out.println("Number of symbol '" + countedSymbol + "' in entered sentence equals " + counter);

        // Task 4
        System.out.println("Enter your sentence for Task 4 please: ");
        String sentence4 = scan.nextLine();
        String space = " ";
        int j = 0;
        for (int i = 0; i < sentence4.length(); i++ ) {
            String symbol = sentence4.substring(i, i + 1);
            String previousSymbol = sentence4.substring(j, j + 1);
            if (symbol.equals(symbol.toUpperCase()) && !previousSymbol.equals(space) && !previousSymbol.equals(symbol) && !symbol.equals(space)) {
                symbol = space.concat(symbol);
                System.out.print(symbol);
            }
            else {
                System.out.print(symbol);
            }
            if (j != i) {
                j++;
            }
        }
    }
}