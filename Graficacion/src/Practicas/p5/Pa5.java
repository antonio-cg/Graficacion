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
public class Pa5 extends Plano {
     @Override
    public void paintComponent(Graphics g) {
       
        _y=getBounds().height/2;
        _x=getBounds().width/2;
        dibujaRecta(g);
        Poligono fig = new Poligono();
        fig.AgregaPunto(0,0);
        fig.AgregaPunto(40,40);
        fig.AgregaPunto(100,40);
        fig.AgregaPunto(100,120);
        fig.AgregaPunto(20,120);
        fig.AgregaPunto(20,40); 
        //a)Sx = 2 y Sy = 2
        //b)  = 45º
        //c)Sx = 1 y Sy = 0.5
        //d)dx=50 y dy = -25
        //e)   = 90º
        //f)Sx = 1.5 y Sy = 1
        //g)dx=20 y dy = 40
        
        Poligono fig2 = new Poligono();
        fig2.setPuntos(fig.getPuntos());
        Transformaciones.Escalacion(fig2, 2, 2);
        
        
        Poligono fig3 = new Poligono();
        fig3.setPuntos(fig2.getPuntos());
        Transformaciones.rotacionOrigen(fig3, 45);

        Poligono fig4 = new Poligono();
        fig4.setPuntos(fig3.getPuntos());
        Transformaciones.Escalacion(fig4, 1, .5);
        
        Poligono fig5 = new Poligono();
        fig5.setPuntos(fig4.getPuntos());
        Transformaciones.Translacion(fig5, 50, -25);
        
        Poligono fig6 = new Poligono();
        fig6.setPuntos(fig5.getPuntos());
        Transformaciones.rotacionOrigen(fig6, 90);
         
        Poligono fig7 = new Poligono();
        fig7.setPuntos(fig6.getPuntos());
        Transformaciones.Escalacion(fig7, 1.5, 1);
                
        Poligono fig8 = new Poligono();
        fig8.setPuntos(fig7.getPuntos());
        Transformaciones.Translacion(fig8,20, 40);
        
        
        convertirACartesiano(fig2);
        fig2.DibujaPoligono(g, Color.red);
        convertirACartesiano(fig3);
        fig3.DibujaPoligono(g, Color.red);
        convertirACartesiano(fig4);
        fig4.DibujaPoligono(g, Color.red);
        convertirACartesiano(fig5);
        fig5.DibujaPoligono(g, Color.red);
        convertirACartesiano(fig6);
        fig6.DibujaPoligono(g, Color.red);
        convertirACartesiano(fig7);
        fig7.DibujaPoligono(g, Color.red);
        convertirACartesiano(fig8);
        fig8.DibujaPoligono(g, Color.BLUE);
        
        convertirACartesiano(fig);
        
        fig.DibujaPoligono(g, Color.BLACK);
        
    }
}
