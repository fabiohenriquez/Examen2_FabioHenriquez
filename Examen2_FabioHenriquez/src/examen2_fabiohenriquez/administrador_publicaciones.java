
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


public class administrador_publicaciones {
     private File archivo;
     private ArrayList <publicacion> publicaciones = new ArrayList();

    public administrador_publicaciones(String path) {
        this.archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    
    public void escribirArchivo() throws FileNotFoundException, IOException{
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
           fw = new FileOutputStream(archivo);
           bw = new ObjectOutputStream(fw);
            for (publicacion t : publicaciones) {
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
            publicaciones = new ArrayList();
            publicacion temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (publicacion)objeto.readObject())!=null) {                        
                        publicaciones.add(temp);
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
