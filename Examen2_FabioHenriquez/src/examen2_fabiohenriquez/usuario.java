
package examen2_fabiohenriquez;

import java.io.Serializable;
import java.util.Date;
import javax.swing.Icon;


public class usuario implements Serializable{
    private String nombre;
    private String correo;
    private String nombre_usuario;
    private Date fecha_naciomiento;
    private String contraseña;
    private String tipo;
    private Icon foto;

    public usuario() {
    }
    
    
    

    public usuario(String nombre, String correo, String nombre_usuario, Date fecha_naciomiento, String contraseña, Icon foto) {
        this.nombre = nombre;
        this.correo = correo;
        this.nombre_usuario = nombre_usuario;
        this.fecha_naciomiento = fecha_naciomiento;
        this.contraseña = contraseña;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public Date getFecha_naciomiento() {
        return fecha_naciomiento;
    }

    public void setFecha_naciomiento(Date fecha_naciomiento) {
        this.fecha_naciomiento = fecha_naciomiento;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Icon getFoto() {
        return foto;
    }

    public void setFoto(Icon foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
