import java.util.Scanner;

public class DateSixthTry {
  private String month;
  private int day;
  private int year; // a four digit number

  public void writeOutput() {
    System.out.println(this.month + " " +  this.day + ", " + this.year);
  }

  public void setDate(int monthInt, int day, int year) {
    if (dateOK(monthInt, day, year)) {
      this.month = monthString(monthInt);
      this.day = day;
      this.year = year;
    } else {
      System.out.println("Fatal Error");
      System.exit(0);
    }
  }

  public void setDate(String monthString, int day, int year) {
    if (dateOK(monthString, day, year)) {
      this.month = monthString;
      this.day = day;
      this.year = year;
    } else {
      System.out.println("Fatal Error");
      System.exit(0);
    }
  }

  public void setDate(int year) {
    setDate(1, 1, year);
  }

  public void setMonth(int monthNumber) {
    if ((monthNumber <= 0) || (monthNumber > 12)) {
      System.out.println("Fatal Error");
      System.exit(0);
    } else {
      this.month = monthString(monthNumber);
    }
  }

  public void setDay(int day) {
    if ((day <= 0) || (day > 31)) {
      System.out.println("Fatal Error");
      System.exit(0);
    } else {
      this.day = day;
    }
  }

  public void setYear(int year) {
    if ((year < 1000) || (year > 9999)) {
      System.out.println("Fatal Error");
      System.exit(0);
    } else {
      this.year = year;
    }
  }

  public void readInput() {
    boolean tryAgain = true;
    Scanner keyboard = new Scanner(System.in);

    while(tryAgain) {
      System.out.println("Enter month, day, and year as three integers.");
      System.out.println("Do not use a comma.");
      int monthInput = keyboard.nextInt();
      int dayInput = keyboard.nextInt();
      int yearInput = keyboard.nextInt();

      if (dateOK(monthInput, dayInput, yearInput)) {
        setDate(monthInput, dayInput, yearInput);
        tryAgain = false;
      } else {
        System.out.println("Illegal date. Reenter input.");
      }
    }
  }

  public void advanceYear(int yearIncrease) {
    this.year += yearIncrease;
  }

  /**
  Precondition: All arguments are positive integers
  Postcondition: Returns true if date is within legal range
  */
  private boolean dateOK(int monthInt, int dayInt, int yearInt) {
    // check that date is within reasonable range 
    if ( (monthInt >= 1) && (monthInt <= 12) &&
         (dayInt >= 1) && (dayInt <= 31) && 
         (yearInt >= 1000) && (yearInt <= 9999) ) {
      // check for legal day if month is February
      if (monthInt == 2) {
        if (leapYear(yearInt)) {
          return (dayInt <= 29);
        } else {
          return (dayInt <= 28);
        }
      }
      // check for day <= 30 if month == Sept, April, June, Nov
      if (monthInt == 9 || 
          monthInt == 4 || 
          monthInt == 6 || 
          monthInt == 11) {
        return (dayInt <= 30);
      }
      return true;
    } else {
      return false;
    }
  }

  private boolean dateOK(String monthString, int dayInt, int yearInt) {
    if (monthOK(monthString)) {
      return dateOK(getMonthInt(monthString), dayInt, yearInt);
    } else {
      return false;
    }
  }

  private boolean monthOK(String mont) {
    return ( month.equals("January") || month.equals("February") ||
             month.equals("March") || month.equals("April") ||
             month.equals("May") || month.equals("June") ||
             month.equals("July") || month.equals("August") ||
             month.equals("September") || month.equals("October") ||
             month.equals("November") || month.equals("December") );
  }

  private int getMonthInt(String monthString) {
    switch (monthString.toLowerCase()) {
      case "january":
        return 1;
      case "february":
        return 2;
      case "march":
        return 3;
      case "april":
        return 4;
      case "may":
        return 5;
      case "june":
        return 6;
      case "july":
        return 7;
      case "august":
        return 8;
      case "september":
        return 9;
      case "october":
        return 10;
      case "november":
        return 11;
      case "december":
        return 12;
      default:
        System.out.println("Fatal Error.");
        System.exit(0);
        return 0;
    }
  }

  private boolean leapYear(int year) {
    if ( (year % 400 == 0) || 
         ((year % 4 == 0) && (year % 100 != 0)) ) {
      return true;
    } else {
      return false;
    }
  }

  public boolean equals(DateSixthTry otherDate) {
    return ((this.month.equals(otherDate.month)) &&
            (this.day == otherDate.day) && 
            (this.year == otherDate.year));
  }

  public boolean precedes(DateSixthTry otherDate) {
    return ( (this.year < otherDate.year) || 
             (this.year == otherDate.year &&
              this.getMonth() < otherDate.getMonth()) ||
             (this.year == otherDate.year && 
              this.month.equals(otherDate.month) && 
              this.day < otherDate.day) );
  }

  public boolean isBetween(int lowYear, int highYear) {
    return ( (this.year > lowYear) && (this.year < highYear) ); 
  }

  public double fractionDone(int targetDay) {
    double dayDouble = this.day;
    return dayDouble / targetDay;
  }
  
  public String toString() {
    return (this.month + " " + this.day + ", " + this.year);
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
