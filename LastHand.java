import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LastHand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LastHand extends Actor
{
    private int health = 5;
    GifImage Hand = new GifImage("Fear_Hand_29.gif");
    /**
     * Act - do whatever the AttackHand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Hiro h = (Hiro) getOneIntersectingObject(Hiro.class);
    if (h != null)
    {
     getWorld().removeObject(h);
     Greenfoot.setWorld(new GameOver());
     ((Phase3)getWorld()).stop();
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