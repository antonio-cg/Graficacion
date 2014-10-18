
package Practicas.p5;

import Funciones.Poligono;
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
        rombo.AgregaPunto(100,20);
        rombo.AgregaPunto(140,80);
        rombo.AgregaPunto(100,140);
        rombo.AgregaPunto(60, 80);

        rombo = convertirACartesiano(rombo);
        System.out.println(rombo.Puntos.get(0).getX());
      
        anadeFigura(rombo);
        
        dibujaPoligono(g);
        super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
            
}
