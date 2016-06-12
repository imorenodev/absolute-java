public class ProjectEight 
{
  public static final double DISTANCE = 6.21;

  public static void main(String[] args) 
  {
    double time,
           pace;

    System.out.println("This program calculates your pace given a time and distance travelled.");

    time = 25.5;
    pace = time / DISTANCE;

    System.out.println("Your pace is " + pace + " miles per hour.");
  }
}
