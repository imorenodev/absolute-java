public class DateFirstTry {
  public String month;
  public int day;
  public int year;

  /* the word void states that this method performs an action
     rather than producing a value (no return statement) */
  public void writeOutput() {
    System.out.println(month + " " + day + " " + year);
  }
  
  public void makeItNewYears() {
    month = "January";
    day = 1;
  }

  public void yellIfNewYear() {
    if ((month == "January") && (day == 1)) {
      System.out.println("Hurrah!");
    } else {
      System.out.println("Not New Year's Day.");
    }
  }
}
