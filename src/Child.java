public class Child extends Parent {

    public Child(String constructorMessage) {
        super(constructorMessage);
    }

    {
        System.out.println("This is message from Child initialization block");
    }

    static {
        System.out.println("This is message from Child static initializaion block");
    }
}
