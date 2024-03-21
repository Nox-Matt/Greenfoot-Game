import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack3 extends Actor
{
    public static int health = 20;
    public void GetShot()
    {
        Actor Orb = getOneObjectAtOffset(0,0, Orb.class);
        if (Orb != null)
        {
            getWorld().removeObject(Orb);
            health--;
            if(health == 0) {
               getWorld().removeObject(this); 
            }
        }
    }
    GifImage Hand = new GifImage("Fear_Hand_29.gif");
    public Attack3()
    {
      setRotation(90);  
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
        GetShot();
        setImage(Hand.getCurrentImage());
    }
}
