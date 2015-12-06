
import java.util.Scanner;
/**
 *
 * @author systemzero
 */
public class Example8 {
    public static void main (String [] args ) {
        // Here we declared the scanner again because we love scanner you know.
        Scanner scan = new Scanner (System.in);
        
        // Here we need to enter a person's age and see if he/she is above 20
        // If he/she is above 30 you tell him/her "You are too old for this"
        // If he/she is not above 30 then do nothing
        
        System.out.print("Enter age: ");
        // Here we scan an input.
        /*
        But we have a problem, age is a number but the Scanner class does not support
        reading numbers from the console. the nextLine() function can only read a string
        how do we deal with this?
        */
        // Here we read the console.
        String stringValue = scan.nextLine();
        /*
        Because we can only get string values from the scanner we need
        to convert the string into number and here is how you do that.
        
        the code:
        Integer.parseInt([your string value]);
        returns the integer value from the string
        
        Now we have the exact value we need! a number assigned in
        the awesome variable we named age. now we can move on! yey!
        */
        int age = Integer.parseInt(stringValue);
        /*
        Here we check the age if it is greater than 30
        */
        if(age > 30){
            // This is executed if the check returns true or in short
            // if age is greater than 30
            System.out.println("You are too old for this");
        }
    }
}
