public class ProjectTwo 
{
  public static void main(String[] args)
  {
    int coupons = 47,
        candyBars = 47 / 10,
        gumballs = (47 % 10) / 3;
    System.out.println("You can redeem " + coupons + " coupons for " + candyBars + " candy bars and " + gumballs + " gumballs.");
  }
}
