import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldGameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldGameOver extends World
{

    /**
     * Constructor for objects of class WorldGameOver.
     * 
     */
    public WorldGameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    boolean playsound = true;
    public void SoundGameOver(){
        if(playsound == true){
            Greenfoot.playSound("GameOver.mp3");
            playsound = false;
            Greenfoot.delay(6);
        }
    }
    private void prepare()
    {
        gameover gameover = new gameover();
        addObject(gameover,316,158);
        retry retry = new retry();
        addObject(retry,321,335);
        retry.setLocation(310,353);
    }
    public void act(){
        SoundGameOver();
        showText("SKORMU "+String.valueOf(score), getWidth()/2,300 );
    }
    int score = 0;
    public void getScore(int skor){
        this.score = skor;
    }
}
