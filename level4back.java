import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level4back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level4back extends Actor
{
    /**
     * Act - do whatever the level4back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage myImage = getImage();
    int mouseX;
    int mouseY;
    
    public level4back()
    {
        myImage.scale(600, 400);
    }
    
    public void act() 
    {
     click();   
    }    
    
    private void click()
    {
        Color color = new Color (0,207,214);  //color of the blue background
        if(Greenfoot.getMouseInfo() != null)
        {
         mouseX = Greenfoot.getMouseInfo().getX();  //finds x-coordinate of the mouse
  
         mouseY = Greenfoot.getMouseInfo().getY();  //finds y-coordinate of the mouse
    }
        if(myImage.getColorAt(mouseX, mouseY).equals(color) && mouseY > 10
        && mouseY < 360)
        {
            Greenfoot.setWorld(new color(4));
    }
    }
}
