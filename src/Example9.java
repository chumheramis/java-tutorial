
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author systemzero
 */
public class Example9 {
    public static Scanner scan = new Scanner (System.in);
    
    public static String readString(String message){
        System.out.print(message);
        return scan.nextLine();
    }
    public static int readInt(String message){
        String input = readString(message);
        return Integer.parseInt(input);
    }
    public static void main (String [] args ) {
        // Here we declared the scanner again.
        
        
        // Here we need to enter a person's age and see if he/she is above 30
        // If he/she is above 30 you tell him/her "You are too old for this"
        // If he/she is not above 30 you tell him/her "You are not old too old for this"
        
        int age = readInt("Enter Age: ");
        /*
        Here we check the age if it is greater than 30
        */
        if(age > 30){
            // This is executed if the check returns true or in short
            // if age is greater than 30
            System.out.println("You are too old for this");
        }else{
            // This is executed if the check returns false or in short
            // if age is not greater than 30
            System.out.println("You are not old for this");
        }
    }
}
/*
Switch
3 loops
array -1 dimesnsion
array -2 dimension
object oriented basic
OOP - inhiritance
OOP - overloading

*/