import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wrongcircle1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wrongcircles extends Shapes
{
    /**
     * Act - do whatever the wrongcircle1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public wrongcircles()
    {
        GreenfootImage myImage = getImage();
        int newHeight = setRng();
        int newWidth = newHeight;
        myImage.scale(newHeight, newWidth);
    }
    
    public int setRng()
    {
        int rng = (int)(Math.random() * 600) + 1;
        if (rng < 100)
        {
            return 100;
        }
        else 
        {
            return rng;
        }
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new sizes());
    }   
}
}
