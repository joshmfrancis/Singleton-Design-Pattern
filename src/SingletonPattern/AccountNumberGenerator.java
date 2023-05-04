/**
 * File: AccountNumberGenerator.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/04/2023
 * Java class description: Helper class to generate a random account number
 * using a random number generator. This helper class has methods that
 * are called in the main class, "Driver.java", but the constructor is not
 * called directly, as it would break the rules of Singleton Design Pattern.
 * This project was made as a demonstration for the Singleton Design Pattern.
 */

// Package
package SingletonPattern;

/**
 * Helper Class
 * @author josh
 */
public class AccountNumberGenerator
{

    ///////////////////////
    // Private Variables //
    ///////////////////////

    // Holds the instance of this class - Only one - Initializes to null
    private static AccountNumberGenerator instance;

    // Initilizes to null
    private int number;

    /////////////////
    // Constructor //
    /////////////////

    /**
     * Private - Cannot be accessed by Driver class directly,
     * only through the getInstance() Method
     */
    private AccountNumberGenerator()
    {
        number = 0;
    }

    /////////////
    // Methods //
    /////////////

    /**
     * Generated the next random number - This method is synchronized
     * Sets the global private variable to the random number
     * Used for generating in the main class, "Driver.java"
     */
    public synchronized void generateNextNumber()
    {
        number = (int) (Math.random() * 1000);
    }

    /**
     * Creates a new instance if there is not already
     * another instance of AccountNumberGenerator
     * BONUS: This project uses lazy instantiation!
     * @return instance
     */
    public static AccountNumberGenerator getInstance()
    {
        if (instance == null)
        {
            instance = new AccountNumberGenerator();
        }
        return instance;
    }

    /**
     * Returns the number as an int
     * Used for printing to the console in the main class, "Driver.java"
     * @return number
     */
    public int getNextNumber()
    {
        return number;
    }

}