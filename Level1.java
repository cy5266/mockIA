import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    /**
     * Act - do whatever the level1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
   
    public Level1()
    {
        super(600,400,1); //creates the size of the canvas
        act();
    }
    
    public void act() 
    {
        
        Counter COUNTER = new Counter("Level "); //creates the counter
        COUNTER.setValue(1); //sets value of counter
        addObject(COUNTER, 50, 19); //places the counter on the screen
       
        addObject(new BlueButton(),150,325); //places the buttons
        addObject(new RedButton(1),300,325);
        addObject(new GreenButton(1),450,325);
        
        addObject(new level1instructions(), 300, 80); //places the size
    }    
}
