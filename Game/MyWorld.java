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
    
    private void prepare()
    {
        
        addObject(karakter,100,327);
        tanah tanah = new tanah();
        addObject(tanah,100,357);
        tanah tanah2 = new tanah();
        addObject(tanah2,200,298);
        tanah tanah3 = new tanah();
        addObject(tanah3,300,206);
        tanah3.setLocation(300,210);
        tanah3.setLocation(300,215);
        tanah tanah4 = new tanah();
        addObject(tanah4,200,172);
        tanah4.setLocation(200,133);
        tanah tanah5 = new tanah();
        addObject(tanah5,100,89);
        tanah5.setLocation(100,75);
        
    }
    gameover stop = new gameover();
    public void gameoverr(){
        if(karakter.getY() >= getHeight()){

            addObject(stop, getWidth()/2, getHeight()/2);
            Greenfoot.stop();
        }
    }
    int posisi = 100;
    int angka_random = 0;
    public void tanahbaru(){
        angka_random = Greenfoot.getRandomNumber(2);
        if(posisi == 100){
            posisi = 200;
            addObject(new tanah(), posisi, 0);
        }
        else if(posisi == 200){
            if(angka_random == 0){
                posisi = 100;
                addObject(new tanah(), posisi, 0);
            }else{
                posisi = 300;
                addObject(new tanah(), posisi, 0);
            }
        }else if(posisi == 300)
        {
            if(angka_random == 0){
                posisi = 200;
                addObject(new tanah(), posisi, 0);
            }else{
                posisi = 400;
                addObject(new tanah(), posisi, 0);
            }
        }
        else if(posisi == 400){
            if(angka_random == 0){
                posisi = 300;
                addObject(new tanah(), posisi, 0);
            }else{
                posisi = 500;
                addObject(new tanah(), posisi, 0);
            }
        }else if(posisi == 500){
            if(angka_random == 0){
                posisi = 400;
                addObject(new tanah(), posisi, 0);
            }else{
                posisi = 600;
                addObject(new tanah(), posisi, 0);
            }
        }else{
            posisi = 500;
            addObject(new tanah(), posisi, 0);
        }
        showText("Posisi = "+String.valueOf(posisi)+" Random = "+String.valueOf(angka_random),400,50);
    }
    
    
}
