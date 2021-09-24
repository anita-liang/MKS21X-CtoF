// A) What should the functions have as parameter(s) ? What type should they be?
// Ans: For the parameters, I just put whatever is going to be converted for
// each respectively. I used double  bc the decimal points would
//allow for a more accurate conversion.

// B) What should the functions return?
// The functions should return the conversion.

public class CtoFTester {
  public static void main(String[] args){
    double first = 5; //test 1
    double second = 41; //test 2
    System.out.println(celsiusToFahrenheit(5));
    System.out.println(celsiusToFahrenheit(3));
    System.out.println(fahrenheitToCelsius(5));
    System.out.println(fahrenheitToCelsius(3));
}



  public static double celsiusToFahrenheit (double celcius){
    double fahrenheit =  ((1.8 * celcius) + 32);
    return fahrenheit;
  }

  public static double fahrenheitToCelsius (double fahrenheit){
    double celcius = (fahrenheit - 32) * 0.555555556;
    return celcius;
}
}
