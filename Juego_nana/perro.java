import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class perro extends Actor
{
  public void act()
    {
        int y = getY();
        int x = getX();
        setLocation(x, y+1);
        if (golpepared1())
            {
                setLocation(x, y-170);
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

}

