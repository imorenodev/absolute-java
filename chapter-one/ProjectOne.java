public class ProjectOne 
{
  public static final double METABOLIC_CONSTANT = 0.0175;
  public static final int runningMETS = 10,
         basketballMETS = 8,
         sleepingMETS = 1;

  public static void main(String[] args)
  {
    float weightInKilograms = 330;

    System.out.println("Calories burned during the following activities for a person weighing " + weightInKilograms + " kilograms: \n");
    System.out.print("Running 6MPH for 30 minutes: ");
    System.out.println(METABOLIC_CONSTANT * runningMETS * weightInKilograms * 30);
    System.out.print("Playing basketball for 30 minutes: ");
    System.out.println(METABOLIC_CONSTANT * basketballMETS * weightInKilograms * 30);
    System.out.print("Sleeping for 6 hours: ");
    System.out.println(METABOLIC_CONSTANT * sleepingMETS * weightInKilograms * 360);
  }
}
