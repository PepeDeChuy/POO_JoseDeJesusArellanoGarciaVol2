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
public class Persona 
{
    public String nombre;
    public int edad;
    public double estatura;
    
    public Persona()
    {
        nombre = "";
        edad = 0;
        estatura = 0.0; 
    }
     public Persona(String nombre,int edad, double estatura)
     {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura; 
    }
     
    public String getNombre()
    {
        return this.nombre;
    }
    public void setClasificacion(String nombre)
    {
        this.nombre = nombre;
    }
    
    public double getEstatura()
    {
        return this.estatura;
    }
    public void setEstatura(double estatura)
    {
        this.estatura = estatura;
    }
    
    public int getEdad()
    {
        return this.edad;
    }
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
}
