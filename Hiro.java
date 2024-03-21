import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hiro extends Actor
{   
    private int hitcounter = 1;
    boolean canFire = true;
    GifImage gifImage = new GifImage("Omori-Sprite-2.gif");
    /**
     * Act - do whatever the Hiro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(gifImage.getCurrentImage());
        controller();
        shoots();
    }
       public void controller(){
    if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
    {
        setLocation(getX()+5,getY());
    }
    if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
    {
        setLocation(getX()-5,getY());
    }
    if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w"))
    {
        setLocation(getX(),getY()-5);
    }
    if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
    {
        setLocation(getX(),getY()+5);
    }
}
    public void shoots(){
    if(Greenfoot.isKeyDown("space") && canFire == true){
        getWorld().addObject(new Orb(),getX(),getY()-30);
        canFire = false;
    }
    else if(!Greenfoot.isKeyDown("space")){
        canFire = true;
    }
}
    public void gotHit(){
    Actor Attack = getOneIntersectingObject(Attack.class);
    Actor Attack1 = getOneIntersectingObject(Attack1.class);
    Actor Attack2 = getOneIntersectingObject(Attack2.class);
    Actor Boss1 = getOneIntersectingObject(SomethingInTheDark.class);
    if (Attack != null || Attack1 != null || Boss1 != null || Attack2 != null)
    {
     getWorld().removeObject(Attack);
     getWorld().removeObject(Attack1);
     getWorld().removeObject(Boss1);
     getWorld().removeObject(Attack2);
     getWorld().removeObject(this);
     Greenfoot.setWorld(new GameOver());
     ((MyWorld)getWorld()).stop();
    }   
}
}

