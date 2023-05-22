import java.io.IOException;

public class Child extends Parent {

    public Child(String constructorMessage) throws IOException {
        super(constructorMessage);
        fw.write("\n" + constructorMessage + " message from Child constructor");
    }

    {
        System.out.println("This is message from Child initialization block");
        fw.write("\n message from Child init block");
    }

    static {
        System.out.println("This is message from Child static initializaion block");
        try {
            fw.write("\n message from Child static init block");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
