import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Phase2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phase2 extends World
{
    GreenfootSound musicBG2 = new GreenfootSound("Phase2BossFight.mp3");
    /**
     * Constructor for objects of class Phase2.
     * 
     */
    public Phase2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 700, 1);
        prepare();
    }
    public void started()
    {
    musicBG2.play();
    musicBG2.setVolume(40);
    musicBG2.playLoop();
    }
    public void stop()
    {
    musicBG2.stop();
    }
    public void act()
    {
        addAttack();
        started();
    }

    public void addAttack()
    {
        if(Greenfoot.getRandomNumber(80) < 1){
            addObject(new ClockAttack(), Greenfoot.getRandomNumber(600),180);
        }
        if(Greenfoot.getRandomNumber(210) < 1){
            addObject(new AttackHand(), Greenfoot.getRandomNumber(600),100);
        }
        if(Greenfoot.getRandomNumber(300) < 1){
            addObject(new AttackBite(), Greenfoot.getRandomNumber(600),100);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ghost ghost = new Ghost();
        addObject(ghost,207,109);
        Hiro hiro = new Hiro();
        addObject(hiro,200,660);
        ghost.setLocation(202,22);
        HealthbarPhase2 healthbarPhase2 = new HealthbarPhase2();
        addObject(healthbarPhase2,202,22);
        ghost.setLocation(199,120);
        ghost.setLocation(192,181);
        ghost.setLocation(238,149);
        ghost.setLocation(179,134);
        ghost.setLocation(191,124);
        ghost.setLocation(196,88);
        ghost.setLocation(215,136);
        ghost.setLocation(187,60);
        ghost.setLocation(200,133);
    }
}
