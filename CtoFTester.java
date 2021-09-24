// A) What should the functions have as parameter(s) ? What type should they be?
// Ans: For the parameters, I just put whatever is going to be converted for
// each respectively. I used float bc the decimal points would
//allow for a more accurate conversion.

// B) What should the functions return?
// The functions should return the conversion.
import java.util.Scanner;
public class CtoFTester{
  public static void main (String args []) {
    double celcius;
    double fahrenheit;
    Scanner in = new Scanner(System.in);
    System.out.println("Converting Celcius to Fahrenheit:");
    celcius = in.nextDouble();
    fahrenheit = ((1.8 * celcius) + 32);
    System.out.println("Conversion: "+fahrenheit);
  }
}