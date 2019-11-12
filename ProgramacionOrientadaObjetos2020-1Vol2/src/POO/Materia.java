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
public class Materia 
{
    public String nombre;
    public double creditos;
    public String salon;
    
    public Materia()
    {
        nombre = "";
        creditos = 0.0;
        salon = "";
    }
    public Materia(String nombre,double creditos,String salon)
    {
        this.nombre = nombre; 
        this.creditos = creditos;
        this.salon = salon;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public double getCreditos()
    {
        return this.creditos;
    }
    public void setCreditos(double creditos)
    {
        this.creditos = creditos;
    }
    
    public String getSalon()
    {
        return this.salon;
    }
    public void setSalon(String salon)
    {
        this.salon = salon;
    }
}
