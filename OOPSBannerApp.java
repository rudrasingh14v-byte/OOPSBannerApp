/**
 * This class demonstrates a simple Java application that displays the object
 * Oriented Programming System oops acronym to the console.
 * @author Rudra Singh
 * @version 1.3
 */

public class OOPSBannerApp {
    public static void main(String args[]) {
        String[] lines = {
        String.join(" ", "   ***     ", "   ***.    ", "******   ", "   *****    "),
        String.join(" ", " **    **  ", " **    **  ", "**    ** ", " **    **   "),
        String.join(" ", "**      ** ", "**      ** ", "**    ** ", "**          "),
        String.join(" ", "**      ** ", "**      ** ", "**   **  ", " ******     "),
        String.join(" ", "**      ** ", "**      ** ", "** **    ", "       **   "),
        String.join(" ", " **    **  ", " **    **  ", "**       ", " **     **  "),
        String.join(" ", "   ***     ", "   ***     ", "**       ", "   *****    "),
        };
    for(String print : lines)
        {
            System.out.println(print);
        }        
    }
}