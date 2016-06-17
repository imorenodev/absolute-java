public class InvocationCounter {
  private static int numberOfInvocations = 0;

  public void demoMethod() {
    numberOfInvocations++;
  }

  public void outPutCount() {
    numberOfInvocations++;
    System.out.println("Number of invocations so far = " + numberOfInvocations);
  }

  public static int numberSoFar() {
    numberOfInvocations++;
    return numberOfInvocations;
  }

  public static void main(String[] args) {
    int i;

    InvocationCounter counterObject1 = new InvocationCounter();

    for (i = 1; i <= 5; i++) {
      counterObject1.demoMethod();
    }
    counterObject1.outPutCount();

    InvocationCounter counterObject2 = new InvocationCounter();

    for (i = 1; i <= 5; i++) {
      counterObject2.demoMethod();
      counterObject2.outPutCount();
    }
    System.out.println("Total number of invocations = " + numberSoFar());
  }
}
