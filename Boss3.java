import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss3 extends Actor
{
    public int BossHealth = 300;
    GifImage gifImage = new GifImage("Boss3.gif");
    public void act()
    {
        setImage(gifImage.getCurrentImage());
        movement();
        bossattack();
        Shots();
        Hiro h = (Hiro) getOneIntersectingObject(Hiro.class);
        if (h != null)
        {
         getWorld().removeObject(h);
         Greenfoot.setWorld(new GameOver());
         ((Phase2)getWorld()).stop();
        }
    }
    public void Shots()
    {
        Actor Orb = getOneObjectAtOffset(0,0, Orb.class);
        if (Orb != null)
        {
            getWorld().removeObject(Orb);
            ((HealthbarPhase3)getWorld().getObjects(HealthbarPhase3.class).get(0)).healthbarsPhase3--;
            BossHealth--;
        if(BossHealth == 0) 
        {
            Greenfoot.setWorld(new Ending());
            ((Phase2)getWorld()).stop();
        }
        }
    }
    public void movement()
    {
        int dodge = Greenfoot.getRandomNumber(20);
        if (dodge == 5 || dodge == 2){
        setLocation(getX()+4,getY());
        }
        else if(dodge == 4 || dodge == 1) {
        setLocation(getX()-3,getY());
        }
        else if(dodge == 3){
        setLocation(getX()-3,getY());    
        }
        else if(dodge == 6 || dodge == 8){
        setLocation(getX()+1,getY());    
        }
    }
    boolean canAttack = true;
    public void bossattack()
    {
        int attacking = Greenfoot.getRandomNumber(100);
        if((attacking == 1 || attacking == 5 || attacking == 10) && canAttack == true){
            getWorld().addObject(new LastBite(),getX(),getY()+30);
            canAttack = false;
        }
        else if(attacking == 50 || attacking == 60 || attacking == 80){
            canAttack= true;
        }
    }
}