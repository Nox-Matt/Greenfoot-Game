import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Logo logo = new Logo();
        addObject(logo,305,115);
        logo.setLocation(305,115);
        Play play = new Play();
        addObject(play,107,343);
        play.setLocation(107,343);
        Credits credits = new Credits();
        addObject(credits,479,358);
        credits.setLocation(479,358);
        play.setLocation(107,343);
        Instructions instructions = new Instructions();
        addObject(instructions,108,362);
        instructions.setLocation(108,362);
        play.setLocation(107,343);
        instructions.setLocation(108,362);
        credits.setLocation(479,358);
        play.setLocation(107,343);
        logo.setLocation(305,115);
        play.setLocation(305,334);
        credits.setLocation(510,374);
        credits.setLocation(514,350);
        credits.setLocation(514,368);
        instructions.setLocation(61,410);
        play.setLocation(156,557);
        credits.setLocation(300,408);
        logo.setLocation(180,258);
        instructions.setLocation(87,408);
        credits.setLocation(318,409);
        play.setLocation(226,532);
        play.setLocation(177,548);
        logo.setLocation(189,199);
        play.setLocation(234,552);
        play.setLocation(194,560);
        logo.setLocation(224,275);
        logo.setLocation(216,237);
        logo.setLocation(186,168);
        logo.setLocation(240,215);
        logo.setLocation(225,155);
        logo.setLocation(232,136);
        logo.setLocation(250,188);
        logo.setLocation(224,303);
        logo.setLocation(200,175);
        logo.setLocation(362,221);
        logo.setLocation(305,208);
        credits.setLocation(500,424);
        play.setLocation(333,472);
        instructions.setLocation(137,435);
        play.setLocation(319,494);
        credits.setLocation(487,426);
        play.setLocation(324,474);
        logo.setLocation(304,253);
        play.setLocation(278,486);
        play.setLocation(279,547);
        play.setLocation(324,510);
    }
}
