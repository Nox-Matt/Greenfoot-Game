import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack1 extends Actor
{
    GifImage Hand = new GifImage("Fear_Hand_29.gif");
    /**
     * Act - do whatever the Attack1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Attack1()
    {
     setRotation(0);
    }
    public void act()
    {
        Hiro h = (Hiro) getOneIntersectingObject(Hiro.class);
    if (h != null)
    {
     getWorld().removeObject(h);
     Greenfoot.setWorld(new GameOver());
     ((MyWorld)getWorld()).stop();
    }
        stutterMove();
        AttackMove();
        cleanAttack();
    }
    public void stutterMove(){
      setLocation(getX(),getY()+1);
        setImage(Hand.getCurrentImage());
        if (Greenfoot.getRandomNumber(60) == 5){
        setLocation(getX()+2,getY());    
        }
        else if(Greenfoot.getRandomNumber(60) == 10){
        setLocation(getX()-3,getY());    
        } 
        else if(Greenfoot.getRandomNumber(60) == 15){
        setLocation(getX()+2,getY());
        }
        else if(Greenfoot.getRandomNumber(60) == 20){
        setLocation(getX()-3,getY());
        }   
    }
    public void AttackMove(){
        if(Greenfoot.getRandomNumber(60) < 10){
        setLocation(getX(),getY()+3);
        }
    }
    public void cleanAttack(){
    if(getY() == 699)
        {
        getWorld().removeObject(this);
        }
}
}