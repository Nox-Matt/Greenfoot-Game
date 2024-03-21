import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClockAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockAttack extends Actor
{
    /**
     * Act - do whatever the ClockAttack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    Hiro h = (Hiro) getOneIntersectingObject(Hiro.class);
    if (h != null)
    {
     getWorld().removeObject(h);
     Greenfoot.setWorld(new GameOver());
     ((Phase2)getWorld()).stop();
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
