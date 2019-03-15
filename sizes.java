import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sizes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sizes extends EndScreen
{

    /**
     * Constructor for objects of class sizes.
     * 
     */
    int levelfailed = 0;
    
    public sizes(int score)
    {
        super(score);
        levelfailed = score;
    }
    
    public void act()
    {
        showText("Level failed: "+ levelfailed , 300, 170);
        showText("Category failed: Sizes", 300, 220);
        addObject(new playAgain(), 260, 250);
        addObject(new here(),515, 250);
    }
}
