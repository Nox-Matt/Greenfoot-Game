import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Buttons
{
    public Back()
    {
        GreenfootImage playButton = new GreenfootImage(100,60);
        Font adjustedFont = new Font(true,false,40);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.WHITE);
        playButton.drawString("Back",0,50);
        setImage(playButton);
    }
    public void act()
    {
        checkMouse();
        checkClick(new Menu());
    }
}
