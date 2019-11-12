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
public class Pais 
{
    public String nombre;
    public double territorio;
    public int numhabitantes;
    
    public Pais()
    {
        nombre = "";
        territorio = 0.0;
        numhabitantes = 0;
    }
    public Pais(String nombre,double territorio,int numhabitantes)
    {
        this.nombre = nombre; 
        this.territorio = territorio;
        this.numhabitantes = numhabitantes;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public double getTerritorio()
    {
        return this.territorio;
    }
    public void setTerritorio(double territorio)
    {
        this.territorio = territorio;
    }
    
    public int getNumhabitantes()
    {
        return this.numhabitantes;
    }
    public void setNumhabitantes(int numhabitantes)
    {
        this.numhabitantes = numhabitantes;
    }
}
