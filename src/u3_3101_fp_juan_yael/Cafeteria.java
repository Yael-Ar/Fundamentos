
package u3_3101_fp_juan_yael;

import javax.swing.JOptionPane;


public class Cafeteria {
    public static void main(String[] args) {
        String colorBola;
        double precioOriginal,  precioFinal,  descuento;
        precioOriginal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad total:"));
        colorBola = JOptionPane.showInputDialog("Seleccione el color de la bola (rojo, verde, azul, amarillo):").toLowerCase();
        if (colorBola.equals("rojo")) {
            descuento = 0.40;
            JOptionPane.showMessageDialog(null, "Descuento del 40%. Color de la bola: rojo");
        } else if (colorBola.equals("verde")) {
            descuento = 0.28;
            JOptionPane.showMessageDialog(null, "Descuento del 28%. Color de la bola: verde");
        } else if (colorBola.equals("azul")) {
            descuento = 0.15;
            JOptionPane.showMessageDialog(null, "Descuento del 15%. Color de la bola: azul");
        } else if (colorBola.equals("amarillo")) {
            descuento = 0.05;
            JOptionPane.showMessageDialog(null, "Descuento del 5%. Color de la bola: amarillo");
        } else {
            descuento = 0;
            JOptionPane.showMessageDialog(null, "Color de bola no válido. No se aplica descuento.");
        }
        precioFinal = precioOriginal - (precioOriginal * descuento);
        JOptionPane.showMessageDialog(null, "El precio final a pagar es: $" + precioFinal);

    
    }    

}

