
package examen2_fabiohenriquez;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;


public class usuario_administrador extends usuario{
    ArrayList<usuario_normal> normales_bloqueados = new ArrayList();
    ArrayList<publicacion> publicaciones_bloqueadas = new ArrayList();

    public usuario_administrador(String nombre, String correo, String nombre_usuario, Date fecha_naciomiento, String contraseña, Icon foto) {
        super(nombre, correo, nombre_usuario, fecha_naciomiento, contraseña, foto);
    }

    public ArrayList<usuario_normal> getNormales_bloqueados() {
        return normales_bloqueados;
    }

    public void setNormales_bloqueados(ArrayList<usuario_normal> normales_bloqueados) {
        this.normales_bloqueados = normales_bloqueados;
    }

    public ArrayList<publicacion> getPublicaciones_bloqueadas() {
        return publicaciones_bloqueadas;
    }

    public void setPublicaciones_bloqueadas(ArrayList<publicacion> publicaciones_bloqueadas) {
        this.publicaciones_bloqueadas = publicaciones_bloqueadas;
    }

    
    @Override
    public String toString() {
        return "usuario_administrador{" + "normales_bloqueados=" + normales_bloqueados + ", publicaciones_bloqueadas=" + publicaciones_bloqueadas + '}';
    }
    
    
    
}
