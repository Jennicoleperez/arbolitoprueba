/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolitodeprueba;

/**
 *
 * @author Raydo
 */
public class Arbol {
    private Nodo raiz;
    
    public Nodo getRaiz() {
        
        return this.raiz;
        
    }

    public void setRaiz(Nodo raiz) {
        
        this.raiz = raiz;
        
    }
    
    public boolean estaVacio() {
        
        return this.raiz == null;
        
    }
    
    public void recorrerPreOrden(Nodo aux) {
        
        if(aux != null){
            
            aux.presentar();
            
            this.recorrerPreOrden(aux.getHijoIzquierdo());
            
            this.recorrerPreOrden(aux.getHijoDerecho()); 
            
        }
        
    }
    
    public void recorrerEnOrden(Nodo aux) {
        
        if(aux != null){
            
            this.recorrerEnOrden(aux.getHijoIzquierdo());
            
            aux.presentar();
            
            this.recorrerEnOrden(aux.getHijoDerecho()); 
            
        }
        
    }
    
    public void recorrerPostOrden(Nodo aux) {
        
        if(aux != null){
            
            this.recorrerPostOrden(aux.getHijoIzquierdo());
            
            this.recorrerPostOrden(aux.getHijoDerecho());
            
            aux.presentar();
            
        }
        
    }
    
//    public void insertarNodo(Nodo aux, Nodo nuevo) {
//        
//        if (estaVacio()) {
//            
//            this.raiz = nuevo;
//            
//        }else if (nuevo.getData() < aux.getData()) {
//            
//            if (aux.getHijoIzquierdo() == null) {
//                
//		aux.setHijoIzquierdo(nuevo);
//                
//            }else {
//                
//                this.insertarNodo(aux.getHijoIzquierdo(), nuevo);
//                
//            }
//            
//        }else if (nuevo.getData() > aux.getData()) {
//            
//            if (aux.getHijoDerecho() == null) {
//                
//		aux.setHijoDerecho(nuevo);
//                
//            }else {
//                
//		this.insertarNodo(aux.getHijoDerecho(), nuevo);
//                
//            }
//            
//        }else{
//            
//            System.out.println("Dicho nodo ya se encuentra dentro del árbol");
//            
//        }
//        
//    }
    
    public int contarNodos(Nodo aux) {
        
        if(aux == null) {
            
            return 0;
            
        }else {
            
            return 1 + this.contarNodos(aux.getHijoIzquierdo())+ this.contarNodos(aux.getHijoDerecho());
            
        }
        
    }
    
//    public Nodo buscarNodo(Nodo aux, int data) {
//        
//        if (aux != null) {
//            
//            if (data < aux.getData()) {
//
//                return this.buscarNodo(aux.getHijoIzquierdo(), data);
//
//            }else if (data > aux.getData()) {
//
//                return this.buscarNodo(aux.getHijoDerecho(), data);
//
//            }else {
//                
//                return aux;
//                
//            }
//            
//        }
//        
//        return null;
//        
//    }
}
