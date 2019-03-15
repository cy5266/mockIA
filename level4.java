import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level4 extends World
{

    /**
     * Constructor for objects of class level4.
     * 
     */
    public level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act()
    {
        addObject(new level4back(), 300, 200);
        
        Counter COUNTER = new Counter("Level ");
        COUNTER.setValue(4);
        addObject(COUNTER, 50, 19);
        addObject(new level4instructions(), 300, 80);
        addObject(new yellowsquare(4), 214,300);
        addObject(new orangesquare(), 418,380);
    }
    
  
    
  
}
