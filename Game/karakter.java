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
    MyWorld myWorld = (MyWorld) getWorld();
    int skor = 0;
    boolean stat_tanah = false;
    public karakter(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 860, image.getHeight() - 860);
        setImage(image);
    }
    public void act() 
    {
        loncat();
        jatuh();
        getWorld().showText(String.valueOf(skor),50,50);
        String key = Greenfoot.getKey();
        if(!Greenfoot.isKeyDown("right") && jatuh == false){
            //tekan = false;
            if(!Greenfoot.isKeyDown("left") && jatuh == false){
            tekan = false;
           }
        }
        
    }   
    boolean tekan = false, jatuh = false;
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
    public void gameover(){
        
    }
    public void skorbertambah(){
       skor++;
       
       
    }
    
    
}
