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
        Counter COUNTER = new Counter("Level ");
        COUNTER.setValue(3);
        addObject(COUNTER, 50, 19);
        
        addObject(new extra(), 463, 63);
        addObject(new level4instructions(), 300, 80);
        addObject(new extra2(), 250, 190);
    }
    
  
}
