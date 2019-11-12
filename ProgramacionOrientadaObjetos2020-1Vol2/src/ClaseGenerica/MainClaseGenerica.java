/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseGenerica;
/**
 *
 * @author peper
 */
public class MainClaseGenerica{
  public static void main(String args[]) {
    // Creamos una instancia de ClaseGenerica para Integer.
    ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(88);
    intObj.classType();
 
    // Creamos una instancia de ClaseGenerica para String.
    ClaseGenerica<String> strObj = new ClaseGenerica<String>("Test");
    strObj.classType();
 
  }
}

