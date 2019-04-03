import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class correctTriangleLevel5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class correctTriangle extends Shapes
{
    /**
     * Act - do whatever the correctTriangleLevel5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage myImage =  new GreenfootImage("triangle.png");
    private int mouseX = 0;
    private int mouseY = 0;
    
    public correctTriangle()
    {
        setsize();
}
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.getMouseInfo() != null)
        {
         mouseX = Greenfoot.getMouseInfo().getX();  //finds x-coordinate of the mouse
         mouseY = Greenfoot.getMouseInfo().getY();
         if((mouseX >= 130 && mouseX <= 180 ) && (mouseY >= 238 && mouseY <= 300))
         {
             myImage = new GreenfootImage ("trianglegreen.png");
             setsize();
            }
         else
            {
                myImage = new GreenfootImage ("triangle.png");
                setsize();
            }
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new level5(5));
        }
    
  
    
} 
private void setsize()
    {
        myImage.scale(myImage.getWidth()/15, myImage.getHeight()/15);
             setImage(myImage);
    }    
}
