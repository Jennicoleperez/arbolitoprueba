/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolitodeprueba;

import javax.swing.JOptionPane;

/**
 *
 * @author Raydo
 */
public class ListadelCsv {
    private NodoLista primero;
    private NodoLista ultimo;
    private int tamano;

    public ListadelCsv(NodoLista primero, NodoLista ultimo, int tamano) {
        this.primero = primero;
        this.ultimo = ultimo;
        this.tamano = tamano;
    }
    public ListadelCsv() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }
     
    public boolean esVacio(){
        return primero == null;
    }
    
    public void insertarFinal(String pregunta, String no, String si){
        NodoLista nuevoNodo = new NodoLista(pregunta, no, si);
        
        if (esVacio()){
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else{
            NodoLista aux = ultimo;
            aux.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }
        
        tamano += 1;
    }
    
    
//    public void Iiprimir(){
//        
//        if (!esVacio()){
//            NodoLista aux = primero;
//            for (int i = 0; i < tamano; i++) {
//                JOptionPane.showMessageDialog(null,aux.getPregunta() + " ");
//                JOptionPane.showMessageDialog(null,aux.getNo() + " ");
//                JOptionPane.showMessageDialog(null,aux.getSi() + " ");
//                aux = aux.getSiguiente();
//                
//            }
//        }else{
//            JOptionPane.showMessageDialog(null,"La lista esta vacia");
//        }
//    }
    public String getInformacion() {
        String info = "Pregunta; No; Si\n";
        if (!esVacio()) {

            NodoLista aux = getPrimero();

            for (int i = 0; i < getTamano(); i++) {
                info += aux.getPregunta() + "," + aux.getNo()+"," + aux.getSi() + "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, info);
        }
        return info;
    }
    

    /**
     * @return the primero
     */
    public NodoLista getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoLista primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public NodoLista getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoLista ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
}
