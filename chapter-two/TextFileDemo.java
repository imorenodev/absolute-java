import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextFileDemo 
{
  public static void main(String[] args) 
  {
    Scanner fileIn = null; // initialize to null so we can first check if file is valid
    try 
    {
      // Attemp to open file
      fileIn = new Scanner(new FileInputStream("player.txt"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found.");
      System.exit(0);
    }

    int highscore;
    String name;

    System.out.println("Text left to read? " + fileIn.hasNextLine());
    highscore = fileIn.nextInt();
    fileIn.nextLine(); // throw away \n character
    name = fileIn.nextLine();

    System.out.println("Name: " + name);
    System.out.println("High Score: " + highscore);
    System.out.println("Text left to read? " + fileIn.hasNextLine());
    fileIn.close();
  }
}
