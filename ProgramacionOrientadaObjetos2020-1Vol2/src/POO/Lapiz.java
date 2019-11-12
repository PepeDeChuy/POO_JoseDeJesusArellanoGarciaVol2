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
public class Lapiz 
{
   public int numero;
    public String marca;
    public double precio;
    
    public Lapiz()
    {
        marca = "";
        precio = 0.0;
        numero = 0;
    }
    public Lapiz(int numero,String marca,double precio)
    {
        this.numero = numero; 
        this.marca = marca;
        this.precio = precio;
    } 
    
    public String getMarca()
    {
        return this.marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
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
