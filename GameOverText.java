import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverText extends Actor
{
    public void GameOverString()
    {
        GreenfootImage playButton = new GreenfootImage(200,60);
        Font adjustedFont = new Font(true,false,30);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.RED);
        playButton.drawString("GAME OVER",0,50);
        setImage(playButton);
    }
    public void act()
    {
        GameOverString();
    }
}
