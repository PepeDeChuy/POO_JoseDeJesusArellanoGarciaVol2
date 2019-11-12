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
public class Aplicacion 
{
    private String tipo;
    private double memoriarequerida;
    private String lenguajepreogramado;
    
    public Aplicacion()
    {
        tipo = "";
        lenguajepreogramado = "";
        memoriarequerida = 0.0;
    }
    public Aplicacion(String tipo,double memoriarequerida,String lenguajepreogramado)
    {
        this.tipo = tipo; 
        this.lenguajepreogramado = lenguajepreogramado;
        this.memoriarequerida = memoriarequerida;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getLenguajepreogramado()
    {
        return this.lenguajepreogramado;
    }
    public void setLenguajepreogramado(String lenguajepreogramado)
    {
        this.lenguajepreogramado = lenguajepreogramado;
    }
    
    public double getMemoriarequerida()
    {
        return this.memoriarequerida;
    }
    public void setMemoriarequerida(double memoriarequerida)
    {
        this.memoriarequerida = memoriarequerida;
    }
}
