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
public class Celular 
{
    public String nombre;
    public double androidvercion;
    public boolean pantalla;
    
    public Celular()
    {
        nombre = "";
        androidvercion = 0;
        pantalla = false;
    }
    public Celular(String nombre,double androidvercion,boolean pantalla)
    {
        this.nombre = nombre; 
        this.androidvercion = androidvercion;
        this.pantalla = pantalla;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public boolean getPantalla()
    {
        return this.pantalla;
    }
    public void setPantalla(boolean pantalla)
    {
        this.pantalla = pantalla;
    }
    
    public double getAndroidvercion()
    {
        return this.androidvercion;
    }
    public void setAndroidvercion(double androidvercion)
    {
        this.androidvercion = androidvercion;
    }
}
