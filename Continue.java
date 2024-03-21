import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Continue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Continue extends Buttons
{
    public Continue()
    {
        GreenfootImage playButton = new GreenfootImage(200,60);
        Font adjustedFont = new Font(true,false,30);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.WHITE);
        playButton.drawString("Continue",0,50);
        setImage(playButton);
    }
    public void act()
    {
        checkMouse();
        checkClick(new MyWorld());
    }
}
