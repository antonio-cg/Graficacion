/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas.p5;

import Funciones.Plano;
import Funciones.Poligono;
import Funciones.Transformaciones;
import java.awt.Color;
import java.awt.Graphics;

/**
 *Hacer un applet que dibuje un trapecio y aplicar las siguientes transformaciones de traslación:

a)dx = 0              b)dx = 20         c)dx = 30
   dy = 20                dy =  -50           dy = 75
  
Dibujar de diferente color la figura resultante, las dos transformaciones se aplicaran sobre el objeto que vaya resultando de cada transformación. 
 * @author antoniocg
 */
public class Pa2 extends Plano {
     @Override
    public void paintComponent(Graphics g) {
       
        _y=getBounds().height/2;
        _x=getBounds().width/2;
        dibujaRecta(g);
        Poligono rombo = new Poligono();
        rombo.AgregaPunto(0, 0);
        rombo.AgregaPunto(15,50);
        rombo.AgregaPunto(60, 50);
        rombo.AgregaPunto(70, 0);
        
        Poligono Rombo2 =new Poligono();
        Rombo2.setPuntos(rombo.getPuntos());
        Transformaciones.Translacion(Rombo2,0,20);
        
        Poligono Rombo3 =new Poligono();
        Rombo3.setPuntos(Rombo2.getPuntos());
        Transformaciones.Translacion(Rombo3,20,-50);
        
        
         Poligono Rombo4 =new Poligono();
        Rombo4.setPuntos(Rombo3.getPuntos());
        Transformaciones.Translacion(Rombo4,30,75);
        
         convertirACartesiano(rombo);
         convertirACartesiano(Rombo2);
         convertirACartesiano(Rombo3);
         convertirACartesiano(Rombo4);
        //anadeFigura(RomboM);
        rombo.DibujaPoligono(g, Color.red);
        Rombo2.DibujaPoligono(g, Color.BLUE);
        Rombo3.DibujaPoligono(g, Color.PINK);
        Rombo4.DibujaPoligono(g, Color.WHITE);
        
        super.paintComponents(g);
    }
}
