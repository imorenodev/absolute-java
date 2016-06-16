public class DateFinalDemo {
  public static void main(String[] args) {
    DateFinal date1 = new DateFinal("December", 11, 1880),
              date2 = new DateFinal(1, 25, 1944),
              date3 = new DateFinal(1883),
              date4 = new DateFinal();
    System.out.println("Whose birthday is " + date1 + "?");
    System.out.println("Whose birthday is " + date2 + "?");    
    System.out.println("Whose birthday is " + date3 + "?");    
    System.out.println("Whose birthday is " + date4 + "?");    
  }
}
