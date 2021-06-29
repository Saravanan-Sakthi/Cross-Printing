/*
This program prints the given string in cross pattern
Sample in: PROGRAM
Sample out:  P     M
              R   A
               O R
                G
               O R
              R   A
            P      M
*/
package string.CrossPrinting;
import java.util.Scanner;
public class Test {
    public static void main(String []abc){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the string");
        String a= s.nextLine();
        new CrossPrint().start(a);
    }
}
