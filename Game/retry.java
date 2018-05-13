import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class retry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class retry extends tombol
{
    /**
     * Act - do whatever the retry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public retry(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 494, image.getHeight() - 160);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
        tombol_klik();
    }  
    public void tombol_klik(){
        if(Greenfoot.mouseClicked(this)){
            MyWorld MyWorld = new MyWorld();
            Greenfoot.setWorld(MyWorld);
        }
    }
}
