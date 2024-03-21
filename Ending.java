import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ending here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ending extends World
{

    /**
     * Constructor for objects of class Ending.
     * 
     */
    public Ending()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 400, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GoToMenu goToMenu = new GoToMenu();
        addObject(goToMenu,91,338);
        goToMenu.setLocation(136,352);
        Restart restart = new Restart();
        addObject(restart,395,353);
        restart.setLocation(407,360);
        restart.setLocation(384,361);
        restart.setLocation(411,363);
        restart.setLocation(391,330);
        restart.setLocation(423,350);
        goToMenu.setLocation(86,358);
        goToMenu.setLocation(155,342);
        goToMenu.setLocation(171,355);
        goToMenu.setLocation(161,360);
        goToMenu.setLocation(167,360);
        goToMenu.setLocation(148,280);
        restart.setLocation(386,292);
        restart.setLocation(347,300);
        restart.setLocation(387,276);
        goToMenu.setLocation(174,284);
        goToMenu.setLocation(152,292);
        goToMenu.setLocation(187,273);
        restart.setLocation(331,271);
        goToMenu.setLocation(135,276);
        restart.setLocation(394,287);
        restart.setLocation(335,268);
        restart.setLocation(336,282);
        restart.setLocation(420,296);
        restart.setLocation(401,280);
        restart.setLocation(366,288);
        restart.setLocation(390,272);
        restart.setLocation(405,288);
        restart.setLocation(404,288);
        restart.setLocation(367,280);
        restart.setLocation(410,292);
        restart.setLocation(436,258);
        restart.setLocation(451,265);
        restart.setLocation(439,275);
    }
}
