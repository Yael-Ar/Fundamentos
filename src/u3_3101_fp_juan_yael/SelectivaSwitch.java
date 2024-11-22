/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3_3101_fp_juan_yael;
import javax.swing.JOptionPane;
import java.lang.Math;
public class SelectivaSwitch {
    public static void main(String[] yael) {
        // Declaracion de variables
        double a;
        double b;
        double h;
        double r;
        final double PI=3.1416;
        byte opcion1;
        opcion = Byte.parseByte(JOptionPane.showInputDialog("MENU DE OPCIONES\n 1.-AREA TRIANGULO\n 2.-AREA RECTANGULO\n 3.-AREA CIRCULO\n " 
                + "Escribe el numero de tu eleccion"));
        switch (opcion1){
            case 1:
                b=Double.parseDouble(JOptionPane.showInputDialog("Proporciona la base"));
                h=Double.parseDouble(JOptionPane.showInputDialog("Proporciona la altura"));
                a=(b*h)/2;
                JOptionPane.showMessageDialog(null, "El area del triangulo es: " +  a);
                break;
            case 2:
                b=Double.parseDouble(JOptionPane.showInputDialog("Proporciona la base"));
                h=Double.parseDouble(JOptionPane.showInputDialog("Proporciona la altura"));
                a=b*h;
                JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + a);
                break;
            case 3:
                r=Double.parseDouble(JOptionPane.showInputDialog("Proporciona el radio"));
                a=PI*(r*r);
                JOptionPane.showMessageDialog(null, "El area del circulo es: " + a);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Solo se puede seleccionar 1,2 o 3 Intente nuevamente por favor");
        }
    }
    
}
