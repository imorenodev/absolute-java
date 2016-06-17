import java.text.NumberFormat;

public class Pizza {
  private String size;
  private int cheese;
  private int pepperoni;
  private int ham;

  public Pizza() {
    size = "Medium";
    cheese = 1;
    pepperoni = 0;
    ham = 0;
  }

  public Pizza(String size, int cheese, int pepperoni, int ham) {
    this.size = validateSize(size);
    this.cheese = validateTopping(cheese);
    this.pepperoni = validateTopping(pepperoni);
    this.ham = validateTopping(ham);
  }

  public void setSize(String size) {
    this.size = validateSize(size);
  }

  public void setCheese(int cheese) {
    this.cheese = validateTopping(cheese);
  }

  public void setPepperoni(int pepperoni) {
    this.pepperoni = validateTopping(pepperoni);
  }

  public void setHam(int ham) {
    this.ham = validateTopping(ham);
  }

  public String getSize() {
    return size;
  }

  public int getCheese() {
    return cheese;
  }

  public int getPepperoni() {
    return pepperoni;
  }

  public int getHam() {
    return ham;
  }

  public double calcCost() {
    if (size.equalsIgnoreCase("Small")) {
      return 10.00 + 2*(cheese + pepperoni + ham);
    } else if (size.equalsIgnoreCase("Medium")) {
      return 12.00 + 2 * (cheese + pepperoni + ham);
    } else {
      return 14 + 2 * (cheese + pepperoni + ham);
    }
  }

  public String getDescription() {
    return ("A " + size + " " + cheese + "-cheese pizza with " + pepperoni + " pepperoni, and " + ham + " ham toppings.");
  }

  public String toString() {
    return (size + " " + cheese + " " + pepperoni + " " + ham);
  }

  public boolean equals(Pizza aPizza) {
    return (this.size.equals(aPizza.size) && 
            this.cheese == aPizza.cheese &&
            this.pepperoni == aPizza.pepperoni && 
            this.ham == aPizza.ham);
  }

  private String validateSize(String size) {
    if (size.equalsIgnoreCase("small")) {
      return "Small";
    } else if (size.equalsIgnoreCase("medium")) {
      return "Medium";
    } else if (size.equalsIgnoreCase("large")) {
      return "Large";
    } else {
      return "Medium";
    }
  }

  private int validateTopping(int topping) {
    if (topping < 0 || topping > 99) {
      return 0;
    } else {
      return topping;
    }
  }

  public static void main(String[] args) {
    NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
    Pizza pizza1 = new Pizza();
    Pizza pizza2 = new Pizza("Large", 2, 6, 2);
    String pizza1Cost = moneyFormatter.format(pizza1.calcCost());
    String pizza2Cost = moneyFormatter.format(pizza2.calcCost());

    System.out.println("pizza1.toString(): " + pizza1.toString());
    System.out.println("Pizza 1 == Pizza 2 " + pizza1.equals(pizza2));
    System.out.println("Pizza 1: " + pizza1.getDescription());
    System.out.println("Pizza 1 Total Cost: " + pizza1Cost);
    System.out.println("Pizza 2: " + pizza2.getDescription());
    System.out.println("Pizza 2 Total Cost: " + pizza2Cost);

    pizza1.setCheese(5);
    pizza1.setHam(9);
    pizza1Cost = moneyFormatter.format(pizza1.calcCost());
    System.out.println("Pizza 1 Updated Total Cost: " + pizza1Cost);
  }
}

