import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoToMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoToMenu extends Buttons
{
    public GoToMenu()
    {
        GreenfootImage playButton = new GreenfootImage(200,60);
        Font adjustedFont = new Font(true,false,30);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.BLACK);
        playButton.drawString("Go To Menu",0,50);
        setImage(playButton);
    }
    public void act()
    {
        checkMouse();
        checkClick(new Menu());
    }
}
