
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
        // TO DO: initialise the reindeer's attributes
        
        
        
        // TO DO: update the class (static variables)
        
        
    }
    
    // TODO: Write a getter method for each instance variable
    public String getName()
    {
        // TODO: code here
        return null;
    }
    
    public boolean doesNoseGlow()
    {
        // TODO: code here
        return false;
    }
    
    public int getEnergyLevel()
    {
        // TODO: code here
        return 0;
    }
    
    // TODO: Write a setter method for each instance variable
    public void changeName(String name)
    {
        // TODO: code here
        
    }
    
    public void setNoseAbility(boolean nG)
    {
        // TODO: code here (don't forget to also update totalLights)
        
    }
    
    public void changeEnergy(int amountOfChange)
    {
        // TODO: code here (don't forget to also update totalEnergy)
        
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
        // TODO: code here
        return "how happy is the team of reindeer"; 
    }
        
}
