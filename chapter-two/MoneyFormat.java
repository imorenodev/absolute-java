import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;

public class MoneyFormat 
{
  public static void main(String[] args) 
  {
    NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();

    System.out.println(moneyFormatter.format(1.9864));

    DecimalFormat formatDouble = new DecimalFormat("00000.000");
    System.out.println(formatDouble.format(49.234234234));

    DecimalFormat eNotation1 = new DecimalFormat("0.###E0");
    System.out.println(eNotation1.format(0.001232435));
  }
}
