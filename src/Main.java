import exceptions.CardFormatInvalidException;

public class Main {
    public static void main(String[] args) throws CardFormatInvalidException {
        User kolyan = new User("kolyan", "petrov", "petrov.kolya@airslate.com", "Viewer");
        kolyan.setCards(new Card("1234 5678 9000 3211", "11/24", 321, "Visa"));
        kolyan.setBillingAddress(new Address("Ukraine", "Dnipro", "Sholohova", "29", "49080"));
        kolyan.printUserInfo();
        Manager stepan = new Manager("Stepan Kozlov", "stepan.kozlow@pdffiller.team", "Admin", "BIG boss");
        stepan.setWorkPhoneNumber("+38096 777 12 12");
        stepan.printUserInfo();
        User ihor = new User("Ihor Rabotyagin", "ihor.rabotau.za.vseh@signnow.com", "not existing role");
        ihor.setCards(new Card("1234 5678 1212 1212", "11/23", 766, "not visa not mastercard"));
        System.out.println(ihor.getCards());
    }
}