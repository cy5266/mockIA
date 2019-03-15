import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class yellowsquare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class yellowsquare extends Colors
{
    /**
     * Act - do whatever the yellowsquare wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int level = 0; 
    
    public yellowsquare(int level)
    {
        GreenfootImage myImage = getImage(); //https://www.greenfoot.org/topics/1763
        int newHeight = (int)myImage.getHeight()/4 + 20; 
        int newWidth = (int)myImage.getWidth()/4 + 20;
        myImage.scale(newHeight, newWidth); //changes the shape of the image
        this.level = level;
    }
   
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new sizes(level));
        }
    }    
}
