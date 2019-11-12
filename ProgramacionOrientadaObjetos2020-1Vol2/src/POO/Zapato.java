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
public class Zapato 
{
    public String tipo;
    public int numero;
    public double precio;
    
    public Zapato()
    {
        tipo = "";
        numero = 0;
        precio = 0.0;
    }
    public Zapato(String tipo,double precio,int numero)
    {
        this.tipo = tipo; 
        this.numero = numero;
        this.precio = precio;
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
    
    public int getNumero()
    {
        return this.numero;
    }
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
}