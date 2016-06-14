public class DateFirstTryDemo {
  public static void main(String[] args) {
    DateFirstTry date1, date2;
    date1 = new DateFirstTry();
    date2 = new DateFirstTry();

    date1.month = "April";
    date1.day = 20;
    date1.year = 1987;
    date1.writeOutput();

    date2.month = "May";
    date2.day = 31;
    date2.year = 1988;
    date2.yellIfNewYear();
    date2.makeItNewYears();
    date2.yellIfNewYear();
  }
}
