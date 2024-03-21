import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LastBite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LastBite extends Actor
{
    /**
     * Act - do whatever the LastBite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gifImage = new GifImage("Bitting.gif");
    public void act()
    {
        setImage(gifImage.getCurrentImage());
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
    setLocation(getX(),getY()+8);
    }
    public void cleanAttack(){
    if(getY() == 699)
        {
            getWorld().removeObject(this);
        }
    }
}
