import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{

    /**
     * Constructor for objects of class level2.
     * 
     */
    int levelscompleted = 0;
    
    public level2(int score)
    {// Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        levelscompleted = score;
    }
    
    public void act() 
    {
        Counter COUNTER = new Counter("Level ");
        COUNTER.setValue(levelscompleted);
        addObject(COUNTER, 50, 19);
       
        addObject(new CopyOfBlueButton(),450,325);
        addObject(new RedButton(2),300,325);
        addObject(new GreenButton(2),150,325);// Add your action code here.
    }
}
