
import java.util.Scanner;

/**
 *
 * @author systemzero
 */
public class Example7 {

    public static void main(String[] args) {
        // This is a built-in class from java, this class is usually used for console input.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // Here we scanned the console input and assign it to the variable we declared [name]
        String name = scan.nextLine();
        System.out.println("Hello " + name);
    }
}
