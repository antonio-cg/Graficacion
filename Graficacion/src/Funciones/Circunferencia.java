/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.awt.Graphics;

/**
 *
 * @author Antonio Caro Guerrero
 */
public class Circunferencia {
 
	public static void circuloGeneral(int xc, int yc, int r, Graphics g)
	{
		int x=0;
		double y1 = 0, y2 = 0;
		for(x=xc-r; x<=xc+r;x+=2)
		{
			y1 = yc + Math.sqrt(Math.pow(r,2)-Math.pow(x-xc, 2));
			y1 = yc - Math.sqrt(Math.pow(r,2)-Math.pow(x-xc, 2));
			Pixel.dibujaPixel(x,(int)Math.round(y1),g);
			Pixel.dibujaPixel(x,(int)Math.round(y2),g);
		}
	}
	public static void circuloIncremental(int xc, int yc, int r, Graphics g)
	{
		int tx=0, ty=0;
		double dt, cc, ss, x, y ,aux;
		dt= (double) 1/r;
		cc=Math.cos(dt);
		ss=Math.sin(dt);
		x=0;
		y=r;
		while(y>=Math.abs(x))
		{
			tx=(int)Math.round(x);
			ty=(int)Math.round(y);
			Pixel.dibujaPixel(xc+tx, yc+ty, g);
			Pixel.dibujaPixel(xc-tx, yc+ty, g);
			Pixel.dibujaPixel(xc+tx, yc-ty,g);
			Pixel.dibujaPixel(xc-tx, yc-ty,g);
			Pixel.dibujaPixel(xc+ty, yc+tx,g);
			Pixel.dibujaPixel(xc+ty, yc-tx,g);
			Pixel.dibujaPixel(xc-ty, yc+tx,g);
			Pixel.dibujaPixel(xc-ty, yc-tx,g);
			aux=x;
			x=x*cc-y*ss;
			y=y*cc+aux*ss;

		}

	}
	public static void circuloBresenham(int xc, int yc, int r, Graphics g)
	{
		int p, x, y;
		x=0;
		y=r;
		p=3-2*r;
		while(x<=y)
		{
			Pixel.dibujaPixel(xc+x, yc+y, g);
			Pixel.dibujaPixel(xc-x, yc+y, g);
			Pixel.dibujaPixel(xc+x, yc-y, g);
			Pixel.dibujaPixel(xc-x, yc-y, g);
			Pixel.dibujaPixel(xc+y, yc+x, g);
			Pixel.dibujaPixel(xc+y, yc-x, g);
			Pixel.dibujaPixel(xc-y, yc+x, g);
			Pixel.dibujaPixel(xc-y, yc-x, g);
			if (p<0)
			{	
				p=p+4*x+6;
			}
			else
			{
				p=p+4*(x-y)+10;
				y=y-1;
			}
			x=x+1;

		}

	}
}
