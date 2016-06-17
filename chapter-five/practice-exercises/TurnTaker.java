public class TurnTaker {
  private static int turn = 0;

  private int myTurn;
  private String name;

  public TurnTaker(String theName, int theTurn) {
    this.name = theName;

    if (turn >= 0 ) {
      this.myTurn = theTurn;
    } else {
      System.out.println("Invalid turn number.");
      System.exit(0);
    }
  }

  public TurnTaker() {
    this.name = "No name yet.";
    this.myTurn = 0;
  }

  public String getName() {
    return this.name;
  }

  public static int getTurn() {
    turn++;
    return turn;
  }

  public boolean isMyTurn() {
    return (turn == myTurn);
  }

  public static void main(String[] args) {
    TurnTaker lover1 = new TurnTaker("Romeo", 1);
    TurnTaker lover2 = new TurnTaker("Juliet", 3);

    for (int i = 0; i < 5; i++) {
      System.out.println("Turn = " + TurnTaker.getTurn());
      if (lover1.isMyTurn()) {
        System.out.println("Love from " + lover1.getName());
      }
      if (lover2.isMyTurn()) {
        System.out.println("Love from " + lover2.getName());
      }
    }
  }
}
