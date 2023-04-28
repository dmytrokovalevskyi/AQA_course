public class Role {
    private final boolean viewAll;
    private final boolean editAll;
    private final boolean addAll;
    private final boolean deleteAll;
    private String role;

    public Role(String role) {
        this.role = role;
        switch (role) {
            case "Admin" -> {
                viewAll = true;
                editAll = true;
                addAll = true;
                deleteAll = true;
            }
            case "Main Customer" -> {
                viewAll = true;
                editAll = true;
                addAll = true;
                deleteAll = false;
            }
            case "Customer" -> {
                viewAll = true;
                editAll = false;
                addAll = true;
                deleteAll = false;
            }
            case "Viewer" -> {
                viewAll = true;
                editAll = false;
                addAll = false;
                deleteAll = false;
            }
            default -> {
                viewAll = true;
                editAll = false;
                addAll = false;
                deleteAll = false;
            }
        }
    }

    @Override
    public String toString() {
        return "Role{" +
                "role=" + role +
                ", viewAll=" + viewAll +
                ", editAll=" + editAll +
                ", addAll=" + addAll +
                ", deleteAll=" + deleteAll +
                '}';
    }
}