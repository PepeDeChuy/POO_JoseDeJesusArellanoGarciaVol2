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
public class Planeta 
{
    public String nombre;
    public double diametro;
    public boolean vida;
    
    public Planeta()
    {
        nombre = "";
        diametro = 0.0;
        vida = false;
    }
    public Planeta(String nombre,double diametro,boolean vida)
    {
        this.nombre = nombre; 
        this.diametro = diametro;
        this.vida = vida;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    public void setClasificacion(String nombre)
    {
        this.nombre = nombre;
    }
    
    public double getDiametro()
    {
        return this.diametro;
    }
    public void setDiametro(double diametro)
    {
        this.diametro = diametro;
    }
    
    public boolean getVida()
    {
        return this.vida;
    }
    public void setEdad(boolean vida)
    {
        this.vida = vida;
    }
}