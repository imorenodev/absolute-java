/**
  Class that prints 99 Bottles song
*/
public class BeerSong {
  private int bottles;

  public BeerSong() {
    bottles = 99;
  }

  public BeerSong(int numberOfBeers) {
    if (numberOfBeers < 0) {
      this.bottles = 0;
    } else if (numberOfBeers > 99) {
      this.bottles = 99;
    } else {
      this.bottles = numberOfBeers;
    }
  }

  public void printSong() {
    while (bottles > 0) {
      System.out.println(bottles + " bottles of beer on the wall,");
      System.out.println(bottles + " bottles of beer,");
      System.out.println("Take one down, pass it around,");

      --bottles;

      System.out.println(bottles + " bottles of beer on the wall.");
    }
  }
}
