import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Buttons
{
    public Restart()
    {
        GreenfootImage playButton = new GreenfootImage(200,60);
        Font adjustedFont = new Font(true,false,30);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.BLACK);
        playButton.drawString("Restart",0,50);
        setImage(playButton);
    }
    public void act()
    {
        checkMouse();
        checkClick(new Introduction());
    }
}
