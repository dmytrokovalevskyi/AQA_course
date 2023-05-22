import java.io.FileWriter;
import java.io.IOException;

public class Parent {
    static FileWriter fw;

    static {
        try {
            fw = new FileWriter("Readme.md");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    {
        System.out.println("This is message from initialization block");
        fw.write("\nThis is message from initialization block" + "this is from Parent class");
    }

    static {
        System.out.println("This is message from static initialization block");
        try {
            fw.write("\nMessage from parent static initialization block");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Parent(String constructorMessage) throws IOException {
        System.out.println(constructorMessage);
        fw.write("\n" + constructorMessage + " message from parent constructor");
    }
}
