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
public class Continente 
{
    public String nombre;
    public double tamaño;
    public int numerodepaises;
    
    public Continente()
    {
        nombre = "";
        tamaño = 0.0;
        numerodepaises = 0;
    }
    public Continente(String nombre,double tamaño,int numerodepaises)
    {
        this.nombre = nombre; 
        this.tamaño = tamaño;
        this.numerodepaises = numerodepaises;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public double getTamaño()
    {
        return this.tamaño;
    }
    public void setTamaño(double tamaño)
    {
        this.tamaño = tamaño;
    }
    
    public int getNumerodepaises()
    {
        return this.numerodepaises;
    }
    public void setSaturacion(int numerodepaises)
    {
        this.numerodepaises = numerodepaises;
    }
}
