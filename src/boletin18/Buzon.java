package boletin18;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Buzon {

    private ArrayList<Correo> mail = new ArrayList();

    //calcula cantos correos hai no buzon de correo
    public int numeroDeCorreos() {

        return mail.size();

    }

    //engade c ao buzon
    public void engade(Correo c) {

        mail.add(c);

    }

    //determina se quedan correos por ler
    public boolean porLer() {
        Iterator it = mail.iterator();
        while (it.hasNext()) {
            Correo c = (Correo) it.next();
            if (!c.getLeido()) {
                return true;
            }
        }
        return false;
    }

    //amosa o primeiro correo non lido
    public String amosaPrimerNoLeido() {
        Iterator it = mail.iterator();
        while (it.hasNext()) {
            Correo c = (Correo) it.next();
            if (!c.getLeido()) {
                return c.getCorreo();
            }
        }
        return null;
    }

    //mostra o correo k-ésimo, lido ou non
    public String amosa(int k) {

        Correo c = mail.get(k - 1);
        return c.getCorreo();
    }

    //elimina o correo k-ésimo.
    public void elimina(int r) {

        mail.remove(r - 1);

    }

}
