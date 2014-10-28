/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.awt.Graphics;

/**
 *
 * @author antoniocg
 */
public class Recta {
    /**
     * Este método va Calcular la inclinacion de una recta
     * @param x0 Punto x inicial
     * @param x1 Punto x final
     * @param y0 punto y inicial
     * @param y1 punto y final
     * @return double con el resultado de la pentiende m, a partir de dos números
     */
     public static double CalculaM(double x0,double x1,double y0, double y1)
	{
		return (double)((y1-y0)/(x1-x0));
	}
     
     /**
     * Este metodo dibujara una recta usando los 8 casos que puede tener una pendiente
     * @param x0 Punto x inicial
     * @param x1 Punto x final
     * @param y0 punto y inicial
     * @param y1 punto y final
     * @param g el objeto graphics donde se dibujara la recta
     */
    public static void dibujaRecta(int x0,int y0,int x1,int y1,Graphics g)
    {
        //si los valores iniciales son mayores a los puntos finales los invertimos
       
        int y,x;
        int temp=0;
        if(x0>x1)
        {
           
             
            temp=x1;
            x1=x0;
            x0=temp;
           
            temp=y1;
         
            y1=y0;
            y0=temp;
            
        }
        
        
     

        //calculamos el valos de la pendiente
          double m=CalculaM(x0,x1,y0,y1);
          
          
          
        
       if(m==0)
          {
             y=y0;
                for(x=x0;x<=x1;x++){
                     Pixel.dibujaPixel(g,x, y ,1);
                }
           }
          

          
          else if((x1-x0)==0)
          {
             x=x0;
             
             for(y=y0;y<=y1;y++)
                 Pixel.dibujaPixel(g,x, y ,1);

          }
          
          
          
          else if(m==1)
          {
             y=y0;
             for(x=x0;x<=x1;x++)
             {
                  Pixel.dibujaPixel(g,x, y ,1);
                y=y+1;
             }
          }
         
          else if(m==-1)
          {
             y=y0;
             for(x=x0;x<=x1;x++)
             {
                 Pixel.dibujaPixel(g,x, y ,1);
                y=y-1;
             }

          }
         
          else if(m<1)
          {
              
             for(x=x0;x<=x1;x++)
             {
                y=(int)Math.round(y0+m*(x-x0));
                  Pixel.dibujaPixel(g,x, y ,1);
             }
          }
          
          else if(m>1)
          {
             for(y=y0;y<=y1;y++)
             {
                x=(int)Math.round(x0+(y-y0)/m);
                  Pixel.dibujaPixel(g,x, y ,1);
             }
          }
         
          else if(m>-1)
          {
             for(x=x0;x<=x1;x++)
             {
                y=(int)Math.round(y0+m*(x-x0));
                 Pixel.dibujaPixel(g,x, y ,1);
             }
          }
        
          else if(m<-1)
          {
             for(y=y0;y<=y1;y++)
             {
                x=(int)Math.round(x0+(y-y0)/m);
                Pixel.dibujaPixel(g,x, y ,1);
             }
          }
      
    }
}

