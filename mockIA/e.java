import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class e here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class e extends level5words
{
    /**
     * Act - do whatever the e wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public e()
    {
        super("e");
    }
    
    public void act() 
    {
        super.act(221,239,93,114);
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new level6(6));
        }
    }    
}
