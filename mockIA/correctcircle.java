import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class correctcirle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class correctcircle extends Shapes
{
    /**
     * Act - do whatever the correctcirle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public correctcircle()
    {
        GreenfootImage myImage = getImage();
        int newHeight = (int)myImage.getHeight()/23;
        int newWidth = (int)myImage.getWidth()/23;
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
    Greenfoot.setWorld(new endlevel(6));
}
}
}

