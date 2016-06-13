import java.util.Scanner;

public class ScannerExercises
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter a single word as input: ");
    String w = keyboard.next();
    System.out.println("You entered: " + w);

    System.out.print("Enter a number: ");
    int firstInt = keyboard.nextInt();
    System.out.print("Enter another number: ");
    int secondInt = keyboard.nextInt();
    int total = firstInt + secondInt;
    System.out.println(firstInt + " " + secondInt + " " + total);

    System.out.println("Enter your age: ");
    int age = keyboard.nextInt();
    keyboard.nextLine(); // need to read and throw away \n from previous line
    System.out.println("Enter your name.");
    String name = keyboard.nextLine();
    System.out.println(name + ", you are " + age + " years old.");
  }
}
