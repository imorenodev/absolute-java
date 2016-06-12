public class ProjectSeven 
{
  public static void main(String[] args)
  {
    int totalSeconds = 50391,
        hours = totalSeconds / 60 / 60,
        minutes = totalSeconds / 60 % 60,
        seconds = totalSeconds % 60 % 60;

    System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds.");
  }
}
