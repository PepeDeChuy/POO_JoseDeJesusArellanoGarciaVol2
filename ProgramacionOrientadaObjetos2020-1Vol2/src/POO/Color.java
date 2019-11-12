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
public class Color 
{
    public String tonalidad;
    public int luminosidad;
    public int saturacion;
    
    public Color()
    {
        tonalidad = "";
        luminosidad = 0;
        saturacion = 0;
    }
    public Color(String tonalidad,int luminosidad,int saturacion)
    {
        this.tonalidad = tonalidad; 
        this.luminosidad = luminosidad;
        this.saturacion = saturacion;
    }
    
    public String getTonalidad()
    {
        return this.tonalidad;
    }
    public void setTonalidad(String tonalidad)
    {
        this.tonalidad = tonalidad;
    }
    
    public int getLuminosidad()
    {
        return this.luminosidad;
    }
    public void setLuminosidad(int luminosidad)
    {
        this.luminosidad = luminosidad;
    }
    
    public int getSaturacion()
    {
        return this.luminosidad;
    }
    public void setSaturacion(int saturacion)
    {
        this.saturacion = saturacion;
    }
}
