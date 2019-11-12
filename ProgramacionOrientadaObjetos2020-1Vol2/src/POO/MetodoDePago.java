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
public class MetodoDePago 
{
    public String nombre;
    public String compaia;
    public int numusuarios;
    
    public MetodoDePago()
    {
        nombre = "";
        compaia = "";
        numusuarios = 0;
    }
    public MetodoDePago(String nombre,String compaia,int numusuarios)
    {
        this.nombre = nombre; 
        this.compaia = compaia;
        this.numusuarios = numusuarios;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getCompaia()
    {
        return this.compaia;
    }
    public void setCompaia(String compaia)
    {
        this.compaia = compaia;
    }
    
    public int getNumusuarios()
    {
        return this.numusuarios;
    }
    public void setNumusuarios(int numusuarios)
    {
        this.numusuarios = numusuarios;
    }
}
