import java.util.Scanner;

public class StringProcessor {
  public static void main(String[] args) {
    System.out.println("Enter a one line sentence:");
    Scanner keyboard = new Scanner(System.in);
    String sentence = keyboard.nextLine();

    sentence = sentence.toLowerCase();
    char firstCharacter = sentence.charAt(0);
    // assign variable sentence to reference a new string object that concatenates
    // the first char of the string object originally referenced by sentence and
    // the substring of the remaining string object originally referenced by sentence
    // starting after the first character 
    sentence = Character.toUpperCase(firstCharacter) + sentence.substring(1);

    System.out.println("The revised sentence is:");
    System.out.println(sentence);
  }
}
