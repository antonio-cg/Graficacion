/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas.Circunferencia;

import Funciones.Circunferencia;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author antoniocg
 */
public class Pruebas extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawOval(300, 300, 20, 20);
        g.setColor(Color.red);
        Circunferencia.circuloGeneral(100, 100, 30, g);
        g.setColor(Color.blue);
        Circunferencia.circuloBresenham(200, 200, 30, g);
        g.setColor(Color.YELLOW);
        Circunferencia.circuloIncremental(50, 50, 20, g);
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    }
    
}
