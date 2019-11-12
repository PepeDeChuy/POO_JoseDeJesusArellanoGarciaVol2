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
public class Cantante 
{
    public String nombre;
    public int edad;
    public String estilo;
    
    public Cantante()
    {
        nombre = "";
        estilo = "";
        edad = 0;
    }
    public Cantante(String nombre,int edad,String estilo)
    {
        this.nombre = nombre; 
        this.edad = edad;
        this.estilo = estilo;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getEstilo()
    {
        return this.estilo;
    }
    public void setEstio(String estilo)
    {
        this.estilo = estilo;
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
