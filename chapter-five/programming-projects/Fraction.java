public class Fraction {
  private int numerator;
  private int denominator;

  public Fraction(int newNumerator, int newDenominator) {
    numerator = newNumerator;
    denominator = newDenominator;
  }

  public void setNumerator(int newNumerator) {
    numerator = newNumerator;
  }

  public void setDenominator(int newDenominator) {
    denominator = newDenominator;
  }

  public void setFraction(int newNumerator, int newDenominator) {
    setNumerator(newNumerator);
    setDenominator(newDenominator);
  }

  public String getFraction() {
    return (numerator + "/" + denominator);
  } 

  public boolean equals(Fraction otherFraction) {
    return ( ((double)numerator / (double)denominator) == ((double)otherFraction.numerator / (double)otherFraction.denominator) );
  }

  public String toString() {
    return (numerator + " " + denominator);
  }
}
