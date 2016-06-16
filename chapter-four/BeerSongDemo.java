import java.util.Scanner;

public class BeerSongDemo {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number of bottles bewteen 0-99");
    int bottles = keyboard.nextInt();
    BeerSong song1 = new BeerSong(bottles);
    song1.printSong();
  }
}
