import java.util.Scanner;
/**
 *
 * @author systemzero
 * Welcome to chapter 10 of java programming tutorials
 * Here we created a grading system for collage.
 * It asks for a grade input from the console then
 * It checks the input grade
 * If grade is 1
 *      display "You did excellent!"
 * If grade is 2
 *      display "You did great!"
 * if grade is 3
 *      display "You passed"
 * if grade is 4
 *      display "You failed"
 * if grade is 5
 *      display "You failed so bad"
 */
public class Example10 {
    private static Scanner scan = new Scanner(System.in);
    public static void main (String [] args){
        // Here we output a notice to the user to input a grade from 1 to 5
        System.out.print("Enter grade (1-5): ");
        // Here we ask for input from the user.
        /** Notice
         * the conversion code and the console reading lines are combined.
         * Yes you can do this. pretty awesome huh?
         */
        int grade = Integer.parseInt(scan.nextLine());
        switch(grade){
            case 1:
                System.out.println("You did excellent!");
                break;
            case 2:
                System.out.println("You did great!");
                break;
            case 3:
                System.out.println("You passed");
                break;
            case 4:
                System.out.println("You failed");
                break;
            case 5:
                System.out.println("You failed basd");
                break;
            default:
                System.out.println("Input invalid");
        }
    }
}
