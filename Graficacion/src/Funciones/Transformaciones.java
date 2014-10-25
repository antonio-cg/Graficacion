/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.awt.Point;

/**
 *
 * @author antoniocg
 */
public class Transformaciones {
    /**
      * Método que implementa la Translación de un poligono 
      * @param poli Poligono al que se le aplicacara la escalacion
      * @param dx Constante de translación de x
      * @param dy Constante de translación de y
      * @return Un objeto de tipo poligono con las cordenadas modificadas. 
      */
    public static Poligono Translacion(Poligono _poli,int dx, int dy)
    {
       Poligono poli=_poli;
        for(int i = 0;i<poli.Puntos.size();i++)
        {
            poli.Puntos.set(i, new Point((int)poli.Puntos.get(i).getX()+dx,(int)poli.Puntos.get(i).getY()+dy));
        }
        return poli;
    }
    /**
      * Método que implementa la escalacion Basado en el origen 
      * @param poli Poligono al que se le aplicacara la escalacion
      * @param Sx Constante de escalacion de x
      * @param Sy Constante de escalacion de y
      * @return Un objeto de tipo poligono con las cordenadas modificadas. 
      */
     public static Poligono Escalacion(Poligono _poli,int Sx, int Sy)
    {
       Poligono poli=_poli;
        for(int i = 0;i<poli.Puntos.size();i++)
        {
            poli.Puntos.set(i, new Point((int)poli.Puntos.get(i).getX()*Sx,(int)poli.Puntos.get(i).getY()*Sy));
        }
        return poli;
    }
     /**
      * Método que implementa la escalacion por punto fijo
      * @param poli Poligono al que se le aplicacara la escalacion
      * @param Sx Constante de escalacion de x
      * @param Sy Constante de escalacion de y
      * @param Xf Punto fijo en x, en el cual se aplicará la escalación
      * @param Yf Punto fijo en y, en el cual se aplicará la escalación
      * @return Un objeto de tipo poligono con las cordenadas modificadas. 
      */
   public static Poligono EscalacionPf(Poligono _poli,int Sx, int Sy,int Xf,int Yf)
    {
        Poligono poli=_poli;
       int tempx = Xf*(1-Sx);
       int tempy = Yf*(1-Sy);
        for(int i = 0;i<poli.Puntos.size();i++)
        {
            poli.Puntos.set(i, new Point((int)poli.Puntos.get(i).getX()*Sx+tempx,(int)poli.Puntos.get(i).getY()*Sy+tempy));
        }
        return poli;
    }
   
   public static Poligono rotacionOrigen(Poligono _poli,int angulo)
   {
       Poligono poli = _poli;
       double angle = ((angulo*Math.PI)/180);
       
       for(int i = 0;i<poli.Puntos.size();i++)
        {
            poli.Puntos.set(i, new Point((int)(poli.Puntos.get(i).getX()*Math.cos(angle)-poli.Puntos.get(i).getY()*Math.sin(angle)),(int)(poli.Puntos.get(i).getX()*Math.sin(angle)+poli.Puntos.get(i).getY()*Math.cos(angle))));
        }
       
       return poli;
   } 
   
   public static Poligono rotacionPunto(Poligono _poli,int angulo,int yr, int xr)
   {
       Poligono poli = _poli;
       double angle = ((angulo*Math.PI)/180);
       double xp,yp;
       for(int i = 0;i<poli.Puntos.size();i++)
        {
            xp=xr+(poli.Puntos.get(i).getX()-xr)*Math.cos(angle)-(poli.Puntos.get(i).getY()-yr)*Math.sin(angle);
            yp=yr+(poli.Puntos.get(i).getX()-xr)*Math.sin(angle)+(poli.Puntos.get(i).getY()-yr)*Math.cos(angle);
            
            poli.Puntos.set(i,new Point((int)xp,(int)yp));
        }
       return poli;
   } 
   
}
