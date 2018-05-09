import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int jeda = 100;
    public void act(){
        if(jeda==100){
            tanahbaru();
            jeda=0;
        }else{
            jeda++;
        }
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        prepare();
        gameoverr();
        
        
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    karakter karakter = new karakter();
    int setX = 100;
    private void prepare()
    {
        
        addObject(karakter,124,327);
        tanah tanah = new tanah();
        addObject(tanah,127,357);
        tanah tanah2 = new tanah();
        addObject(tanah2,213,298);
        tanah tanah3 = new tanah();
        addObject(tanah3,327,206);
        tanah3.setLocation(317,210);
        tanah3.setLocation(312,215);
        tanah tanah4 = new tanah();
        addObject(tanah4,174,172);
        tanah4.setLocation(209,133);
        tanah tanah5 = new tanah();
        addObject(tanah5,229,89);
        tanah5.setLocation(82,75);
        
    }
    gameover stop = new gameover();
    public void gameoverr(){
        if(karakter.getY() >= getHeight()){

            addObject(stop, getWidth()/2, getHeight()/2);
            Greenfoot.stop();
        }
    }
    public void tanahbaru(){
        addObject(new tanah(), setX, 0);
    }
    
    
}
