public class Role {
    private final boolean viewAll;
    private final boolean editAll;
    private final boolean addAll;
    private final boolean deleteAll;
    private RoleEnum role;

    public Role(RoleEnum role) {
        this.role = role;
        switch (role) {
            case ADMIN -> {
                viewAll = true;
                editAll = true;
                addAll = true;
                deleteAll = true;
            }
            case MAIN_CUSTOMER -> {
                viewAll = true;
                editAll = true;
                addAll = true;
                deleteAll = false;
            }
            case CUSTOMER -> {
                viewAll = true;
                editAll = false;
                addAll = true;
                deleteAll = false;
            }
            case VIEWER -> {
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