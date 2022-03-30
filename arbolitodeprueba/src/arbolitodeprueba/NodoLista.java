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
public class NodoLista {
    private String pregunta;
    private String no;
    private String si;
    private NodoLista siguiente;

    public NodoLista(String pregunta, String no, String si) {
        this.pregunta = pregunta;
        this.si = si;
        this.no = no;
        this.siguiente = null;
    }

    public NodoLista(String pregunta, String no, String si, NodoLista siguiente) {
        this.pregunta = pregunta;
        this.no = no;
        this.si = si;
        this.siguiente = siguiente;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getSi() {
        return si;
    }

    public void setSi(String si) {
        this.si = si;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
    
    public NodoLista getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(NodoLista siguiente){
        this.siguiente = siguiente;
    }   
}
