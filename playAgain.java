import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playAgain extends endscreens
{
    /**
     * Act - do whatever the playAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        String text = "thank you for playing. to play again, click";
        setImage(new GreenfootImage(text, 25, Color.GRAY, null));
        Color bgColor = new Color(0, 0, 0, 0);
    }    
}
