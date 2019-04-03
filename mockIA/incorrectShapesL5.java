import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class correctShapes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class incorrectShapesL5 extends Shapes
{
    /**
     * Act - do whatever the correctShapes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int level= 0;
    
    public incorrectShapesL5(int level)
   {
       GreenfootImage myImage = getImage();
       myImage.scale(myImage.getWidth()/10, myImage.getHeight()/10);
       setImage(myImage);
       this.level = level;
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new shape(level));
        }
    }    
}
