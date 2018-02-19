package boletin18;

import javax.swing.JOptionPane;

public class Boletin18 {

    public static void main(String[] args) {

        Buzon obx1 = new Buzon();

        System.out.println("*******MENU*******\n"
                + "1)Número de correos\n"
                + "2)Engadir correo ao buzon\n"
                + "3)Correos por ler\n"
                + "4)Primeiro correo non lido\n"
                + "5)Amosa o correo por posicion\n"
                + "6)Elimina correo por posicion\n"
                + "7)Salir");
        int op = Integer.parseInt(JOptionPane.showInputDialog("Introduce unha opcion"));

        while (op != 7) {
            switch (op) {
                case 1:
                    System.out.println(obx1.numeroDeCorreos());
                    break;
                case 2:
                    String correo = JOptionPane.showInputDialog("Escribe o correo");
                    boolean leido = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Foi leido o correo?"));
                    Correo c = new Correo(correo, leido);
                    obx1.engade(c);
                    break;
                case 3:
                    System.out.println(obx1.porLer());
                    break;
                case 4:
                    System.out.println(obx1.amosaPrimerNoLeido());
                    break;
                case 5:
                    int k = Integer.parseInt(JOptionPane.showInputDialog("Que correo desexas ver?"));
                    System.out.println(obx1.amosa(k));
                    break;
                case 6:
                    int r = Integer.parseInt(JOptionPane.showInputDialog("Que correo desexas eliminar?"));
                    obx1.elimina(r);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("A opción escollida non é válida.");
            }
            System.out.println("*******MENU*******\n"
                    + "1)Número de correos\n"
                    + "2)Engadir correo ao buzon\n"
                    + "3)Correos por ler\n"
                    + "4)Primeiro correo non lido\n"
                    + "5)Amosa o correo por posicion\n"
                    + "6)Elimina correo por posicion\n"
                    + "7)Salir");
            op = Integer.parseInt(JOptionPane.showInputDialog("Introduce unha opcion"));
        }

    }

}
