
package Practicas.p5;

import Funciones.Poligono;
import Funciones.TrHomogeneas;
import Funciones.Transformaciones;
import java.applet.Applet;
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
        Poligono rombo = new Poligono();
        rombo.AgregaPunto(-100,-20);
        rombo.AgregaPunto(-140,-80);
        rombo.AgregaPunto(-100,-180);
        rombo.AgregaPunto(-60,-80);
        Poligono rombo2 = new Poligono();
        rombo2.AgregaPunto(-140,-60);
        rombo2.AgregaPunto(-180,-120);
        rombo2.AgregaPunto(-140,-220);
        rombo2.AgregaPunto(-100,-120);
        rombo2 = Transformaciones.Escalacion(rombo2,2,2);
        rombo2 = rombo2;
        double[][] m= rombo.MatrizH();
        TrHomogeneas temp = new TrHomogeneas();
        m=temp.multMat(temp.RefleLineaMX(),m);
        rombo.regresaPuntos(m);
         convertirACartesiano(rombo);
        convertirACartesiano(rombo2);
        anadeFigura(rombo);
        // anadeFigura(rombo2);
        
        //rombo = Transformaciones.rotacionPunto(rombo,300,100,180);
       
        
     
      // anadeFigura(rombo2);
       
         
        dibujaPoligono(g);
        System.out.println(Figuras.size());
        super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
            
}
