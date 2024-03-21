import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Healthbar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Healthbar extends Actor
{
    /**
     * Act - do whatever the Healthbar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int healthbars = 80;
    int healthbarWidth = 80;
    int healthbarHeight = 15;
    int pixelsPerHealthPoint = (int)healthbarWidth/healthbars;
    public Healthbar()
    {
        updateHealth();
    }
    public void act()
    {
        updateHealth();
    }
    public void updateHealth()
    {
     setImage(new GreenfootImage(healthbarWidth + 2, healthbarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthbarWidth + 1, healthbarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1,1, healthbars*pixelsPerHealthPoint, healthbarHeight);
    } 
    public void lostHealth(){
        healthbars--;
    }
}
