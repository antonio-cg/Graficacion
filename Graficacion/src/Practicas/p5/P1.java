
package Practicas.p5;

import Funciones.Poligono;
import Funciones.TrHomogeneas;
import Funciones.Transformaciones;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author antoniocg
 */
public class P1 extends Funciones.Plano
{

    public P1() {
        
        
    }
    
   @Override
    public void paintComponent(Graphics g) {
       
        _y=getBounds().height/2;
        _x=getBounds().width/2;
        dibujaRecta(g);
        Poligono figura = new Poligono();
       figura.AgregaPunto(30, 40);
       figura.AgregaPunto(70, 40);
       figura.AgregaPunto(70, 20);
       figura.AgregaPunto(120,50);
       figura.AgregaPunto(70, 80);
       figura.AgregaPunto(70, 60);
       figura.AgregaPunto(30, 60);
       //TrHomogeneas t = new TrHomogeneas();
       //double[][] m =figura.MatrizH();
       Transformaciones.rotacionPunto(figura, 45, 0, 0);
       Transformaciones.rotacionPunto(figura, 90, 80, 50);
       Transformaciones.rotacionPunto(figura, 135, 30, 60);
       //m=t.multMat(t.Rotacion(90),m);
       //m=t.multMat(t.Rotacion(135),m);
       //m=t.multMat(t.Rotacion(180),m);
       //figura.regresaPuntos(m);
       convertirACartesiano(figura);
       
        // anadeFigura(rombo2);
        
        //rombo = Transformaciones.rotacionPunto(rombo,300,100,180);
      figura.DibujaPoligono(g, Color.red);
        
     
      // anadeFigura(rombo2);
       
         
      
    
        super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
            
}
