
package examen2_fabiohenriquez;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;


public class usuario_normal extends usuario implements Serializable{
    ArrayList<publicacion> publicaciones = new ArrayList();
    ArrayList<usuario_normal> amigos = new ArrayList();
    ArrayList<usuario_normal> solicitudes = new ArrayList();
    private int estado;

    public usuario_normal(){
        
    }
    
    public usuario_normal(String nombre, String correo, String nombre_usuario, Date fecha_naciomiento, String contraseña, Icon foto,int estado) {
        super(nombre, correo, nombre_usuario, fecha_naciomiento, contraseña, foto);
        this.estado = estado;
    }

    public ArrayList<publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public ArrayList<usuario_normal> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<usuario_normal> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<usuario_normal> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<usuario_normal> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    
    @Override
    public String toString() {
        System.out.println();
        return "usuario_normal{" + "publicaciones=" 
                + publicaciones + '}';
    }
    
    
    
    
    
    
}
