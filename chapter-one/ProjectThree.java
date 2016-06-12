/* 
   Print your name in pig latin. 
*/

public class ProjectThree 
{
  public static void main(String[] args)
  {
    String first = "ian",
           last = "moreno";
    System.out.println(first.substring(1,2).toUpperCase() + first.substring(2) + first.substring(0,1) + "ay " + last.substring(1,2).toUpperCase() + last.substring(2) + last.substring(0,1) + "ay");
  }
}
