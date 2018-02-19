package boletin18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Correo {

    private String correo;
    private boolean leido;

    public Correo() {
    }

    public Correo(String contido, boolean confirmacion) {
        this.correo = contido;
        this.leido = confirmacion;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean getLeido() {
        return leido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "contido: " + correo + ", confirmacion: " + leido;
    }

}
