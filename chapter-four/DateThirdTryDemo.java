public class DateThirdTryDemo {
  public static void main(String[] args) {
    DateThirdTry date1 = new DateThirdTry();
    int year = 1987;
    date1.setDate(6, 17, year);
    date1.writeOutput();
    System.out.println(date1.fractionDone(5));
    date1.advanceYear(10);
    date1.writeOutput();
    if (date1.isBetween(1000, 2000)) {
      System.out.println("Not a millenial!");
    } else {
      System.out.println("You're a millenial!");
    }
  }
}
