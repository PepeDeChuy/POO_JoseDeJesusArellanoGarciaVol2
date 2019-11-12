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
public class PC 
{
    public String marca;
    public double precio;
    public int memoria;
    
    public PC()
    {
        marca = "";
        precio = 0.0;
        memoria = 0;
    }
    public PC(String marca,double precio,int memoria)
    {
        this.marca = marca; 
        this.precio = precio;
        this.memoria = memoria;
    }
    
    public String getMarca()
    {
        return this.marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public double getCompaia()
    {
        return this.precio;
    }
    public void setCompaia(double precio)
    {
        this.precio = precio;
    }
    
    public int getMemoria()
    {
        return this.memoria;
    }
    public void setNumusuarios(int memoria)
    {
        this.memoria = memoria;
    }
}
