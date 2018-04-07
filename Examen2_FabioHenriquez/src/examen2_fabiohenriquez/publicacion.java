package examen2_fabiohenriquez;

import java.io.Serializable;
import java.util.Date;

public class publicacion implements Serializable {

    private String mensaje;
    private usuario_normal usuario_autor = new usuario_normal();
    private int privacidad;
    private Date Date;
    ///
    private problema problem;
    private respuesta conte;
    private comentario coment;
    ///
    private int estado;
    

    public publicacion() {
    }

    
    
    public publicacion(String mensaje, usuario_normal usuario_autor, int privacidad, Date Date,int estado) {
        this.mensaje = mensaje;
        this.usuario_autor = usuario_autor;
        this.privacidad = privacidad;
        this.Date = Date;
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public usuario getUsuario_autor() {
        return usuario_autor;
    }

    public void setUsuario_autor(usuario_normal usuario_autor) {
        this.usuario_autor = usuario_autor;
    }

    public int getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(int privacidad) {
        this.privacidad = privacidad;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public problema getProblem() {
        return problem;
    }

    public void setProblem(problema problem) {
        this.problem = problem;
    }

    public respuesta getConte() {
        return conte;
    }

    public void setConte(respuesta conte) {
        this.conte = conte;
    }

    public comentario getComent() {
        return coment;
    }
    
    
    public void setComent(comentario coment) {
        this.coment = coment;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
        
    
 

}
