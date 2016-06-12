public class FirstProgram 
{
  public static void main(String[] args) 
  {
    double celsius = 20;
    double fahrenheit;
    /* Same as typecasting:
    *  fahrenheit = (9 / (double)5) * celsius + 32.0;
    */
    fahrenheit = (9 / 5.0) * celsius + 32.0;
    System.out.println(fahrenheit);
  }
}
