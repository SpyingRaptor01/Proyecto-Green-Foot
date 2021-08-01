import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.util.List;

public class puzzle extends World
{
    public puzzle()
    {
        super(500, 500, 1, false);
        GreenfootImage image = new GreenfootImage(getWidth(), getHeight());
        image.setColor(Color.BLACK);
        image.fill();
        setBackground(image);
        
        int dx=128;
        int[] index=generateSort(15);
        for(int i=0;i<15;i++){
            int io = i%4;
            int jo = i/4;
            addObject(new caja(index[i]),(int)(0.5*getWidth()-256+0.5*dx+io*dx), (int)(0.5*getHeight()-256+0.5*dx+jo*dx));
        }
    }
    public int[] generateSort(int num)
    {
        int[] result=new int[num];
        for(int i=0;i<num;i++){
            while(true){
                boolean ketemu=false;
                int a=Greenfoot.getRandomNumber(num);
                for(int j=0;j<i;j++){
                    if (a==result[j]){
                        ketemu=true;
                        break;
                    }
                }
                if(!ketemu){
                    result[i]=a;
                    break;
                }
            }
        }
        return result;
    }
    public void cekPosition()
    {
        boolean passed = true;
        List<caja>cajas=getObjects(caja.class);
        if(cajas!=null && cajas.size()>0){
            int dx=128;
            for(int i=0; i<cajas.size();i++){
                int io=(int)Math.round(1.0*cajas.get(i).getX()-256+1.5*dx/dx);
                int jo=(int)Math.round(1.0*cajas.get(i).getX()-256+1.5*dx/dx);
                
                int id=io+jo*4;
                int id1=cajas.get(i).getIndex();
                if(id!=id1){
                    passed =false;
                    break;
                }
            }
        }
        if(passed){
            addObject(new ganaste(),(int)(0.5*getWidth()), (int)(0.5*getHeight()));
        }
    }
}
