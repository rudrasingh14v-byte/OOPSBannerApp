/**
 * This class demonstrates a simple Java application that displays the object
 * Oriented Programming System oops acronym to the console.
 * @author Rudra Singh
 * @version 1.1
 */

public class OOPSBannerApp {
    public static void main(String args[]) {
        String[] lines = new String[7];
        lines[0]=String.join(" ", "   ***     ", "   ***.    ", "******   ", "   *****    ");
        lines[1]=String.join(" ", " **    **  ", " **    **  ", "**    ** ", " **    **   ");
        lines[2]=String.join(" ", "**      ** ", "**      ** ", "**    ** ", "**          ");
        lines[3]=String.join(" ", "**      ** ", "**      ** ", "**   **  ", " ******     ");
        lines[4]=String.join(" ", "**      ** ", "**      ** ", "** **    ", "       **   ");
        lines[5]=String.join(" ", " **    **  ", " **    **  ", "**       ", " **     **  ");
        lines[6]=String.join(" ", "   ***     ", "   ***     ", "**       ", "   *****    ");

    for(String print : lines)
        {
            System.out.println(print);
        }        
    }
}