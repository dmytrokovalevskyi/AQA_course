public class Manager extends User {
    private String position;
    private String responsibilityDistrict;
    private String workPhoneNumber;

    //constructors
    public Manager(String fullName, String email, RoleEnum role, String position) {
        super(fullName, email, role);
        this.position = position;
    }

    public Manager(String firstName, String lastName, String email, RoleEnum role, String position) {
        super(firstName, lastName, email, role);
        this.position = position;
    }

    //getters and setters

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResponsibilityDistrict() {
        return responsibilityDistrict;
    }

    public void setResponsibilityDistrict(String responsibilityDistrict) {
        this.responsibilityDistrict = responsibilityDistrict;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "position='" + position + '\'' +
                ", responsibilityDistrict='" + responsibilityDistrict + '\'' +
                ", workPhoneNumber='" + workPhoneNumber + '\'' +
                '}';
    }

    @Override
    public void printInfo() {
        System.out.println(super.toString() + this.toString());
    }
}
