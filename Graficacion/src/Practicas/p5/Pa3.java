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
 *
 * @author antoniocg
 */
public class Pa3 extends Plano{
      @Override
    public void paintComponent(Graphics g) {
       
        _y=getBounds().height/2;
        _x=getBounds().width/2;
        dibujaRecta(g);
        Poligono rombo = new Poligono();
        rombo.AgregaPunto(0, 0);
        rombo.AgregaPunto(90,0);
        rombo.AgregaPunto(120, 50);
        rombo.AgregaPunto(30, 50);
        
//Sx = 2 y Sy = 2
       //punto origen
        Poligono R1set1 =new Poligono();
        R1set1.setPuntos(rombo.getPuntos());
        Transformaciones.Escalacion(R1set1,2,2);
        convertirACartesiano(R1set1);
        R1set1.DibujaPoligono(g, Color.red);
        //centro figura
        Poligono R2set1 =new Poligono();
        R2set1.setPuntos(rombo.getPuntos());
        Transformaciones.EscalacionPf(R2set1,2,2,45,45);
        convertirACartesiano(R2set1);
        R2set1.DibujaPoligono(g, Color.red);
        //vertice
        Poligono R3set1 =new Poligono();
        R3set1.setPuntos(rombo.getPuntos());
        Transformaciones.EscalacionPf(R3set1,2,2,90,0);
        convertirACartesiano(R3set1);
        R3set1.DibujaPoligono(g, Color.red);
      //fuera de la imagen
        Poligono R4set1 =new Poligono();
        R4set1.setPuntos(rombo.getPuntos());
        Transformaciones.EscalacionPf(R4set1,2,2,-10,-10);
       convertirACartesiano(R4set1);
       R2set1.DibujaPoligono(g, Color.red);
        
       //Sx = 0.5   y Sy = 0.5 
       //punto origen
        Poligono R1set2 =new Poligono();
        R1set2.setPuntos(rombo.getPuntos());
        Transformaciones.Escalacion(R1set2,.5,.5);
        convertirACartesiano(R1set2);
        R1set2.DibujaPoligono(g, Color.WHITE);
        //centro figura
        Poligono R2set2 =new Poligono();
        R2set2.setPuntos(rombo.getPuntos());
        Transformaciones.EscalacionPf(R2set2,.5,.5,45,45);
        convertirACartesiano(R2set2);
        R2set2.DibujaPoligono(g, Color.WHITE);
        //vertice
        Poligono R3set2 =new Poligono();
        R3set2.setPuntos(rombo.getPuntos());
        Transformaciones.EscalacionPf(R3set2,.5,.5,90,0);
        convertirACartesiano(R3set2);
        R3set2.DibujaPoligono(g, Color.WHITE);
      //fuera de la imagen
        Poligono R4set2 =new Poligono();
        R4set2.setPuntos(rombo.getPuntos());
        Transformaciones.EscalacionPf(R4set2,.5,.5,-10,-10);
       convertirACartesiano(R4set2);
       R2set2.DibujaPoligono(g, Color.WHITE);
        
       
       //Sx = 1.5 y Sy = 0.5                        
       //punto origen
        Poligono R1set3 =new Poligono();
        R1set3.setPuntos(rombo.getPuntos());
        Transformaciones.Escalacion(R1set3,1.5,.5);
        convertirACartesiano(R1set3);
        R1set3.DibujaPoligono(g, Color.ORANGE);
        //centro figura
        Poligono R2set3 =new Poligono();
        R2set3.setPuntos(rombo.getPuntos());
        Transformaciones.EscalacionPf(R2set3,1.5,.5,45,45);
        convertirACartesiano(R2set3);
        R2set3.DibujaPoligono(g, Color.ORANGE);
        //vertice
        Poligono R3set3 =new Poligono();
        R3set3.setPuntos(rombo.getPuntos());
        Transformaciones.EscalacionPf(R3set3,1.5,.5,90,0);
        convertirACartesiano(R3set3);
        R3set3.DibujaPoligono(g, Color.ORANGE);
      //fuera de la imagen
        Poligono R4set3 =new Poligono();
        R4set3.setPuntos(rombo.getPuntos());
        Transformaciones.EscalacionPf(R4set3,1.5,.5,-10,-10);
       convertirACartesiano(R4set3);
       R2set3.DibujaPoligono(g, Color.ORANGE);
        
        //Sx = 0.5   y Sy = 1.5 
       //punto origen
        Poligono R1set4 =new Poligono();
        R1set4.setPuntos(rombo.getPuntos());
        Transformaciones.Escalacion(R1set2,.5,1.5);
        convertirACartesiano(R1set4);
        R1set4.DibujaPoligono(g, Color.GREEN);
        //centro figura
        Poligono R2set4 =new Poligono();
        R2set4.setPuntos(rombo.getPuntos());
        Transformaciones.EscalacionPf(R2set4,.5,1.5,45,45);
        convertirACartesiano(R2set4);
        R2set4.DibujaPoligono(g, Color.GREEN);
        //vertice
        Poligono R3set4 =new Poligono();
        R3set4.setPuntos(rombo.getPuntos());
        Transformaciones.EscalacionPf(R3set4,.5,1.5,90,0);
        convertirACartesiano(R3set4);
        R3set4.DibujaPoligono(g, Color.GREEN);
      //fuera de la imagen
        Poligono R4set4 =new Poligono();
        R4set4.setPuntos(rombo.getPuntos());
        Transformaciones.EscalacionPf(R4set4,.5,.5,-10,-10);
       convertirACartesiano(R4set4);
       R2set4.DibujaPoligono(g, Color.GREEN);
       
        convertirACartesiano(rombo);
        rombo.DibujaPoligono(g, Color.BLACK);
    
        super.paintComponents(g);
    }
    
}
