import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1instructions extends instructions
{
    /**
     * Act - do whatever the level1instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public level1instructions(){
    //GreenfootImage img = new GreenfootImage(100,500);
    Color fontColor = Color.BLACK;
    String text = "click " +  "on the blue button twice";
    setImage(new GreenfootImage(text, 40, Color.BLACK, Color.WHITE));
    Color bgColor = new Color(0, 0, 0, 0);
    
 
    }
    

    
    public void act() 
    {
        // Add your action code here.
    }    
}
