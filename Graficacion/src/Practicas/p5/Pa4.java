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
public class Pa4 extends Plano {
       @Override
    public void paintComponent(Graphics g) {
       
        _y=getBounds().height/2;
        _x=getBounds().width/2;
        dibujaRecta(g);
        Poligono flecha = new Poligono();
        flecha.AgregaPunto(20, 20);
        flecha.AgregaPunto(120,20);
        flecha.AgregaPunto(120, 0);
        flecha.AgregaPunto(160, 40);
        flecha.AgregaPunto(120, 100);
        flecha.AgregaPunto(120, 80);
        flecha.AgregaPunto(20, 80);
           

        //a)angle  = 45º 
        
        Poligono F1set1 = new Poligono();
        F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionOrigen(F1set1, 45);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.red);
        //centro
        F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionPunto(F1set1, 45, 100, 40);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.red);
        //vertice
        F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionPunto(F1set1, 45, 20, 80);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.red);
        //fuera
        F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionPunto(F1set1, 45, -20, -80);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.red);
        
        //b)angle  = 90º 
         F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionOrigen(F1set1, 90);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.WHITE);
        //centro
        F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionPunto(F1set1, 90, 100, 40);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.WHITE);
        //vertice
        F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionPunto(F1set1, 90, 20, 80);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.WHITE);
        //fuera
        F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionPunto(F1set1, 90, -20, -80);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.WHITE);
        
        //c)angle  = 135º 
         F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionOrigen(F1set1, 135);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.ORANGE);
        //centro
        F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionPunto(F1set1, 135, 100, 40);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.ORANGE);
        //vertice
        F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionPunto(F1set1, 135, 20, 80);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.ORANGE);
        //fuera
        F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionPunto(F1set1, 135, -20, -80);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.ORANGE);
        
         
        //d)angle  = 180º 
         F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionOrigen(F1set1, 180);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.PINK);
        //centro
        F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionPunto(F1set1, 180, 100, 40);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.PINK);
        //vertice
        F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionPunto(F1set1, 180, 20, 80);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.PINK);
        //fuera
        F1set1.setPuntos(flecha.getPuntos());
        Transformaciones.rotacionPunto(F1set1, 180, -20, -80);
        convertirACartesiano(F1set1);
        F1set1.DibujaPoligono(g, Color.PINK);
        
        
        
        
        convertirACartesiano(flecha);
           flecha.DibujaPoligono(g, Color.black);
                
          
        
    }
    
}
