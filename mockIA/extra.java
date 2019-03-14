import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class extra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class extra extends Actor
{
    /**
     * Act - do whatever the extra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public extra()
    {
        GreenfootImage myImage = getImage();
        int newHeight = 20;
        int newWidth = newHeight;
        myImage.scale(newHeight, newWidth);
    }
    
    public void act() 
    {
        
    }    
}
