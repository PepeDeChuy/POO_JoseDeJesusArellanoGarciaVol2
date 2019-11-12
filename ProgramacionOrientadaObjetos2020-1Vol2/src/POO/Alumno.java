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
public class Alumno 
{
    private String nombre;
    private double creditos;
    private double promedio;

    public Alumno() {
        this.nombre = "";
        this.creditos = 0.0;
        this.promedio = 0.0;
    }

    public Alumno(String nombre, double creditos, double promedio) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.promedio = promedio;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the creditos
     */
    public double getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    /*
    @Override
    public String toString() 
    {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    */
}
