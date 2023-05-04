/**
 * File: Driver.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/04/2023
 * Java class description: Driver class to display a random account number to
 * the user from the console. This is achieved with help from the helper class,
 * "AccountNumberGenerator.java".
 * This project was made as a demonstration for the Singleton Design Pattern.
 */

// Package
package SingletonPattern;

/**
 * Main Class
 * @author josh
 */
public class Driver
{

    /**
     * Main Method
     * Prints the user's account number to the console
     * @param args
     */
    public static void main(String[] args)
    {

        // "Copy" proves single instance of Class

        // AccountNumberGenerator Class is only accessable from the .getInstance() Method.
        AccountNumberGenerator generate = AccountNumberGenerator.getInstance();
        AccountNumberGenerator generateCopy = AccountNumberGenerator.getInstance();

        // Generates the next random number for the accounts using the .generateNextNumber() Method
        generate.generateNextNumber();
        generateCopy.generateNextNumber();

        // Print out for the user using the .getNextNumber() Method
        System.out.println("Your account number is: " + generate.getNextNumber());
        System.out.println("Your account number copy is: " + generateCopy.getNextNumber());

    }

}