import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Minion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minion extends Actor
{
    public static int healthMinion = 40;
    GifImage gifImage = new GifImage("Ghost1.gif");
    public void act()
    {
        setImage(gifImage.getCurrentImage());
        Minionattack();
        Shots();
        DontTouch();
    }
    public void DontTouch()
    {
        Actor Hiro = getOneObjectAtOffset(0,0,Hiro.class);
        if(Hiro != null)
        {
          getWorld().removeObject(Hiro);
          Greenfoot.setWorld(new GameOver());
          ((Phase3)getWorld()).stop();
        }
    }
    public void Shots()
    {
        Actor Orb = getOneObjectAtOffset(1,1,Orb.class);
        if (Orb != null)
        {
            getWorld().removeObject(Orb);
            healthMinion--;
        if(healthMinion == 0) 
        {
            getWorld().removeObject(this);
        }
        }
    }
    boolean canAttack = true;
    public void Minionattack()
    {
        int attacking = Greenfoot.getRandomNumber(100);
        if(attacking == 1 && canAttack == true){
            getWorld().addObject(new LastAttack(),getX(),getY()+30);
            canAttack = false;
        }
        else if(attacking == 50 || attacking == 60 || attacking == 80 || attacking == 10){
            canAttack= true;
        }
    }
}
