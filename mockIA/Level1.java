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
        super(600,400,1);
        act();
    }
    
    public void act() 
    {
        
        Counter COUNTER = new Counter("Level ");
        COUNTER.setValue(1);
        addObject(COUNTER, 50, 19);
       
        addObject(new BlueButton(),150,325);
        addObject(new RedButton(),300,325);
        addObject(new GreenButton(),450,325);// Add your action code here.
        
        addObject(new level1instructions(), 300, 80);
    }    
}
