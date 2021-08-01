import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class perro4 extends perro3
{
 public void act()
    {
        int y = getY();
        int x = getX();
        setLocation(x+1, y);
        if (golpepared())
            {
                setLocation(x-300, y);
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
}
