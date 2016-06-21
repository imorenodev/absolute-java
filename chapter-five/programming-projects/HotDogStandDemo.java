public class HotDogStandDemo {
  public static void main(String[] args) {
    HotDogStand stand1 = new HotDogStand(1, 11); 
    HotDogStand stand2 = new HotDogStand(2, 22); 
    HotDogStand stand3 = new HotDogStand(3, 33); 

    System.out.println("Hot Dog Stand 1: " + stand1.getAmountSold());
    System.out.println("Total amount sold: " + HotDogStand.getTotalAmountSold());

    stand2.justSold();

    System.out.println("Total amount sold: " + HotDogStand.getTotalAmountSold());

    System.out.println("Hot Dog Stand 3: " + stand3.getAmountSold());

    stand3.justSold();
    stand3.justSold();

    System.out.println("Total amount sold: " + HotDogStand.getTotalAmountSold());
  }
}
