/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.awt.Color;
import java.awt.Graphics;

/**
 *Clase para dibujar un pixel
 * @author Antonio Caro Guerrero
 */
public class Pixel {
    /**
     * metodo que dibuja un pixel en una posicion xy
     * @param g Objeto graphics en el cual se dibujara
     * @param x Coordenada en x
     * @param y Coordenada en y 
     */
     public static void dibujaPixel( int x, int y,Graphics g)
	{
            g.fillRect(x, y, 1, 1);
		
	}
	
	public static void dibujaPixel(Graphics g, int x, int y, Color c)
	{
		g.setColor(c);
		g.fillRect(x, y, 1, 1);
		
	}
	
	public static void dibujaPixel(Graphics g, int x, int y,int grosor)
	{
		
		g.fillRect(x,y,grosor,grosor);
	}
	
	public static void dibujaPixel(Graphics g, int x, int y, Color c,int grosor)
	{
		g.setColor(c);
		g.fillRect(x,y,grosor,grosor);
	}
    
}
