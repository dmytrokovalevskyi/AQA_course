import java.util.ArrayList;

public class User implements PrintInfo {
    private int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Address billingAddress;
    private Address deliveryAddress;
    private ArrayList<Card> cards = new ArrayList<>();
    private Role role;
    private Manager manager;
    protected static int idCounter = 1;

    //setters
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            this.phoneNumber = phoneNumber;
        }
        else {
            System.out.println("Phone number must start with '+'");
        }
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setCards(Card card) {
        cards.add(card);
    }

    //getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Role getRole() {
        return role;
    }

    public Manager getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "User{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public void printInfo() {
        System.out.println(toString());
    }

    // constructors:
    public User(String fullName, String email, RoleEnum role) {
        this.fullName = fullName;
        String[] splittedName = fullName.split(" ");
        this.firstName = splittedName[0];
        this.lastName = splittedName[1];
        this.email = email;
        this.role = new Role(role);
        this.id = idCounter;
        idCounter += 1;
    }

    public User(String firstName, String lastName, String email, RoleEnum role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = new Role(role);
        this.fullName = firstName.concat(" ").concat(lastName);
        this.id = idCounter;
        idCounter += 1;
    }

    public void printCards() {
        cards.forEach(System.out::println);
    }
}
