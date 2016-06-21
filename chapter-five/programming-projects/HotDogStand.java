public class HotDogStand {
  private int id;
  private int hotDogsSold = 0;
  private static int totalHotDogsSold = 0;

  public HotDogStand(int id, int hotDogsSold) {
    if (id > 0 && hotDogsSold >= 0) {
      this.id = id;
      this.hotDogsSold = hotDogsSold;
      totalHotDogsSold += hotDogsSold;
    } else {
      System.out.println("ID and hotDogsSold must be a positive integer");
      System.exit(0);
    }
  }

  public void justSold() {
    hotDogsSold++;
    totalHotDogsSold++;
  }

  public int getAmountSold() {
    return hotDogsSold;
  }

  public static int getTotalAmountSold() {
    return totalHotDogsSold;
  }
}
