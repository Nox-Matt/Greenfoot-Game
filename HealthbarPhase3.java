import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthbarPhase3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthbarPhase3 extends Actor
{
    int healthbarsPhase3 = 300;
    int healthbarWidth = 300;
    int healthbarHeight = 15;
    int pixelsPerHealthPoint = (int)healthbarWidth/healthbarsPhase3;
    public void Healthbars()
    {
        updateHealthPhase3();
    }
    public void act()
    {
        updateHealthPhase3();
    }
    public void updateHealthPhase3()
    {
     setImage(new GreenfootImage(healthbarWidth + 2, healthbarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthbarWidth + 1, healthbarHeight + 1);
        myImage.setColor(Color.YELLOW);
        myImage.fillRect(1,1, healthbarsPhase3*pixelsPerHealthPoint, healthbarHeight);
    } 
    public void lostHealthPhase3(){
        healthbarsPhase3--;
    }
}
