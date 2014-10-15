/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacion;

import java.awt.Point;
import java.util.ArrayList;


/**
 *Clase que podra guardar los puntos de un poligono y dibujarlos
 *@author antoniocg
 */
public class Poligono {
    public ArrayList<Point> Puntos = new ArrayList();
    
    /**
     * Metodo que agregara punto P(x,y)
     * @param x Punto en coordenadas x
     * @param y punto en coordenadas y 
     */
    public void AgregaPunto(int x,int y)
    {
        Puntos.add(new Point(x,y));
    }
}
