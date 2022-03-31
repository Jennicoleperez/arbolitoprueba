/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolitodeprueba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Raydo
 */
public class Sesion {
    private ArbolCadenas arbol = new ArbolCadenas();
    private HashTable[] tabla;
    private String[] nodosString;
    private NodoCadena[] nodos;    

    public Sesion() {
        this.tabla = null;
        this.nodosString = null;
        this.nodo = null;
    }

    
    public void adivinarAnimal(){
        System.out.println("");
    }
    
    public void agregarAnimal(){
        System.out.println("");
    }

    public void verificarExistencia(){
        System.out.println("");

    }
    
    public void inicializar(){
        System.out.println("");
    }
    
    
    public String leer(){
        String linea;
        String datos_csv = "";
        String path = "test\\conocimientos.csv";
        File file = new File(path);        
                                            
        try{
            if(!file.exists()){
                file.createNewFile();
            }else{
                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);   
                    
                    while ((linea = br.readLine()) != null ){
                        if (!linea.isEmpty()){
                            datos_csv += linea + "\n";                      
                        }
                    }
                        if (!"".equals(datos_csv)&& !datos_csv.isEmpty()){
                        String[] datos_split = datos_csv.split("\n"); 
                        
                        int i = 0;                        
                        
                        if("Pregunta; No; Si".equals(datos_split[i])) {
                            String nodo = "";
                            i++;
                            while (i < datos_split.length) {
                                String[] preguntas_split = datos_split[i].split("; ");
                                
                                var nodoPrincipal;
                                for(int k = 0; k < preguntas_split.length; k++ ){
                                    var id = this.nodosString.indexOf(preguntas_split[k]);
                                    var nodo;
                                    if(id != -1){
                                       nodo = new NodoCadena(preguntas_split[k]);
                                       this.nodosString.push(preguntas_split[k]);
                                       this.nodos.push(nodo);                                       
                                    }else{
                                       nodo = nodos[id];
                                    }
                                    
                                    if (k==0){
                                       nodoPrincipal = nodo;
                                       if (i==1){
                                          this.arbol.setRaiz(nodo);
                                       }
                                    }
                                    
                                    if (k==1){
                                       nodoPrincipal.setIzquierda(nodo);
                                    }
                                    
                                    if (k==2){
                                       nodoPrincipal.setDerecha(nodo);
                                    }
                                }
                                
                                arbol.inorden();
                            }
                        }
                                i++;
                    }
                    br.close();
                    JOptionPane.showMessageDialog(null, "Lectura exitosa.");

            }
        }catch (Exception err){
                    JOptionPane.showMessageDialog(null, "Error al leer los datos.");
        }
        return datos_csv ;                            
    }
    
        
    /**
     * leerCsvCargado()
     * Método lee el archivo cargado desde el computador 
     * Retorna una Lista de Nodos donde la informacion contenida en cada nodo
     * es la informacion por linea del csv
     */
    
    public String leerCsvCargado() {

        String line;
        String csvPorLinea = ""; 

        try {
            JFileChooser fileC = new JFileChooser();
            fileC.showOpenDialog(null);
            File file = fileC.getSelectedFile();
            if (!file.exists()) {
                file.createNewFile(); //si el archivo no existe, lo crea
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        csvPorLinea += line + "\n"; //cambie " " por "\n" para que leerCsv cargado y leer() retornen el mismo String
                    }

                }
                
                if (!"".equals(csvPorLinea)){
                    String[] csvListaporLinea = csvPorLinea.split("\n");
                    for (int i = 0; i < csvListaporLinea.length; i++) {
                        String[] csvListaInfoporLinea = csvListaporLinea[i].split("; ");
                        if (csvListaInfoporLinea[0].equalsIgnoreCase("pregunta")){
                            ;
                        }else{
                           
                        }
                          
                    }
                }
                
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa.");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer");
            System.out.println(e);
        }
        return csvPorLinea;
    }
    
    
    public void guardarConocimientos(){
        System.out.println("");
    }

    /**
     * @return the arbol
     */
    public ArbolCadenas getArbol() {
        return arbol;
    }

    /**
     * @param arbol the arbol to set
     */
    public void setArbol(ArbolCadenas arbol) {
        this.arbol = arbol;
    }

    /**
     * @return the tabla
     */
    public HashTable[] getTabla() {
        return tabla;
    }

    /**
     * @param tabla the tabla to set
     */
    public void setTabla(HashTable[] tabla) {
        this.tabla = tabla;
    }

    /**
     * @return the nodosString
     */
    public String[] getNodosString() {
        return nodosString;
    }

    /**
     * @param nodosString the nodosString to set
     */
    public void setNodosString(String[] nodosString) {
        this.nodosString = nodosString;
    }

    /**
     * @return the nodo
     */
    public NodoCadena[] getNodo() {
        return nodo;
    }

    /**
     * @param nodo the nodo to set
     */
    public void setNodo(NodoCadena[] nodo) {
        this.nodo = nodo;
    }
    
    
    
}

