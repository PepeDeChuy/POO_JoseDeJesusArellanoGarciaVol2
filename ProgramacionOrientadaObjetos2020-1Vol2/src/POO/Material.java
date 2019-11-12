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
public class Material 
{
    public String textura;
    public double precio;
    public double existencia;
    
    public Material ()
    {
        textura = "";
        precio = 0.0;
        existencia = 0;
    }
    public Material (String textura,double precio,double existencia)
    {
        this.textura = textura; 
        this.precio = precio;
        this.existencia = existencia;
    }
    
        public String getTextura()
        {
            return this.textura;
        }
        public void setTextura(String textura)
        {
            this.textura = textura;
        }

        public double getPrecio()
        {
            return this.precio;
        }
        public void setPrecio(double precio)
        {
            this.precio = precio;
        }

        public double getExistencia()
        {
            return this.existencia;
        }
        public void setSalon(double existencia)
        {
            this.existencia = existencia;
    }
}
