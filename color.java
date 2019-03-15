import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class color here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class color extends EndScreen
{

    /**
     * Constructor for objects of class color.
     * 
     */
    int levelfailed = 0;
    
    public color(int score)
    {
        super(score); //https://www.greenfoot.org/topics/7485
        levelfailed = score;
    }
    
    public void act()
    {
        showText("Level failed "+ levelfailed , 300, 170);
        showText("Category failed: Colors", 300, 220);
        addObject(new playAgain(), 260, 250);
        addObject(new here(),515, 250);
    }
   
}
