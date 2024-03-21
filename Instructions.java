import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Buttons
{
    public Instructions()
    {
        GreenfootImage InstructionsButton = new GreenfootImage(100,60);
        Font adjustedFont = new Font(true,false,19);
        InstructionsButton.setFont(adjustedFont);
        InstructionsButton.setColor(Color.WHITE);
        InstructionsButton.drawString("Instructions",0,50);
        setImage(InstructionsButton);
    }
    public void act()
    {
        checkMouse();
        checkClick(new InstructionsWorld());
    }
}
