//Justin's runner class
public class JustinReinRunner
{
  Reindeer macie = new Reindeer("Macie", true, 5);
  Reindeer cooper = new Reindeer("Cooper", false, 4);
  Reindeer jackson = new Reindeer("Jackson", true, 2);
  Reindeer annaliese = new Reindeer("Annaliese", true, 6);

  //Printing out Reindeer info
  System.out.println(macie.toString());
  System.out.println("Does Jackson's nose glow? " + jackson.doesNoseGlow);
  System.out.println("Cooper has " + cooper.getEnergyLevel() + " energy");

  //returning how happy the team of reindeer are currently
  System.out.println("How happy are our reindeer? " + macie.determineTeamHappiness());

  //Changes annaliese's information
  System.out.println(annaliese.toString());
  annaliese.setNoseAbility(false);
  System.out.println(annaliese.toString());

  //changes macies name
  macie.changeName("Macie May");
  macie.changeEnergy(1);
  System.out.println(macie.toString();)
}
