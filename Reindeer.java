
/**
 * class Reindeer
 * Learn GitHub version control for collaborative projects
 * Human Team Member Names:
 * December 19, 2019
 */
public class Reindeer
{
    // class variables (AKA member variables)
    private static int numOfReindeer = 0;
    private static int totalLights = 0;
    private static int totalEnergy = 0;

    // instance variables (AKA fields or attributes)
    private String name;
    private boolean noseGlows;
    private int energy;  // 1 - 5 with 5 as the highest


    /**
     * 3-Args Constructor for objects of class Reindeer
     */
    public Reindeer(String theName, boolean theNoseGlows, int theEnergy)
    {
        //initializing the static variables
        name = theName;
        noseGlows = theNoseGlows;
        energy = theEnergy;

        //update the totals
        numOfReindeer++;

        if(theNoseGlows)
        {
          totalLights++;
        }

        totalEnergy += theEnergy;
    }

    // TODO: Write a getter method for each instance variable
    public String getName()
    {
        // TODO: code here
        return name;
    }

    
    public boolean getNoseGlows()
    {
        return noseGlows;
    }
       


    public boolean doesNoseGlow()
    {
        // TODO: code here
        return noseGlows;
    }

    public int getEnergyLevel()
    {
        // TODO: code here
        return energy;
    }

    // TODO: Write a setter method for each instance variable
    public void changeName(String name)
    {
        // TODO: code here
            name = name;
    }

    public void setNoseAbility(boolean nG)
    {
        // TODO: code here (don't forget to also update totalLights)
            noseGlows = nG;
    }

    public void changeEnergy(int amountOfChange)
    {
        // TODO: code here (don't forget to also update totalEnergy)
            energy = energy + amountOfChange;
            if(energy>5)
            {
                energy = 5;
            }
    }

    // interesting description of the reindeer
    public String toString()
    {
        // TODO: code here
        String nose = "";
        String en = "";
        if(noseGlows)
        {
            nose = "glows";
        }
        else
        {
            nose = "doesn't glow";
        }
        if(energy > 10)
        {
            en = "very";
        }
        else if(energy > 5)
        {
            en = "";
        }
        else
        {
            en = "not";
        }
        return "The reinders name is " + name + ", it's nose " + nose + "and it is " + en + " energetic.";
    }


    // method that returns the happiness of the entire team
    // of reindeer, based on any old combination of conditions
    // and or formulas using totalNumOfReindeer, totalLights
    public String determineTeamHappiness()
    {

        // Link's code
        if(totalLights >= numOfReindeer/2)
        {
            return "These reindeer are extremely happy";
        }
        if(totalLights <= numOfReindeer/3)
        {
            return "These reindeer seem a little depressed";
        }
        return "These reindeer are satisfied";


    }

}
