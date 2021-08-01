import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
public class caja extends Actor
{
    private static String  kata="ABCDEFGHIJKLMNOPQ";
    private int index=0;
    private boolean drag=false;
    private int rx=0, ry=0, arahmove=0;
    public caja ()
    {
        
    }
    public caja(int a)
    {
        index = a;
    }
    public int getIndex()
    {
        return index;
    }
    public void addedToWorld(World puzzle)
    {
        GreenfootImage image=new GreenfootImage(128, 128);
        image.setColor(Color.WHITE);
        image.fill();
        GreenfootImage word=new GreenfootImage(""+kata.charAt(index),150,new Color(150, 0, 0), null);
        image.drawImage(word,(int)(0.5*(image.getWidth()-word.getWidth())),(int)(0*(image.getWidth()-word.getWidth())));
        image.setColor(new Color(100, 100, 100));
        image.drawRect(0, 0, image.getWidth()-1, image.getHeight()-1);
        setImage(image);
    }
    public caja cekCollision(int posx, int posy)
    {
        List<caja> cajas=getWorld().getObjects(caja.class);
        if(cajas!=null && cajas.size()>0){
            List<Integer> idobject = new ArrayList<Integer>();
            for(int i=0;i<cajas.size();i++){
                if(!cajas.get(i).equals(this)){
                    int bts=2;
                    int axo=(int)Math.round(cajas.get(i).getX()-0.5*cajas.get(i).getImage().getWidth()+bts);
                    int bxo=(int)Math.round(cajas.get(i).getX()+0.5*cajas.get(i).getImage().getWidth()-bts);   
                    int ax1=(int)Math.round(posx-0.5*getImage().getWidth()+bts);
                    int bx1=(int)Math.round(posx+0.5*getImage().getWidth()-bts);
                    int ayo=(int)Math.round(cajas.get(i).getX()-0.5*cajas.get(i).getImage().getHeight()+bts);
                    int byo=(int)Math.round(cajas.get(i).getX()+0.5*cajas.get(i).getImage().getHeight()-bts);   
                    int ay1=(int)Math.round(posy-0.5*getImage().getHeight()+bts);
                    int by1=(int)Math.round(posy+0.5*getImage().getHeight()-bts);
                    
                    if(bx1<axo || bxo<ax1)continue;
                    if(by1<ayo || byo<ay1)continue;
                    
                    int rx=(Math.abs(cajas.get(i).getX()-posx));
                    int ry=(Math.abs(cajas.get(i).getY()-posy));
                    
                    idobject.add(i);
                    idobject.add((rx<ry)?rx:ry);
                }
            }
            if(idobject.size()>2){
                int id=0, r=0;
                for(int i=0;i<idobject.size()/2;i++){
                    if(i==0){
                        id=idobject.get(2*i+0);
                        r=idobject.get(2*i+1);
                    }else{
                        if(idobject.get(2*i+1)<r){
                            id=idobject.get(2*i+0);
                            r=idobject.get(2*i+1);
                        }
                    }
                }
                return cajas.get(id);
            }else if(idobject.size()>0){
                return cajas.get(idobject.get(0));
            }else if(idobject.size()==0)return null;
        }
        return null;
    }
    public void  moveTo(int posx, int posy, int mode)
    {
        int dx=posx-getX();
        int dy=posy-getY();
        
        if(mode==1){
            if(arahmove==0){
                if(Math.abs(dx)>Math.abs(dy)){
                    arahmove=1;
                }else{
                    arahmove=2;
                }
            }
            if(arahmove==0)return;
            if(arahmove==1){
                posy=getY();
                if(Math.abs(dx)>128)return;
            }else if(arahmove==2){
                posx=getX();
                if(Math.abs(dy)>128)return;
            }
        }
        if(posx<0.5*getWorld().getWidth()-256+64){
            posx=(int)Math.round(0.5*getWorld().getWidth()-256+64);
        }
        if(posx>0.5*getWorld().getWidth()-256+64){
            posx=(int)Math.round(0.5*getWorld().getWidth()-256+64);
        }
        if(posx<0.5*getWorld().getHeight()-256+64){
            posy=(int)Math.round(0.5*getWorld().getHeight()-256+64);
        }
        if(posx>0.5*getWorld().getHeight()-256+64){
            posy=(int)Math.round(0.5*getWorld().getHeight()-256+64);
        }
        caja cajao = cekCollision(posx, posy);
        if(cajao!=null){
            if(arahmove==1 || mode==0){
                if(getX()<cajao.getX()){
                   cajao.moveTo((int)Math.round(posx+0.5*(getImage().getWidth()+cajao.getImage().getWidth())),cajao.getY(),0);
                   posx=(int)Math.round(cajao.getX()-0.5*(getImage().getWidth()+cajao.getImage().getWidth())); 
                }else if(getX()>cajao.getX()){
                    cajao.moveTo((int)Math.round(posx-0.5*(getImage().getWidth()+cajao.getImage().getWidth())),cajao.getY(),0);
                    posx=(int)Math.round(cajao.getX()+0.5*(getImage().getWidth()+cajao.getImage().getWidth())); 
                }
            }else if(arahmove==2){
                if(getY()<cajao.getY()){
                   cajao.moveTo(cajao.getX(),(int)Math.round(posy+0.5*(getImage().getHeight()+cajao.getImage().getHeight())),0);
                   posx=(int)Math.round(cajao.getY()-0.5*(getImage().getHeight()+cajao.getImage().getHeight())); 
                }else if(getY()>cajao.getY()){
                    cajao.moveTo(cajao.getX(),(int)Math.round(posy-0.5*(getImage().getHeight()+cajao.getImage().getHeight())),0);
                    posx=(int)Math.round(cajao.getY()+0.5*(getImage().getHeight()+cajao.getImage().getHeight())); 
              }
             } 
        }
        setLocation(posx, posy);
    }
    public void act()
    {
        if(Greenfoot.mouseDragged(this)){
            MouseInfo mouse=Greenfoot.getMouseInfo();
            if(!drag){
                drag=false;
                rx=getX()-mouse.getX();
                ry=getY()-mouse.getY();
            }else{
                int posx=mouse.getX()+rx;
                int posy=mouse.getY()+ry;
                moveTo(posx, posy, 1);
            }
        }
        if(Greenfoot.mouseDragged(this)){
           drag=true; 
           arahmove = 0;
           
           ((puzzle)getWorld()).cekPosition();
        }
    }
}
