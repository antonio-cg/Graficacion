/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;

/**
 *
 * @author antonio Caro Guerrero
 */
public class Plano extends javax.swing.JPanel implements ComponentListener  {

    /**
     * Creates new form Plano
     */
   
    public ArrayList<Poligono> Figuras = new ArrayList();
    public int  _x=getBounds().width/2;
    public int  _y = getBounds().height/2;
    
    
    @Override
    public void paintComponent(Graphics g) {
        
        dibujaRecta(g);
        super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.
    }
    
     public Poligono convertirACartesiano(Poligono _fig)
    {
        Poligono fig = _fig;
       
        for (int i = 0; i < fig.Puntos.size(); i++) {
            fig.Puntos.set(i, convertirPunti(fig.Puntos.get(i)));
        }
     return fig;   
    }
     /**
      * Convierte puntos dados en formato plano cartesiano a formato plano de java
      * @param punto Punto al cual se transformara
      * @return punto modificado
      */
     public Point convertirPunti(Point punto)
     {
         Point Puntonuevo;
         double x=punto.getX();
         double y=punto.getY();
         
         if(x>=0 & y>=0)
         {
             x=_x+x;
             y=_y-y;
         }
         else if(x<=0 & y>=0)
         {
             x=_x+x;
             y=_y-y;
         }
         else if(x<=0 & y<=0)
         {
             x=_x+x;
             y=_y-y;
         }
         else if(x>=0 & y<=0) 
         {
             x=_x+x;
             y=_y-y;
         }
         
         
          
         
         
         Puntonuevo = new Point ((int)x,(int)y);
         return Puntonuevo;
     }
     
    public void dibujaRecta(Graphics g)
    {
      g.fillOval(_x-2,_y-2, 5, 5);
      Recta.dibujaRecta(0,(int)getHeight()/2,getWidth(),(int)getHeight()/2,g);
      Recta.dibujaRecta((int)getWidth()/2,0, (int)getWidth()/2,getHeight(), g);
      
    }
    public Plano() {
        initComponents();
    }
    
    
    public void dibujaPoligono(Graphics g)
    {
        for(int i = 0;i<Figuras.size();i++)
        {
            Figuras.get(i).DibujaPoligono(g);
        }
    }
    
    public void dibujaPolinea(Graphics g)
    {
        for(int i = 0;i<Figuras.size();i++)
        {
            Figuras.get(i).DibujaPolilinea(g);
        }
        
    }
    
    public void anadeFigura(Poligono fig)
    {
        Figuras.add(fig);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void componentResized(ComponentEvent e) {
        _x=getBounds().width/2;
        _y = getBounds().height/2;
        repaint();
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        
    }

    @Override
    public void componentShown(ComponentEvent e) {
          }

    @Override
    public void componentHidden(ComponentEvent e) {
         }
}
