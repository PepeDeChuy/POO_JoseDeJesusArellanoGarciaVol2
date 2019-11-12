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
public class Pelicula 
{
    public String clasificacion;
    public double precio;
    public double duracion;
    
    public Pelicula()
    {
        clasificacion = "";
        precio = 0.0;
        duracion = 0;
    }
    public Pelicula(String clasificacion,double precio,double duracion)
    {
        this.clasificacion = clasificacion; 
        this.precio = precio;
        this.duracion = duracion;
    }
    
    public String getClasificacion()
    {
        return this.clasificacion;
    }
    public void setClasificacion(String clasificacion)
    {
        this.clasificacion = clasificacion;
    }
    
    public double getPrecio()
    {
        return this.precio;
    }
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    
    public double getDuracion()
    {
        return this.duracion;
    }
    public void setDuracion(double duracion)
    {
        this.duracion = duracion;
    }
}
