
/**
 * Testing the Reindeer class
 *
 * @David Metacarpa
 * @1/8/20
 */
public class DavidReinRunner
{
    public static void main(String[] args)
    {
        // create testing reindeers
        Reindeer joe = new Reindeer("Joseph", true, 2);
        Reindeer mud = new Reindeer("Mud", false, 4);
        Reindeer teddy = new Reindeer("Theodore", true, 3);
        
        // test methods
        System.out.println("getName()");
        System.out.println("Joe: " + joe.getName());
        System.out.println("Mud: " + mud.getName());
        System.out.println("Teddy: " + teddy.getName());
        System.out.println();
        
        System.out.println("getNoseGlows()");
        System.out.println("Joe: " + joe.getNoseGlows());
        System.out.println("Mud: " + mud.getNoseGlows());
        System.out.println("Teddy: " + teddy.getNoseGlows());
        System.out.println();
        
        System.out.println("getEnergyLevel()");
        System.out.println("Joe: " + joe.getEnergyLevel());
        System.out.println("Mud: " + mud.getEnergyLevel());
        System.out.println("Teddy: " + teddy.getEnergyLevel());
        System.out.println();
        
        // toString
        System.out.println(joe);
        System.out.println(mud);
        System.out.println(teddy);
        System.out.println();
        
        // team happiness
        System.out.println(teddy.determineTeamHappiness());
    }
}
