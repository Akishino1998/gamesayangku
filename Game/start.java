import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends tombol
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        tombol_klik();
    }   
    public void tombol_klik(){
        getWorld().showText("bawbkldaludgboawd",50,50);
        if(Greenfoot.mouseClicked(start.class)==true){
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
