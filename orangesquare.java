import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class orangesquare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class orangesquare extends Shapes
{
    /**
     * Act - do whatever the orangesquare wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public orangesquare()
    {
      GreenfootImage myImage = getImage();
        int newHeight = (int)myImage.getHeight()/20;
        int newWidth = (int)myImage.getWidth()/20;
        myImage.scale(newHeight, newWidth);   
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new level5());
        }
    }    
}
