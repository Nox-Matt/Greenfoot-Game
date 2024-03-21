import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LastAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LastAttack extends Actor
{
    public void act()
    {
    Hiro h = (Hiro) getOneIntersectingObject(Hiro.class);
    if (h != null)
    {
     getWorld().removeObject(h);
     Greenfoot.setWorld(new GameOver());
     ((Phase3)getWorld()).stop();
    }
    AttackMove();
    cleanAttack();
    }
    public void AttackMove(){
    setLocation(getX(),getY()+4);
    }
    
    public void cleanAttack(){
    if(getY() == 699)
        {
            getWorld().removeObject(this);
        }
    }
}