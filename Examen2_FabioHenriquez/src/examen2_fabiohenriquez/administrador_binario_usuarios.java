
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


public class administrador_binario_usuarios {
    private File archivo;
    private ArrayList <usuario_administrador> u_administrador = new ArrayList();

    public administrador_binario_usuarios(String Path) {
        this.archivo = new File(Path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<usuario_administrador> getUsuario_administrador() {
        return u_administrador;
    }

    public void setUsuario_administrador(ArrayList<usuario_administrador> usuario_administrador) {
        this.u_administrador = usuario_administrador;
    }
    
    public void escribirArchivo() throws FileNotFoundException, IOException{
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
           fw = new FileOutputStream(archivo);
           bw = new ObjectOutputStream(fw);
            for (usuario_administrador t : u_administrador) {
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
            u_administrador = new ArrayList();
            usuario_administrador temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (usuario_administrador)objeto.readObject())!=null) {                        
                        u_administrador.add(temp);
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
