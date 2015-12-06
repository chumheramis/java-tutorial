/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import java.util.Scanner;

/**
 *
 * @author systemzero
 */
public class ConsoleReader {
    private Scanner scan = new Scanner (System.in);
    
    public String readString(String message){
        System.out.print(message);
        return scan.nextLine();
    }
    public char readChar(String message){
        String input = readString(message);
        return input.charAt(0);
    }
    public int readInt(String message){
        String input = readString(message);
        return Integer.parseInt(input);
    }
    public double readDouble(String message){
        String input = readString (message);
        return Double.parseDouble(input);
    }
    public boolean readBoolean(String message){
        String input = readString(message);
        return Boolean.parseBoolean(input);
    }    
}

class test {
    public static void main (String [] args){
        ConsoleReader reader = new ConsoleReader();
        
        String name = reader.readString("Enter Name: ");
        String address = reader.readString ("Enter Address: ");
        int age = reader.readInt("Enter Age: ");
        
    }
}



















