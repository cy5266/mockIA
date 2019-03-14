import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyOfBlueButton extends Colors
{
    /**
     * Act - do whatever the ButtonTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CopyOfBlueButton()
    {
        super();
    }
    public void act() 
    {
        click();
        // Add your action code here.
    }    
    
    private void click()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new level3());
}
} 

}
