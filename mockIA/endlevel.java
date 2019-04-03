import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endlevel extends levels
{

    /**
     * Constructor for objects of class level4.
     * 
     */
    public endlevel(int level)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(level); 
    }
    
    public void act()
    {
        super.act();
        
        addObject(new level4back(), 300, 200);
        addObject(new endinstructions(), 300, 80);
        addObject(new yellowsquare(4), 214,300);
        addObject(new orangesquare(), 418,380);
        addObject(new orangerectangle(4), 5, 170);
    }
    
  
    
  
}
