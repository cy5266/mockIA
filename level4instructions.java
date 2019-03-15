import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level4instructions extends instructions
{
    /**
     * Act - do whatever the level2instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public level4instructions(){
    String text = "make your way to the orange square" +"\n" + "don't touch the blue";
    
    setImage(new GreenfootImage(text, 25, Color.BLACK, null));
    Color bgColor = new Color(0, 0, 0, 0);
    }
  
    public void act() 
    {
        // Add your action code here.
    }    
}
