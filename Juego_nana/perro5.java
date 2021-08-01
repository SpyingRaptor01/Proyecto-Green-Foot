import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class perro5 extends perro4
{
 public void act()
    {
        int y = getY();
        int x = getX();
        setLocation(x, y+1);
        if (golpepared1())
            {
                setLocation(x, y-100);
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
