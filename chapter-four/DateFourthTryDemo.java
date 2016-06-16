public class DateFourthTryDemo {
  public static void main(String[] args) {
    DateFourthTry date1 = new DateFourthTry();
    DateFourthTry date2 = new DateFourthTry();
    int year = 1987;
    date1.setDate(6, 17, year);
    date2.setDate(3, 1, year);
    date1.writeOutput();
    System.out.println(date1.fractionDone(5));
    date1.advanceYear(10);
    date1.writeOutput();
    if (date1.isBetween(1000, 2000)) {
      System.out.println("Not a millenial!");
    } else {
      System.out.println("You're a millenial!");
    }
    if (date1.precedes(date2)) {
      System.out.println("Date1 is before Date2.");
    } else {
      System.out.println("Date2 is before Date1.");
    }
  }
}
