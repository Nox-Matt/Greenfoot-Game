import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Stack;

/**
 * Write a description of class Orb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orb extends Actor
{
    boolean hit = false;
    int hitCount2;
    int hitCount3;
    int hitMinionCount;
    Counter counter = new Counter();
    public void act()
    {
        orbMove();
        hit2();
        hit3();
        hitMinion();
        clean();
    }
    
        public void orbMove(){
        setLocation(getX(),getY()-5);
        }
        public void hitMinion(){
        Actor Minion = getOneIntersectingObject(Minion.class);
        if(Minion == getOneIntersectingObject(Minion.class));
        {
            hitMinionCount++;
        }
        }
        public void hit2(){
        Actor Attack2 = getOneIntersectingObject(Attack2.class);
        if(Attack2 == getOneIntersectingObject(Attack2.class));
        {
          hitCount2++;  
        }
    }
    public void hit3(){
        Actor Attack3 = getOneIntersectingObject(Attack3.class);
        if(Attack3 == getOneIntersectingObject(Attack3.class));
        {
          hitCount3++;  
        }
    }
    public void clean()
    {
        Actor Attack = getOneIntersectingObject(Attack.class);
        Actor Attack1 = getOneIntersectingObject(Attack1.class);
        Actor Attack2 = getOneIntersectingObject(Attack2.class);
        Actor Attack3 = getOneIntersectingObject(Attack3.class);
        Actor AttackHand = getOneIntersectingObject(AttackHand.class);
        Actor LastHand = getOneIntersectingObject(LastHand.class);
        Actor LastAttack = getOneIntersectingObject(LastAttack.class);
        Actor ClockAttack = getOneIntersectingObject(ClockAttack.class);
        Actor AttackBite = getOneIntersectingObject(AttackBite.class);
        Actor LastBite = getOneIntersectingObject(LastBite.class);
        Actor Minion = getOneIntersectingObject(Minion.class);
        Actor Boss1 = getOneIntersectingObject(SomethingInTheDark.class);
        int AttackScore = 10;
        int MinionScore= 50;
        
       if(getY()==0) 
        {
        getWorld().removeObject(this);
        return;
        }
        else if (Attack!= null || Attack1!= null || AttackHand != null || ClockAttack != null || AttackBite != null || LastHand != null || LastAttack != null || LastBite != null)
        {   
        getWorld().removeObject(Attack);
        getWorld().removeObject(Attack1);
        getWorld().removeObject(AttackHand);
        getWorld().removeObject(AttackBite);
        getWorld().removeObject(ClockAttack);
        getWorld().removeObject(LastAttack);
        getWorld().removeObject(LastHand);
        getWorld().removeObject(LastBite);
        getWorld().removeObject(this);
        return;
        }
        else if(hitCount2 == 5 && Attack2 != null )
        {
        getWorld().removeObject(Attack2);
        getWorld().removeObject(this);
        return;
        }
        else if(hitCount3 == 5 && Attack3 != null )
        {
        getWorld().removeObject(Attack3);
        getWorld().removeObject(this);
        return;
        }
        else if(hitMinionCount == 30 && Minion != null)
        {
        getWorld().removeObject(Minion);
        getWorld().removeObject(this);
        return;
        }
    }
    public void HitBoss()
    {
        World myWorld = getWorld();
        World world = (MyWorld)myWorld;
        Healthbar healthbar =((MyWorld)getWorld()).getHealthbar();
        if(hit == true)
        {
            healthbar.lostHealth();
            healthbar.updateHealth();
            hit=true;
        }
        }
    }


