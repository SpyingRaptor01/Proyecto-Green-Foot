import lang.stride.*;
import java.util.*;
import greenfoot.*;


public class fondo1 extends World
{
    public fondo1()
    {
        super(1000, 550, 1); 
        paredes();
        addObject(new gatotaco(), 31, 34);
        addObject(new perro(), 133, 49);
        addObject(new perro2(), 694, 49);
        addObject(new perro3(), 810, 262);
        addObject(new perro4(), 610, 328);
        addObject(new perro5(), 809, 436);
    }
    private void paredes()
    {
        addObject(new meta(), 970, 508);
        addObject(new pared(), 90, 35);
        addObject(new pared(), 90, 111);
        addObject(new pared(), 90, 187 );
        addObject(new pared(), 413, 187);
        addObject(new pared(), 649, 323);
        addObject(new pared(), 526, 114);
        addObject(new pared(), 526, 178);
        addObject(new pared(), 526, 257);
        addObject(new pared(), 653,  39);
        addObject(new pared(), 786, 116);
        addObject(new pared(), 898, 194);
        addObject(new pared(), 573, 256);
        addObject(new pared(), 648, 400);
        addObject(new pared(), 299, 400);
        addObject(new pared(), 115, 394);
        addObject(new pared(), 115, 453);
        addObject(new pared(), 771, 443);
        addObject(new pared(), 996, 42);
        addObject(new pared(), 996, 118);
        addObject(new pared(), 996, 198);
        addObject(new pared(), 996, 278);
        addObject(new pared(), 996, 329 );
        addObject(new pared(), 996, 370);
        addObject(new pared(), 996, 436 );
        addObject(new pared(), 996, 512 );
        addObject(new pared(), 0, 42);
        addObject(new pared(), 0, 118);
        addObject(new pared(), 0, 198);
        addObject(new pared(), 0, 278);
        addObject(new pared(), 0, 329 );
        addObject(new pared(), 0, 370);
        addObject(new pared(), 0, 436 );
        addObject(new pared(), 0, 512 );      
        addObject(new paredH(), 26, 4);
        addObject(new paredH(), 204, 4 );
        addObject(new paredH(), 382, 4 );
        addObject(new paredH(), 560, 4);
        addObject(new paredH(), 742, 4 );
        addObject(new paredH(), 910, 4 );
        addObject(new paredH(), 437,78);
        addObject(new paredH(), 271, 78);
        addObject(new paredH(), 437, 78);
        addObject(new paredH(), 175, 224);
        addObject(new paredH(), 321, 224);
        addObject(new paredH(), 328, 150);
        addObject(new paredH(), 272, 150);
        addObject(new paredH(), 88, 295);
        addObject(new paredH(), 263, 295);
        addObject(new paredH(), 442, 295);
        addObject(new paredH(), 488, 295);
        addObject(new paredH(), 612, 157);
        addObject(new paredH(), 764, 157);
        addObject(new paredH(), 808, 157);
        addObject(new paredH(), 914, 363);
        addObject(new paredH(), 739, 363);
        addObject(new paredH(), 557, 436);
        addObject(new paredH(), 384, 436);
        addObject(new paredH(), 206, 361);
        addObject(new paredH(), 203, 488);
        addObject(new paredH(), 357, 488);
        addObject(new paredH(), 532, 488);
        addObject(new paredH(), 686, 488);
        addObject(new paredH(), 855, 404);
        addObject(new paredH(), 980, 404);
        addObject(new paredH(), 26 , 546);
        addObject(new paredH(), 204, 546);
        addObject(new paredH(), 382, 546);
        addObject(new paredH(), 560, 546);
        addObject(new paredH(), 742, 546);
        addObject(new paredH(), 910, 546);
    }
}
