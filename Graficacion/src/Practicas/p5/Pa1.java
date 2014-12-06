
package Practicas.p5;

import Funciones.Plano;
import Funciones.Poligono;
import Funciones.Transformaciones;
import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author antonio Caro Guerrero
 * Hacer un applet que dibuje un rombo y realizar las siguientes transformacio_
 * nes de traslación:
 * a)dx = -100                         b)dx = 100
   dy = 150                              dy = -150
 */
public class Pa1 extends Plano{
    public Pa1() {
        
        
    }
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
       Transformaciones.Translacion(Rombo2,100,100);
        //convertirACartesiano(RomboM);
        convertirACartesiano(rombo);
        convertirACartesiano(Rombo2);
        //anadeFigura(RomboM);
        rombo.DibujaPoligono(g, Color.red);
        Rombo2.DibujaPoligono(g, Color.BLUE);
        super.paintComponents(g);
    }
}
