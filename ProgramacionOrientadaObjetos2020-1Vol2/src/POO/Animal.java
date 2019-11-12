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
public class Animal 
{
    public String familia;
    public String especie;
    public double peso ;
    
    public Animal()
    {
        familia = "";
        especie = "";
        peso = 0.0;
    }
    public Animal(String familia,String especie,double peso)
    {
        this.familia = familia; 
        this.especie = especie;
        this.peso = peso;
    }

    public String getFamilia()
    {
        return this.familia;
    }
    public void setFamilia(String familia)
    {
        this.familia = familia;
    }
    
    public String getEspecie()
    {
        return this.especie;
    }
    public void setEspecie(String especie)
    {
        this.especie = especie;
    }
    
    public double getPeso()
    {
        return this.peso;
    }
    public void setPeso(double peso)
    {
        this.peso = peso;
    }
}