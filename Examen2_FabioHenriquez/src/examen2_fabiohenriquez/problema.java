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
public class problema extends publicacion   {
    private ArrayList<respuesta> respuestas= new ArrayList();
    private String estado;
    private String categoria;

    public problema(String estado, String categoria, String mensaje, usuario_normal usuario_autor, int privacidad, java.util.Date Date, int estad) {
        super(mensaje, usuario_autor, privacidad, Date, estad);
        this.estado = estado;
        this.categoria = categoria;
    }

    


    public ArrayList<respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<respuesta> respuestas) {
        this.respuestas = respuestas;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "problema{" + "respuestas=" + respuestas + ", estado=" + estado + ", categoria=" + categoria + '}';
    }
    
    
    
    
    
    
    
    
    

    
    
}
