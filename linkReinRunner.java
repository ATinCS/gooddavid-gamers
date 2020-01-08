
/**
 * Write a description of class linkReinRunner here.
 *
 * @author Link Erickson
 * @version v1.0.0.0.0
 */
public class linkReinRunner
{


    /**
     * main method for running Reindeer methods 
     */
    public static void main (String args[])
    {
        Reindeer Rudolph = new Reindeer("Rudolph", false, 0);
        Reindeer Prancer = new Reindeer("Prancer", true, 3);
        Reindeer Blitzen = new Reindeer("Blitzen", true, 5);
        System.out.println("My reindeer's name is " + Rudolph.getName());
        Rudolph.changeName("Prancer");
        System.out.println("Now my reindeer is named " + Rudolph.getName());
        System.out.println(Blitzen.getName() + "'s energy level is " + Blitzen.getEnergyLevel());
        System.out.println(Blitzen.toString());
        System.out.println(Prancer.toString());
        System.out.println(Blitzen.determineTeamHappiness());
    }
}
