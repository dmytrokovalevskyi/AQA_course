public class Parent {

    {
        System.out.println("This is message from initialization block");
    }

    static {
        System.out.println("This is message from static initialization block");
    }

    public Parent(String constructorMessage) {
        System.out.println(constructorMessage);
    }
}
