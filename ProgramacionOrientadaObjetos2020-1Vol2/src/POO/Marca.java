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
public class Marca 
{
    private String Nombre;
    private double valor;
    private int numPersonal;

    public Marca() {
        this.Nombre = "";
        this.valor = 0.0;
        this.numPersonal = 0;
    }

    public Marca(String Nombre, double valor, int numPersonal) {
        this.Nombre = Nombre;
        this.valor = valor;
        this.numPersonal = numPersonal;
    }
    
     /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the numPersonal
     */
    public int getNumPersonal() {
        return numPersonal;
    }

    /**
     * @param numPersonal the numPersonal to set
     */
    public void setNumPersonal(int numPersonal) {
        this.numPersonal = numPersonal;
    }
}
