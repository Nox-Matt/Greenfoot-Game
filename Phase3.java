import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Phase3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phase3 extends World
{
    GreenfootSound musicBG3 = new GreenfootSound("Phase3BossFight.mp3");
    /**
     * Constructor for objects of class Phase3.
     * 
     */
    public Phase3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 700, 1);
        prepare();
    }

    public void started()
    {
        musicBG3.play();
        musicBG3.setVolume(40);
        musicBG3.playLoop();
    }

    public void stop()
    {
        musicBG3.stop();
    }

    public void act()
    {
        addAttack();
        started();
    }

    public void addAttack()
    {
        if(Greenfoot.getRandomNumber(100) < 1){
            addObject(new LastAttack(), Greenfoot.getRandomNumber(600),180);
        }
        if(Greenfoot.getRandomNumber(200) < 1){
            addObject(new LastHand(), Greenfoot.getRandomNumber(600),100);
        }
        if(Greenfoot.getRandomNumber(300) < 1){
            addObject(new LastBite(), Greenfoot.getRandomNumber(600),100);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Boss3 boss3 = new Boss3();
        addObject(boss3,208,142);
        Hiro hiro = new Hiro();
        addObject(hiro,212,649);
        hiro.setLocation(218,660);
        boss3.setLocation(207,184);
        boss3.setLocation(195,164);
        HealthbarPhase3 healthbarPhase3 = new HealthbarPhase3();
        addObject(healthbarPhase3,208,33);
        boss3.setLocation(200,153);
        healthbarPhase3.setLocation(218,28);
        healthbarPhase3.setLocation(212,28);
        Minion minion = new Minion();
        addObject(minion,51,292);
        Minion minion2 = new Minion();
        addObject(minion2,335,288);
        minion2.setLocation(340,283);
        minion2.setLocation(344,300);
        Minion minion3 = new Minion();
        addObject(minion3,206,380);
        removeObject(minion3);
        Minion minion4 = new Minion();
        addObject(minion4,203,379);
        removeObject(minion4);
    }
}
