import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Counter counter = new Counter();
    Hiro hiro = new Hiro();
    Healthbar healthbar = new Healthbar();
    GreenfootSound musicBG = new GreenfootSound("BackgroundMusic.mp3");
    public void started()
    {
    musicBG.play();
    musicBG.setVolume(40);
    musicBG.playLoop();
    }
    public void stop()
    {
    musicBG.stop();
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 700, 1);
        prepare();
    }
    public void act()
    {
    addAttack();
    started();
    }
    public void addAttack()
    {
        if(Greenfoot.getRandomNumber(80) < 1){
    addObject(new Attack(), Greenfoot.getRandomNumber(600),180);
    }
        if(Greenfoot.getRandomNumber(120) < 1){
    addObject(new Attack1(), Greenfoot.getRandomNumber(600),100);
    }
    }
    public Counter getCounter()
    {
        return counter;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public Healthbar getHealthbar()
    {
        return healthbar;
    }
    
    private void prepare()
    {

        Attack2 attack2 = new Attack2();
        addObject(attack2,82,316);
        attack2.setLocation(139,344);
        Attack3 attack3 = new Attack3();
        addObject(attack3,264,321);
        attack3.setLocation(313,357);
        SomethingInTheDark somethingInTheDark = new SomethingInTheDark();
        addObject(somethingInTheDark,204,165);
        somethingInTheDark.setLocation(210,141);
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,204,40);
        Hiro hiro = new Hiro();
        addObject(hiro,220,640);
        hiro.setLocation(210,643);
        somethingInTheDark.setLocation(205,148);
        attack2.setLocation(56,352);
        attack2.setLocation(144,348);
        attack2.setLocation(89,356);
    }
}
