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
public class Funciones {
    public String leer(ArbolCadenas arbolCadenas, HashTable hojas, String[] nodos){
    
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
                            
                            i++;
                            while (i < datos_split.length) {
                                String[] preguntas_split = datos_split[i].split("; ");
                                for(int k = 0; k < preguntas_split.length; k++ ){
                                    
                                    boolean existe = false; 
                                    for (int m = 0; m < nodos.length; m++) {
                                        if (nodos[m][0] == preguntas_split[k]){
                                            
                                        }
                                    }

                                    
                                   buscarRegistro();
                                }
                                i++;
                            } 
                        }
                    }
                    
                    br.close();
                    JOptionPane.showMessageDialog(null, "Lectura exitosa.");
                    
                }
                }catch (Exception err){
                    JOptionPane.showMessageDialog(null, "Error al leer los datos.");
                }
                return datos_csv;                            
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
}