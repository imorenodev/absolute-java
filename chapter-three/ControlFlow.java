import java.util.Scanner;

public class ControlFlow {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a number between 1-4:");
    int myVariable = keyboard.nextInt();

    switch (myVariable) {
      case 1:
        System.out.println("You made it to the first case statement!");
        break;
      case 2:
        System.out.println("You made it to the second case statement!");
        break;
      case 3:
        System.out.println("You made it to the third case statement!");
        break;
      case 4:
        System.out.println("You made it to the fourth case statement!");
        break;
      default:
        System.out.println("Default case");
        break;
    }
  }
}
