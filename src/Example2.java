/**
 * @author systemzero
 * 
 * Welcome to Chapter 2 - The starting point (part 1)
 * In this chapter I will introduce you to the basic composition of a java
 * program, don't be afraid if you don't understand some of the code, I will
 * explain as much as I can but not to overload you with so much information
 */

/*
The code below is the class of the program, a class of the program should explain the
program's purpose. a good example of a class name are:
DatabaseAccess
InputReader
SocketServer
and the likes.

In our case, the class name is Example2. as you can also observe, the file name
is also the same as the class name. take note of that for every java class we
create will also have the same name as the file name.

The syntax of declaring a class is as follows
[visibility] class [class name/filename] {

}

take note of the open and close curly-brace [{] and [}], this indicates that
everything in between those curly-braces are the properties and methods of the
class.
*/
public class Example2 {
    /*
    This is the main method, this is where the java code starts executing,
    I just want to go strait to the point so please take NOTE
    You should memorize this code below because you are going to repeat this
    again and again. If you can't the don't worry. take it slow, you'll
    encounter this code again-and-again anyways.
    */
    public static void main (String [] args){
        /*
        Here are the statements inside the main method, the statements in
        between the open and close curly-braces are executed when the main
        method is executed.
        */
        
        // This line of code will only print "Hello World" on the console.
        // Nothing fancy but its a start.
        System.out.println("Hello World");
    }
}

/*
Congratulations you have just made your first java program.
Please do experiment on this.
*/












