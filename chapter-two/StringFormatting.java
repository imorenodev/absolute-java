public class StringFormatting 
{
  public static void main(String[] args) 
  {
    String aString = "Jelly beans";
    double d = 123.1234567890;

    System.out.println("START1234567890");
    System.out.printf("START%sEND %n %9.4f %n", aString, d);
  }
}
