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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        
        while(true) {
            
            System.out.println("Ingrese el numero correspondiente a la opcion que desea ejecutar:\n1 - Insertar Nodo\n2 - Recorrer en Pre-Orden\n3 - Recorrer en Orden\n4 - Recorrer en Post-Orden\n5 - Contar Nodos en el Arbol\n6 - Buscar Nodo");
        
            switch(sc.nextInt()) {

                case 1:
                    System.out.println("Ingrese la data del nodo a ingresar (numero entero):");
                    
                    arbol.insertarNodo(arbol.getRaiz(), new Nodo(sc.nextInt()));

                    break;

                case 2:
                    arbol.recorrerPreOrden(arbol.getRaiz());

                    break;

                case 3:
                    arbol.recorrerEnOrden(arbol.getRaiz());

                    break;

                case 4:
                    arbol.recorrerPostOrden(arbol.getRaiz());

                    break;

                case 5:
                    int cuenta = arbol.contarNodos(arbol.getRaiz());
                    
                    System.out.println("Hay " + cuenta + " nodos en el árbol");

                    break;
                
                case 6:
                    System.out.println("Ingrese la data del nodo a buscar (numero entero):");
                    
                    Nodo encontrado = arbol.buscarNodo(arbol.getRaiz(), sc.nextInt());
                    
                    if(encontrado != null) {
                        
                        System.out.println("Se encontro el nodo con el valor " + encontrado.getData());
                        
                    }else {
                        
                        System.out.println("No se encontro dicho nodo");
                        
                    }

                    break;

                default:

                    System.out.println("Opcion Invalida");

            }
            
        }
        
    }
    
}
