import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class extra2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class extra2 extends Actor
{
    /**
     * Act - do whatever the extra2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public extra2()
    {
        GreenfootImage myImage = getImage();
        int newWidth = 720;
        int newHeight = 500;
        myImage.scale(newWidth, newHeight);   
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
