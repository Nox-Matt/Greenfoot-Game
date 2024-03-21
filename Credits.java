import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends Buttons
{
    public Credits()
    {
        GreenfootImage CreditsButton = new GreenfootImage(100,60);
        Font adjustedFont = new Font(true,false,26);
        CreditsButton.setFont(adjustedFont);
        CreditsButton.setColor(Color.WHITE);
        CreditsButton.drawString("Credits",0,50);
        setImage(CreditsButton);
    }
    public void act()
    {
        checkMouse();
        checkClick(new CreditsWorld());
    }
}
