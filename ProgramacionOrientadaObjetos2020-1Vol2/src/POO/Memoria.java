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
public class Memoria 
{
    public String tipo;
    public double precio;
    public double capasidad;
    
    public Memoria()
    {
        tipo = "";
        precio = 0.0;
        capasidad = 0;
    }
    public Memoria(String tipo,double precio,double capasidad)
    {
        this.tipo = tipo; 
        this.precio = precio;
        this.capasidad = capasidad;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public double getPrecio()
    {
        return this.precio;
    }
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public double getCapasidad()
    {
        return this.capasidad;
    }
    public void setCapasidad(double capasidad)
    {
        this.capasidad = capasidad;
    }
}
