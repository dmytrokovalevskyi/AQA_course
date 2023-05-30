public class Main {
    public static void main(String[] args) {
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
    }
}