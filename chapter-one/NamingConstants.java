public class NamingConstants
{
  public static final double INTEREST_RATE = 2.5;
  public static final int ANSWER = 42;

  public static void main(String[] args)
  {
    double  balance = 100;
    double interest; // as a percent
    interest = balance * (INTEREST_RATE / 100.0);

    System.out.print("On a balance of $" + balance);
    System.out.print(" you will earn interest of $" + interest);
    System.out.print(" all in just one short year.\n");
    System.out.println("The answer is: " + ANSWER); 
  }
}

