import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class gatotaco extends Actor
{  
    GreenfootSound myMusic = new GreenfootSound("Michitaco_OST.mp3");
    GreenfootSound GameOver = new GreenfootSound("Game_over.mp3");
 public void act()
    {
                int y = getY();
                int x = getX();
        myMusic.playLoop();
        if (golpeenemigo())
        {
            Greenfoot.setWorld(new gameover());
            myMusic.pause();
            GameOver.play();
        }
        if (tocarmeta())
        {
            Greenfoot.setWorld(new puzzle());
            myMusic.pause();
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x+2, y);
            if (golpepared())
            {
                setLocation(x-2, y);
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x-2, y);
            if (golpepared())
            {
                setLocation(x+2, y);
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y-2);
             if (golpepared1())
            {
                setLocation(x, y+2);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y+2);
               if (golpepared1())
            {
                setLocation(x, y-2);
            }
        }
    }
    public boolean golpepared()
    {
    if (isTouching(pared.class))
    {
        return true;
    }
    else  
    {
        return false;
    }
 }
    public boolean golpepared1()
    {
    if (isTouching(paredH.class))
    {
        return true;
    }
    else  
    {
        return false;
    }
 }
 public boolean golpeenemigo()
    {
    if (isTouching(perro.class))
    {
        return true;
    }
    else  
    {
        return false;
    }
  }
 public boolean tocarmeta()
    {
    if (isTouching(meta.class))
    {
        return true;
    }
    else  
    {
        return false;
    }
  }
}
