import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final String USERS_FILE = "users.csv";
    public static Scanner scanner;
    public static void main(String[] args) throws IOException {
        User kolyan = new User("kolyan", "petrov", "petrov.kolya@airslate.com", RoleEnum.VIEWER);
        kolyan.setCards(new Card("1234 5678 9000 3211", "11/24", 321, CardTypeEnum.VISA));
        kolyan.setBillingAddress(new Address("Ukraine", "Dnipro", "Sholohova", "29", "49080"));
        kolyan.printInfo();
        Manager stepan = new Manager("Stepan Kozlov", "stepan.kozlow@pdffiller.team", RoleEnum.ADMIN, "BIG boss");
        stepan.setWorkPhoneNumber("+38096 777 12 12");
        stepan.printInfo();
        User ihor = new User("Ihor Rabotyagin", "ihor.rabotau.za.vseh@signnow.com", RoleEnum.CUSTOMER);
        ihor.setCards(new Card("1234 5678 1212 1212", "11/23", 766, CardTypeEnum.MASTERCARD));
        System.out.println(ihor.getCards());
        ihor.printCards();

        //step 5
        Scanner scan = new Scanner(System.in);
        FileWriter fw = new FileWriter(USERS_FILE, true);
        FileReader fr = new FileReader(USERS_FILE);
        Scanner scanFR = new Scanner(fr);
        RoleEnum role = null;

        while (true) {
            System.out.println("Do you want to add new user or print existing users? Print '1' to create new, or print '2' to print existing. To exit program print 'exit'.");
            switch (scan.nextLine()) {
                case ("1") -> {
                    boolean isValidInput = false;
                    System.out.println("Enter User's first name");
                    String firstName = scan.nextLine();
                    System.out.println("Enter User's last name");
                    String lastName = scan.nextLine();
                    System.out.println("Enter User's email");
                    String email = scan.nextLine();
                    System.out.println("Enter User's role. Possible roles: ADMIN, MAIN_CUSTOMER, CUSTOMER, VIEWER");
                    while (!isValidInput) {
                        try {
                            role = RoleEnum.valueOf(scan.nextLine());
                            isValidInput = true;
                        } catch (Exception e) {
                            System.out.println("Invalid input. Possible roles: ADMIN, MAIN_CUSTOMER, CUSTOMER, VIEWER");
                        }
                    }
                    User newUser = new User(firstName, lastName, email, role);
                    try {
                        fw = new FileWriter(USERS_FILE, true);
                        fw.append(String.valueOf(newUser)).append("\n");
                        System.out.println("User successfully added!");
                        fw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                case ("2") -> {
                    try {
                        fr = new FileReader(USERS_FILE);
                        scanner = new Scanner(fr);
                        while (scanner.hasNextLine()){
                            System.out.println(scanner.nextLine());
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } finally {
                        fr.close();
                        scanner.close();
                    }
                }
                case ("exit") -> {
                    fr.close();
                    fw.close();
                    return;
                }
                default -> System.out.println("Invalid input. Please print 1 or 2. To exit program please print 'exit'.");
            }
        }
    }
}