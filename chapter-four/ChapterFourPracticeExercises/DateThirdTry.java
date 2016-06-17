import java.util.Scanner;

public class DateThirdTry {
  private String month;
  private int day;
  private int year; // a four digit number

  public void writeOutput() {
    System.out.println(this.month + " " +  this.day + ", " + this.year);
  }

  public void setDate(int newMonth, int newDay, int newYear) {
    this.month = monthString(newMonth);
    this.day = newDay;
    this.year = newYear;
  }

  public void advanceYear(int yearIncrease) {
    this.year += yearIncrease;
  }

  public boolean isBetween(int lowYear, int highYear) {
    return ((this.year > lowYear) && (this.year < highYear)); 
  }

  public double fractionDone(int targetDay) {
    double dayDouble = this.day;
    return dayDouble / targetDay;
  }

  public String monthString(int monthNumber) {
    switch (monthNumber) {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5: 
        return "May";
      case 6:
        return "June";
      case 7: 
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        System.out.println("Fatal Error");
        System.exit(0);
        return "Error";
    }
  }

  public void readInput() {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter month, day, and year.");
    System.out.println("Do not use a comma.");
    this.month = keyboard.next();
    this.day = keyboard.nextInt();
    this.year = keyboard.nextInt();
  }

  public int getDay() {
    return this.day;
  }

  public int getYear() {
    return this.year;
  }

  public int getNextYear() {
    return this.year + 1;
  }

  public void happyGreeting() {
    int count;
    
    for (count = day; count > 0; count--) {
      System.out.println(count + ": Happy Days!");
    } 
  }

  public int getMonth() {
    if (month.equalsIgnoreCase("January")) {
      return 1;
    } else if (month.equalsIgnoreCase("February")) {
      return 2;
    } else if (month.equalsIgnoreCase("March")) {
      return 3;
    } else if (month.equalsIgnoreCase("April")) {
      return 4;
    } else if (month.equalsIgnoreCase("May")) {
      return 5;
    } else if (month.equalsIgnoreCase("June")) {
      return 6;
    } else if (month.equalsIgnoreCase("July")) {
      return 7;
    } else if (month.equalsIgnoreCase("August")) {
      return 8;
    } else if (month.equalsIgnoreCase("September")) {
      return 9;
    } else if (month.equalsIgnoreCase("October")) {
      return 10;
    } else if (month.equalsIgnoreCase("November")) {
      return 11;
    } else if (month.equalsIgnoreCase("December")) {
      return 12;
    } else {
      System.out.println("Fatal Error");
      System.exit(0);
      return 0;
    }
  }
}
