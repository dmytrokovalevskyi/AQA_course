import java.util.ArrayList;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Address billingAddress;
    private Address deliveryAddress;
    private ArrayList<String> cards = new ArrayList<>();
    private Role role;
    private String manager;
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

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setCards(Card card) {
        cards.add(card.toString());
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

    public ArrayList<String> getCards() {
        return cards;
    }

    public Role getRole() {
        return role;
    }

    public String getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", cards=" + cards +
                ", role='" + role + '\'' +
                ", manager='" + manager + '\'' +
                '}';
    }

    public void printUserInfo() {
        System.out.println(toString());
    }

    // constructors:
    public User(String fullName, String email, String role) {
        this.fullName = fullName;
        String[] splittedName = fullName.split(" ");
        this.firstName = splittedName[0];
        this.lastName = splittedName[1];
        this.email = email;
        this.role = new Role(role);
        this.id = idCounter;
        idCounter += 1;
    }

    public User(String firstName, String lastName, String email, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = new Role(role);
        String space = " ";
        String firstNameWithSpace = firstName.concat(space);
        this.fullName = firstNameWithSpace.concat(lastName);
        this.id = idCounter;
        idCounter += 1;
    }
}
