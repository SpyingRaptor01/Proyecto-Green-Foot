import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class gameover extends World
{
    public gameover()
    {
        super(800, 400, 1);
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight());
        bg.setColor(Color.BLACK);
        bg.fillRect(0, 0, getWidth(), getHeight());
        setBackground(bg);
        Font f = new Font("SansSerif", 60);
        bg.setFont(f);
        bg.setColor(Color.BLUE);
        String message = "GAME OVER";
        bg.drawString(message, getWidth()-550,getHeight()-200);
     }
}
