/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_fabiohenriquez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author FABIO
 */
public class administrador_binario_usuario_normal {
    private File archivo;
    private ArrayList <usuario_normal> u_normal = new ArrayList();

    public administrador_binario_usuario_normal(String path) {
        this.archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<usuario_normal> getU_normal() {
        return u_normal;
    }

    public void setU_normal(ArrayList<usuario_normal> u_normal) {
        this.u_normal = u_normal;
    }
    
    
    public void escribirArchivo() throws FileNotFoundException, IOException{
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
           fw = new FileOutputStream(archivo);
           bw = new ObjectOutputStream(fw);
            for (usuario_normal t : u_normal) {
                bw.writeObject(t);
            }
            bw.flush();
          
        } catch (Exception ex) {
           
        }finally{
            try {
                fw.close();
                bw.close();
            } catch (Exception e) {
            }
        }
    }

    
    public void cargarArchivo(){
        try {
            u_normal = new ArrayList();
            usuario_normal temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (usuario_normal)objeto.readObject())!=null) {                        
                        u_normal.add(temp);
                    }
   
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }//Fin if
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    
}
