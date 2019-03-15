import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Colors extends Actor
{
    /**
     * Act - do whatever the ButtonTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Colors()
    {
        GreenfootImage myImage = getImage();
        int newHeight = (int)myImage.getHeight()/5;
        int newWidth = (int)myImage.getWidth()/5;
        myImage.scale(newHeight, newWidth);
        
    }
    public void act() 
    {
        click();
        // Add your action code here.
    }    
    
    private void click()
    {
        if (Greenfoot.mouseClicked(this))
        {
    Greenfoot.setWorld(new color(1));
}
} 

}
