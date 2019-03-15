import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class here here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class here extends endscreens
{
    /**
     * Act - do whatever the here wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int mouseX;
    int mouseY;
    public void act() 
    {
        String text = "here";
        setImage(new GreenfootImage(text, 25, Color.GRAY, null));
        Color bgColor = new Color(0, 0, 0, 0);
        click();
    } 
    
    public void click()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level1()); //restarts the game 
            //https://www.greenfoot.org/topics/8832/0
        }

   }
}

    
