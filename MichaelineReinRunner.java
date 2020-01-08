
/**
 * Write a description of class MichaelineReinRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MichaelineReinRunner
{
    // instance variables - replace the example below with your own

    /**
     * Main method to test
     */
    public static void main(String[] args)
    {
        //Create Reindeers to test on
        Reindeer mikie = new Reindeer("mikie", true, 5);
        Reindeer justin = new  Reindeer("justin", false, 3);
        
        //print mikie
        System.out.println(mikie.toString());
        
        //check team happiness 
        System.out.println(mikie.determineTeamHappiness());
        
        //change Mikie
        mikie.changeName("link");
        mikie.setNoseAbility(false);
        mikie.changeEnergy(1);
        
        //print mikie with changes
        System.out.println(mikie.toString());
        
        //check team happiness 
        System.out.println(mikie.determineTeamHappiness());
        
        //change justin and mikie
        mikie.setNoseAbility(true);
        justin.setNoseAbility(true);
        
        //check team happiness 
        System.out.println(mikie.determineTeamHappiness());
    }

}
