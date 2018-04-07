/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_fabiohenriquez;

import java.util.ArrayList;

/**
 *
 * @author FABIO
 */
public class respuesta extends publicacion{
    private ArrayList<Integer>calificaciones = new ArrayList();
    private int calificaciongeneral;
    private ArrayList<comentario> comentarios = new ArrayList();

    public respuesta(int calificaciongeneral) {
        this.calificaciongeneral = calificaciongeneral;
    }

    public respuesta(int calificaciongeneral, String mensaje, usuario_normal usuario_autor, int privacidad, java.util.Date Date, int estado) {
        super(mensaje, usuario_autor, privacidad, Date, estado);
        this.calificaciongeneral = calificaciongeneral;
    }

    
    
    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public int getCalificaciongeneral() {
        return calificaciongeneral;
    }

    public void setCalificaciongeneral(int calificaciongeneral) {
        this.calificaciongeneral = calificaciongeneral;
    }

    public ArrayList<comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<comentario> comentarios) {
        this.comentarios = comentarios;
    }

    
    
}
