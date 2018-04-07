/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_fabiohenriquez;

/**
 *
 * @author FABIO
 */
public class comentario extends publicacion {
     private String contenido;

    public comentario() {
    }

    public comentario(String contenido) {
        this.contenido = contenido;
    }

    public comentario(String contenido, String mensaje, usuario_normal usuario_autor, int privacidad, java.util.Date Date, int estado) {
        super(mensaje, usuario_autor, privacidad, Date, estado);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "comentario{" + "contenido=" + contenido + '}';
    }

    
   
    
    
}
