
/**
 * class Reindeer
 * Learn GitHub version control for collaborative projects
 * Human Team Member Names: Justin K, Mikie M, Max N, Link E, David M
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

    public String getName()
    {
        return name;
    }

    public boolean getNoseGlows()
    {
        return noseGlows;
    }

    public boolean doesNoseGlow()
    {
        return noseGlows;
    }

    public int getEnergyLevel()
    {
        return energy;
    }

    public void changeName(String name)
    {
            name = name;
    }

    public void setNoseAbility(boolean nG)
    {
            noseGlows = nG;

            if(nG == false)
              totalLights--;
            else
              totalLights++;
    }

    public void changeEnergy(int amountOfChange)
    {
            energy = energy + amountOfChange;
            if(energy>5)
            {
                energy = 5;
            }
    }

    //returns all the reindeer information
    public String toString()
    {
        String nose = "";
        String en = "";
        if(noseGlows)
            nose = "glows";
        else
            nose = "doesn't glow";

        if(energy > 4)
            en = "very";
        else if(energy > 2)
            en = "";
        else
            en = "not";

        return "The reinders name is " + name + ", it's nose " + nose + " and it is " + en + " energetic.";
    }


    //Determines the happiness of the reindeers based on the percent of them that have glowing noses
    public String determineTeamHappiness()
    {

        // Link's code
        if(totalLights >= numOfReindeer)
        {
            return "These reindeer are extremely happy";
        }
        if(totalLights <= numOfReindeer/2)
        {
            return "These reindeer seem a little depressed";
        }
        return "These reindeer are satisfied";


    }

}
