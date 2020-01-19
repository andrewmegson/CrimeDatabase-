
import java.util.Scanner;

/**
 * InputReader takes a string input from the console, and has a method to return a formatted version of the string for comparisons.
 * 
 * @author     Andrew Megson
 * @version    08/11/18
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Creates an input reader than provides text input to the console
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Reads a line of text from text terminal and return it as a formatted string (trimmed, lowercase)
     *
     * @return  A string formatted so it is trimmed and in lowercase
     */
    public String getInput() 
    {
        System.out.print("> ");                // print prompt
        String inputLine = reader.nextLine().trim().toLowerCase();

       return inputLine;
    }
}
