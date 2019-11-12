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
public class Ropa 
{
    public String tipo;
    public double talla;
    public String color;
    
    public Ropa()
    {
        tipo = "";
        talla = 0.0;
        color = "";
    }
    public Ropa(String tipo,double talla,String color)
    {
        this.tipo = tipo; 
        this.talla = talla;
        this.color = color;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public double getTalla()
    {
        return this.talla;
    }
    public void setTalla(double talla)
    {
        this.talla = talla;
    }
    
    public String getColor()
    {
        return this.color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
}
