/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author peper
 */
public class Tienda 
{
    public String tipo;
    public int numusuarios;
    public double calificacion;
    
    public Tienda()
    {
        tipo = "";
        numusuarios = 0;
        calificacion = 0.0;
    }
    public Tienda(String tipo,double calificacion,int numusuarios)
    {
        this.tipo = tipo; 
        this.numusuarios = numusuarios;
        this.calificacion = calificacion;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public double getCalificacion()
    {
        return this.calificacion;
    }
    public void setCalificacion(double calificacion)
    {
        this.calificacion = calificacion;
    }
    
    public int getColor()
    {
        return this.numusuarios;
    }
    public void setColor(int numusuarios)
    {
        this.numusuarios = numusuarios;
    }
}