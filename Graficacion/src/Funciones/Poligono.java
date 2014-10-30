/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;


/**
 *Clase que podra guardar los puntos de un poligono y dibujarlos
 *@author antoniocg
 */
public class Poligono {
    public ArrayList<Point> Puntos = new ArrayList();
    
    /**
     * MEtodo que regresa una matriz de double con los puntos en formato normalizado
     * 
     * @return Matriz de 3xNPuntos 
     */
    public double[][] MatrizH()
    {
        double[][] m = new double[3][Puntos.size()];
        
            for(int j=0;j<m[0].length;j++)
            {
                m[0][j]=Puntos.get(j).getX();
                m[1][j]=Puntos.get(j).getY();
                m[2][j]=1.0;
            }
        
        return m;
    }
    /**
     * Metodo que a partir de una matriz de Doubles lo convierte en un arrayList de numeros, y los pone en la variable de Puntos del poligono
     * 
     * @param m Matriz de puntos
     */
    public void regresaPuntos(double[][] m)
    {
        ArrayList<Point> temp = new ArrayList();
        for(int i=0;i<m[0].length;i++)
        {
            temp.add(new Point((int)m[0][i],(int)m[1][i]));
        }
        Puntos=temp;
    }
    
    
    /**
     * Metodo que agregara punto P(x,y)
     * @param x Punto en coordenadas x
     * @param y punto en coordenadas y 
     */
    public void AgregaPunto(int x,int y)
    {
        Puntos.add(new Point(x,y));
    }
    
     

    //Clase que dibuja un poligono
    public void DibujaPolilinea(Graphics g)
    {
            System.out.println(Puntos.size());

            if(Puntos.size()<2)
            {
                    System.out.println("tiene que haber mas de dos lineas");
            }
            else
            {
                    int i=1;
                    do
                    {
                            /* SOlo para control
                            System.out.println(i);
                            System.out.println("x0:"+xPoint.get(i-1)+"y0:"+yPoint.get(i-1));
                            System.out.println("x1:"+xPoint.get(i)+"y1:"+yPoint.get(i));
                            */
                           Recta.dibujaRecta((int)Puntos.get(i-1).getX(),(int) Puntos.get(i-1).getY(), (int)Puntos.get(i).getX(), (int)Puntos.get(i).getY(),g);
                            i++;

                    }while(i!=Puntos.size());

            }
    }


    public void DibujaPoligono(Graphics g)
    {
            if(Puntos.size()<3)
            {
                    System.out.println("tiene que haber mas de tres lineas");
            }
            else
            {
                    for(int i=0;i<Puntos.size();i++)
                    {
                            if(Puntos.size()==(i+1))
                            {
                                    
                                    Recta.dibujaRecta((int)Puntos.get(i).getX(),(int)Puntos.get(i).getY(),(int) Puntos.get(0).getX(), (int)Puntos.get(0).getY(),g);
                            }
                            else
                            {
                                  Recta.dibujaRecta((int)Puntos.get(i).getX(),(int)Puntos.get(i).getY(),(int) Puntos.get(i+1).getX(), (int)Puntos.get(i+1).getY(),g);
                           
                            }
                     }
            }
    
    }
}