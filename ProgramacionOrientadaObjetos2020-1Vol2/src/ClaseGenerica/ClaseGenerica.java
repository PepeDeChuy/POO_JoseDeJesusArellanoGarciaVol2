/*
En Java, cuando definimos una nueva clase, debemos conocer el tipo de dato con 
el que trabajaremos. Si queremos realizar una operación específica dentro de 
esta nueva clase, sea cual sea el tipo de datos que va a recibir, 
podemos hacer uso de los tipos genéricos. Este tipo genérico asumirá el tipo de 
dato que realmente le pasaremos a la clase.
 */
package ClaseGenerica;

/**
 *
 * @author peper
 */
class ClaseGenerica<T> {
  T obj;
 
  public ClaseGenerica(T o) {
    obj = o;
  }
 
  public void classType() {
    System.out.println("El tipo de T es " + obj.getClass().getName());
  }
}