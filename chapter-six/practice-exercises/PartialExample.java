import java.util.Scanner;

public class PartialExample {
  public static final int MAX_NUMBER_SCORES = 10;
  public static double[] scores = new double[MAX_NUMBER_SCORES];
  public static int numberUsed = 0;

  /**
    Shows differences between each of a list of golf scores and their average.
  */
  public static void main(String[] args) {
    System.out.println("This program reads golf scores and shows");
    System.out.println("how much each differs from the average.");
    System.out.println("Enter golf scores:");

    numberUsed = fillArray();
    showDifference();
    differenceArray(5);
  }

  /**
    Precondition: numberUsed <= scores.length
                  the first numberUsed indexed variables of scores have values.
                  Returns an array of length numberUsed whose ith element is scores[i] - adjustment.
  */
  public static double[] differenceArray(double adjustment) {
    double[] tempArray = new double[numberUsed];

    if (numberUsed <= scores.length) {
      for (int i = 0; i < numberUsed; i++) {
        if (scores[i] < 0) { 
          System.out.println("Error: scores[" + i + "] has no value");
          System.exit(0);
        }
        tempArray[i] = (scores[i] - adjustment);
      }
    } else {
      System.out.println("Error: !numberUsed <= scores.length");
      System.exit(0);
    }

    return tempArray;
  }

  /**
    Reads values into the array scores. Returns the number of values placed in the array scores.
  */
  public static int fillArray() {
    System.out.println("Enter up to " + scores.length + " nonnegative numbers.");
    System.out.println("Mark the end of the list with a negative number.");

    Scanner keyboard = new Scanner(System.in);
    double next;
    int index = 0;
    next = keyboard.nextDouble();

    while ((next >= 0) && (index < scores.length)) {
      scores[index] = next;
      index++;
      next = keyboard.nextDouble();
      // index is the number of array indexed variables used so far.
    }

    // index is the total number of array indexed variables used.
    if (next >= 0) {
      System.out.println("Could only read in " + scores.length + " input values.");
    }
    
    return index;
  }

  /**
    Precondition: numberUsed <= scores.length.
                  scores[0] through scores[numberUsed-1] have values.
    Returns the average of numbers scores[0] through scores[numberUsed-1].
  */
  public static double computeAverage() {
    double total = 0;
    
    for (int index = 0; index < numberUsed; index++) {
      total = total + scores[index];
    }

    if (numberUsed > 0) {
      return (total / numberUsed);
    } else {
      System.out.println("ERROR: Trying to average 0 numbers.");
      System.out.println("computeAverage returns 0.");
      return 0;
    }
  }

  /**
    Precondition: numberUsed <= scores.length.
                  The first numberUsed indexed variables of scores have values.
    Postcondition: Gives screen output showing how much each of the first
    numberUsed elements of the array scores differ from their average.
  */
  public static void showDifference() {
    double average = computeAverage();
    System.out.println("Average of the " + numberUsed + " scores = " + average);

    System.out.println("The scores are:");

    for (int index = 0; index < numberUsed; index++) {
      System.out.println(scores[index] + " differs from average by " + (scores[index] - average));
    }
  }
}
