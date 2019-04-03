import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hangmanletters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hangmanletters extends Actor
{
    /**
     * Act - do whatever the hangmanletters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String letter = "";
    
    public hangmanletters(String letter)
    {
        this.letter = letter;
    }
    
    public void act() 
    {
        if (letter.length() > 1)
        {
           getWorld.showText("please type one letter"); 
        }    
    }
}
