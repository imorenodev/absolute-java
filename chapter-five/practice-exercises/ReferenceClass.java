public class ReferenceClass {
  private String name;
  private int number;

  public ReferenceClass() {
    name = "No name yet.";
    number = 0;
  }

  public ReferenceClass(String name, int number) {
    this.name = name;
    this.number = number;
  }

  public void set(String name, int number) {
    this.name = name;
    this.number = number;
  }

  public String toString() {
    return (name + " " + number);
  }

  public static void changer(ReferenceClass aParameter) {
    aParameter.name = "Hot Shot";
    aParameter.number = 42;
  }

  public boolean equals(ReferenceClass otherObject) {
    return ( (this.name.equals(otherObject.name)) &&
             (this.number == otherObject.number) );
  }

  public static void main(String[] args) {
    ReferenceClass anObject = new ReferenceClass("Joe", 42);
    System.out.println(anObject);

    System.out.println("Now call changer method with anObject as an argument.");
    ReferenceClass.changer(anObject);
    System.out.println(anObject);
  }
}
