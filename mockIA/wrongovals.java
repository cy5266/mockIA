import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wrongovals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wrongovals extends Shapes
{
    /**
     * Act - do whatever the wrongovals wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public wrongovals()
    {
        GreenfootImage myImage = getImage();
        int newHeight = setRng();
        int newWidth = setRng();
        myImage.scale(newHeight, newWidth);
    }
    
    public int setRng()
    {
        int rng = (int)(Math.random() * 600) + 1;
        if (rng > 60)
        {
            return rng;
        }
        return rng;
        
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new sizes());
    }    
}
}
