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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolCadenas arbolCadenas = new ArbolCadenas();
        Funciones f = new Funciones();
        HashTable hojas = new HashTable(10111);
        String[] nodos; 
        
        f.leer(arbolCadenas, hojas, nodos);

    
    }
}
