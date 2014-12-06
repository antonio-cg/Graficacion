/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

/**
 *
 * @author antoniocg
 */
public class TrHomogeneas {
    /**
     * Nos regresara la matriz de traslacion homogenea
     * @param tx punto de traslacion en x
     * @param ty punto de traslacion en y 
     * @return 
     */
    public double[][] Traslacion(double tx, double ty)
    {
        return new double[][] {{1.0,0,tx},{0,1,tx},{0,0,1}};
    }
    /**
     * Regresa la matriz de traslacio inversa homogenea
     * @param tx
     * @param ty
     * @return 
     */
    public double[][] TraslacionI(int tx, int ty)
    {
        return new double[][] {{1.0,0,(double)tx*-1},{0,1.0,(double)ty*-1},{0,0,1.0}};
    }
    /**
     * Nos regresa la matriz de escalacion en el origen de las cordenadas
     * @param sx
     * @param sy
     * @return 
     */
    public double[][] Escalacion(int sx, int sy)
    {
        return new double[][] {{(double)sx,0,0},{0,(double)sy,0},{0,0,1}};
    }
    
    /**
     * Nos regresa la matriz de escalacion inversaen el origen de las cordenadas
     * @param sx
     * @param sy
     * @return 
     */
    public double[][] EscalacionI(int sx, int sy)
    {
        return new double[][] {{(double)sx/1,0,0},{0,(double)sy/1,0},{0,0,1}};
    }
    /**
     * Rotacion en el origen de las coordenadas
     * @param angle angulo dado en grados
     * @return 
     */
    public double[][] Rotacion(int angle)
    {
        double temp=Math.toRadians(angle);
        return new double[][] {{Math.cos(temp),-1*Math.sin(temp),0},{-1*Math.sin(temp),Math.cos(temp),0},{0,0,1}};
    }
    
     /**
     * Rotacion inversa en el origen de las coordenadas
     * @param angle angulo dado en grados
     * @return 
     */
    public double[][] RotacionI(int angle)
    {
        double temp=Math.toRadians(angle);
        return new double[][] {{Math.cos(temp),Math.sin(temp),0},{-1*Math.sin(temp),Math.cos(temp),0},{0,0,1}};
    }
    
    /**
     * Metodo que regresa una matriz para reflexion en x
     * @return 
     */
     public double[][] RefleX()
     {
         return new double[][] {{1,0,0},{0,-1,0},{1,0,0}};
     }
     
     /**
     * Metodo que regresa una matriz para reflexion en y
     * @return 
     */
     public double[][] RefleY()
     {
         return new double[][] {{-1,0,0},{0,1,0},{1,0,0}};
     }
     
      /**
     *Reflexión de un objeto con respecto de un eje perpendicular al plano xy y que pasa a través del origen de las coordenadas 
     * @return 
     */
     public double[][] ReflePerOrigen()
     {
         return new double[][] {{-1,0,0},{0,-1,0},{1,0,0}};
     }
     
      /**
     *Reflexión de un objeto con respecto de la línea y = x
     * @return 
     */
     public double[][] RefleLineaX()
     {
         return new double[][] {{0,1,0},{1,0,0},{1,0,0}};
     }
     
      /**
     *Reflexión de un objeto con respecto de la línea y = -x
     * @return 
     */
     public double[][] RefleLineaMX()
     {
         return new double[][] {{0,-1,0},{-1,0,0},{1,0,0}};
     }
     
     /**
     *Un recorte de la dirección de x en relación con el eje de x 
     * @param shx valor de inclinacion
     * @return 
     */
     public double[][] RecorteX(double shx)
     {
         return new double[][] {{1,shx,0},{0,1,0},{0,0,1}};
     }
     
     /**
     *Un recorte de la dirección de x en relación con el eje de x 
     * @param shy valor de inclinacion
     * @return 
     */
     public double[][] RecorteY(double shy)
     {
         return new double[][] {{1,0,0},{shy,1,0},{0,0,1}};
     }
     
     /**
     *Método que regresa la matriz de recorte (o inclinación) de la dirección de x en relación con otras líneas de referencia
     * @param shx
     * @param yref
     * @return 
     */
     public double[][] Recortexy(double shx,double yref)
     {
         return new double[][] {{1,shx,shx*yref},{0,1,0},{0,0,1}};
     }
     
     
     /**
     *Método que regresa la matriz de recorte (o inclinación) de la dirección de x en relación con otras líneas de referencia
     * @param shy
     * @param xref
     * @return 
     */
     public double[][] Recorteyx(double shy,double xref)
     {
         return new double[][] {{1,0,0},{shy,1,-shy*xref},{0,0,1}};
     }
     
     
     /**
      * Metodo para multiplicar dos matrices
      * @param a contiene la matriz a
      * @param b contirne la matriz b 
      * @return la multiplicacion de la matriz a y b.
      */
  public  double[][] multMat(double[][] a,double[][] b){
      
      double[][] c=new double[a.length][b[0].length];
      for(int i=0;i<c.length;i++)
         for(int j=0;j<c[0].length;j++)
            for(int k=0;k<a[0].length;k++)
               c[i][j]+=a[i][k]*b[k][j];
      return c;       
   }
}
