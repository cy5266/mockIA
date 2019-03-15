import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{
    Counter COUNTER = new Counter("Level ");
    /**
     * Constructor for objects of class level3.
     * 
     */
    int levelscompleted = 0;
    int times= 0;
    public level3(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        levelscompleted = score;
    }
    
    public void act()
    {
        COUNTER.setValue(levelscompleted);
        addObject(COUNTER, 50, 19);
        
        addObject(new level3instructions(), 300, 80);
        addObject(new correctcircle(), 463, 63);
        times ++; //adds how many times the act method has ran
        wrongCircles();
    }
    
    public void wrongCircles()
    {
        if (times == 1) //makes sure the circles only get added once
        {
        addObject(new wrongcircle1(), 100 , 200);  
        addObject(new wrongovals1(), 200 , 142);
        addObject(new wrongcircle1(), 152 , 300);
        addObject(new wrongcircle1(), 55 , 360);
        addObject(new wrongcircle1(), 540 , 195);
        addObject(new wrongovals1(), 438 , 219);
        addObject(new wrongovals1(), 329 , 201);
   
    }
    }
 
    /*
     public int setRngHeight()
     {
        int rng = (int)(Math.random() * 400) + 1;
        if(rng < 100 || rng > 350)
        {
            return setRngHeight();
        }
        return rng;
    }
    
    public int setRngWidth()
     {
        int rng = (int)(Math.random() * 600) + 1;
        if(rng < 60 || rng > 540)
        {
            return setRngWidth();
        }
        return rng;
    }
    */
}
