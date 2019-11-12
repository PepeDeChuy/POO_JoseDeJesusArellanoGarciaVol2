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
public class Planta 
{
    public String nombre;
    public double precio;
    public String familia;
    
    public Planta()
    {
        nombre = "";
        precio = 0.0;
        familia = "";
    }
    public Planta(String nombre,double precio,String familia)
    {
        this.nombre = nombre; 
        this.precio = precio;
        this.familia = familia;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    public void setClasificacion(String nombre)
    {
        this.nombre = nombre;
    }
    
    public double getPrecio()
    {
        return this.precio;
    }
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    
    public String getFamilia()
    {
        return this.familia;
    }
    public void setFamilia(String familia)
    {
        this.familia = familia;
    }
}
