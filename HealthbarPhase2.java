import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthbarPhase2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthbarPhase2 extends Actor
{
    /**
     * Act - do whatever the HealthbarPhase2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int healthbarsPhase2 = 100;
    int healthbarWidth = 100;
    int healthbarHeight = 15;
    int pixelsPerHealthPoint = (int)healthbarWidth/healthbarsPhase2;
    public void Healthbars()
    {
        updateHealthPhase2();
    }
    public void act()
    {
        updateHealthPhase2();
    }
    public void updateHealthPhase2()
    {
     setImage(new GreenfootImage(healthbarWidth + 2, healthbarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthbarWidth + 1, healthbarHeight + 1);
        myImage.setColor(Color.BLUE);
        myImage.fillRect(1,1, healthbarsPhase2*pixelsPerHealthPoint, healthbarHeight);
    } 
    public void lostHealthPhase2(){
        healthbarsPhase2--;
    }
}
