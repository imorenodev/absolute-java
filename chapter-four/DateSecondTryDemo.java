public class DateSecondTryDemo {
  public static void main(String[] args) {
    DateSecondTry date1 = new DateSecondTry();
    date1.readInput();

    int dayNumber = date1.getDay(),
        nextYearNumber = date1.getNextYear();
    System.out.println("That is the " + dayNumber + "th day of the month, in the year " + nextYearNumber + ".");

    date1.happyGreeting();
  }
}
