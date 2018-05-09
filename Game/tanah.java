import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tanah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tanah extends Actor
{
    /**
     * Act - do whatever the tanah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 
    public tanah(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 300, image.getHeight() - 70);
        setImage(image);
    }
    public void act() 
    {
         setLocation(getX(), getY()+1);
    }    
    
}
