import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SomethingInTheDark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SomethingInTheDark extends Actor
{
    public int health = 80;
    public void Shot()
    {
        Actor Orb = getOneObjectAtOffset(0,0, Orb.class);
        if (Orb != null)
        {
            getWorld().removeObject(Orb);
            ((Healthbar)getWorld().getObjects(Healthbar.class).get(0)).healthbars--;
            health--;
        if(health == 0) 
        {
            Greenfoot.setWorld(new Phase2());
            ((MyWorld)getWorld()).stop();
        }
        }
    }
    GifImage Boss = new GifImage("Something_in_the_Dark.gif");
    public void act()
    {
        Shot();
        setImage(Boss.getCurrentImage());
        Hiro h = (Hiro) getOneIntersectingObject(Hiro.class);
        if (h != null)
        {
         getWorld().removeObject(h);
         Greenfoot.setWorld(new GameOver());
         ((Phase2)getWorld()).stop();
        }
    }
}
