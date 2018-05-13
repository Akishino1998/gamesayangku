import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class karakter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class karakter extends Actor
{
    /**
     * Act - do whatever the karakter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int skor = 0;
    
    public karakter(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 860, image.getHeight() - 860);
        setImage(image);
    }
    public void act() 
    {
       loncat();
       jatuh();
       gameover();
       getWorld().showText(String.valueOf(skor),299,380);
       String key = Greenfoot.getKey();
       if(!Greenfoot.isKeyDown("right") && jatuh == false){
          if(!Greenfoot.isKeyDown("left") && jatuh == false){
             tekan = false;
                
          }
        }
    }   
    boolean tekan = false, stat_tanah = false;
    public void loncat(){ 
        if(Greenfoot.isKeyDown("right")){
            if(tekan == false){
                for(int i = 0; i < 10; i++){
                    setLocation(getX()+10, getY()-10);
                    Greenfoot.delay(1);
                    stat_tanah = true;
                }
            }
            tekan = true;
        }
        else if(Greenfoot.isKeyDown("left")){
            if(tekan == false){
               for(int i = 0; i < 10; i++){
                    setLocation(getX()-10, getY()-10);
                    Greenfoot.delay(1);
                    stat_tanah = true;
                }
            }
            tekan = true;
        }
    }
    boolean jatuh = false;
    public void jatuh(){
        if(!isTouching(tanah.class)){
            setLocation(getX(), getY()+3);
            jatuh = true;
            
        }
        else{
            jatuh = false;
            if(stat_tanah == true){
                skorbertambah();
                stat_tanah = false;
            }
        }
    }
    public void skorbertambah(){
       skor++;
       sound_loncat();
    }
    public void sound_loncat(){
        Greenfoot.playSound("Jump_Effect.mp3");
    }
    public void gameover(){
        if(getY()>=400){
            WorldGameOver world = new WorldGameOver(); 
            world.getScore(skor);
            Greenfoot.setWorld(world);
            world.getScore(skor);
        }
    }
    
    
}
