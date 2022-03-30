/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolitodeprueba;

/**
 *
 * Clase para el NodoHashTable utilizado para el
 * HashTable y la lista
 */
public class NodoHashTable {
    
    //Campos de la clase
    private NodoHashTable siguiente; //apuntador a siguiente en la hash table, en caso de haber colisiones
    private String palabra;


    //Constructor de la clase
    public NodoHashTable(String palabra) {
        this.siguiente = null;
        this.palabra = palabra;
       
    }
    
    public NodoHashTable getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoHashTable siguiente) {
        this.siguiente = siguiente;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String nombre) {
        this.palabra = nombre;
    }

}
