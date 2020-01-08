
/**
 * Write a description of class MaxReinRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MaxReinRunner
{
    
    public static void main (String args[])
    {
        Reindeer Kaleb = new Reindeer("Kaleb", true, 3);
        Reindeer Charlie = new Reindeer("Charlie", false, 2);
        System.out.println("The first reindeer's name is " + Kaleb.getName());
        System.out.println("It is " + Charlie.getNoseGlows() + " that Charlie's nose glows");
        System.out.println("Kaleb's energy level is " + Charlie.getEnergyLevel());
        System.out.println(Kaleb.toString());
        System.out.println(Charlie.toString());
        System.out.println(Charlie.determineTeamHappiness());
        
    }

    
}
