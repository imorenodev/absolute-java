public class ProjectFive 
{
  public static final String phrase = "I hate you";

  public static void main(String[] args) 
  {
    int firstIndex= phrase.indexOf("hate");

    System.out.println(phrase.substring(0,firstIndex) + "love" + phrase.substring(firstIndex + "hate".length()));
  }
}
