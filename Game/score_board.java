import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score_board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score_board extends Actor
{
    /**
     * Act - do whatever the score_board wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public score_board(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 150, image.getHeight() - 90);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
