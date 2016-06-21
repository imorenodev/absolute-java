import java.util.Scanner;
import java.util.StringTokenizer;
 
public class FractionDemo {
  public static void main(String[] args) {
    int numerator;
    int denominator;
    String fractionInput = "";
    Fraction fraction1 = null;
    Fraction fraction2 = null;
    Scanner keyboard = new Scanner(System.in);
    StringTokenizer fractionFactory;

    while(true) {
      System.out.println("Enter a new fraction in the format numerator/denominator. (0 to quit):");

      fractionInput = keyboard.nextLine();
      fractionFactory = new StringTokenizer(fractionInput, "/ ");

      if (fractionFactory.countTokens() == 1) {
        System.out.println("Exiting program.");
        System.exit(0);
      } else if (fractionFactory.countTokens() == 2) {
        numerator = Integer.parseInt(fractionFactory.nextToken());
        denominator = Integer.parseInt(fractionFactory.nextToken());

        if (denominator == 0) {
          System.out.println("Error cannot divide by zero");
          System.exit(0);
        }

        fraction1 = new Fraction(numerator, denominator);
        System.out.println("Fraction 1: " + fraction1.getFraction());
      } 

      System.out.println("Enter a second fraction to compare to first fraction (0 to quit):");

      fractionInput = keyboard.nextLine();
      fractionFactory = new StringTokenizer(fractionInput, "/ ");

      if (fractionFactory.countTokens() == 1) {
        System.out.println("Exiting program.");
        System.exit(0);
      } else if (fractionFactory.countTokens() == 2) {
        numerator = Integer.parseInt(fractionFactory.nextToken());
        denominator = Integer.parseInt(fractionFactory.nextToken());

        if (denominator == 0) {
          System.out.println("Error cannot divide by zero");
          System.exit(0);
        }

        System.out.println("Fraction 1 == Fraction 2: " + fraction1.equals(new Fraction(numerator, denominator)));
      } 
    }
  }
}
