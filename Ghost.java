import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost extends Actor
{
    /**
     * Act - do whatever the Ghost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int healths = 100;
    GifImage gifImage = new GifImage("Ghost1.gif");
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
            ((HealthbarPhase2)getWorld().getObjects(HealthbarPhase2.class).get(0)).healthbarsPhase2--;
            healths--;
        if(healths == 0 && Orb != null) 
        {
            Greenfoot.setWorld(new Phase3());
            ((Phase2)getWorld()).stop();
        }
        }
    }
    public void movement()
    {
        int dodge = Greenfoot.getRandomNumber(20);
        if (dodge == 5 || dodge == 2){
        setLocation(getX()+5,getY());
        }
        else if(dodge == 4 || dodge == 1) {
        setLocation(getX()-5,getY());
        }
        else if(dodge == 3){
        setLocation(getX()-2,getY());    
        }
        else if(dodge == 6 || dodge == 8){
        setLocation(getX()+1,getY());    
        }
    }
    boolean canAttack = true;
    public void bossattack()
    {
        int attacking = Greenfoot.getRandomNumber(100);
        if(attacking == 1 && canAttack == true){
            getWorld().addObject(new ClockAttack(),getX(),getY()+30);
            canAttack = false;
        }
        else if(attacking == 50 || attacking == 60 || attacking == 80){
            canAttack= true;
        }
    }
}
