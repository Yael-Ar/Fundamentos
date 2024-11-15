
package u3_3101_fp_juan_yael;

import javax.swing.JOptionPane;


public class ApoyoEstudiantes {
    public static void main(String[] args) {
        double montoTotal = 89000;
        double basquetbol = 9000;
        double voleibol = 500;
        double artes = 5000;
        double futbol = 1500;
        double taekuondo = 5000;
        double ajedrez = 2500;
        double musica = 1000;
        double atletismo = 1300;
        double porcentajeBasquetbol = (basquetbol / montoTotal) * 10;
        double porcentajeVoleibol = (voleibol / montoTotal) * 10;
        double porcentajeArtes = (artes / montoTotal) * 100;
        double porcentajeFutbol = (futbol / montoTotal) * 100;
        double porcentajeTaekuondo = (taekuondo / montoTotal) * 100;
        double porcentajeAjedrez = (ajedrez / montoTotal) * 100;
        double porcentajeMusica = (musica / montoTotal) * 100;
        double porcentajeAtletismo = (atletismo / montoTotal) * 100;
        String resultado = 
            "Taller: Básquetbol,  Monto asignado: $" + basquetbol + ",  Porcentaje: " + porcentajeBasquetbol + "%\n" +
            "Taller: Voleibol,  Monto asignado: $" + voleibol + ",  Porcentaje: " + porcentajeVoleibol + "%\n" +
            "Taller: Artes,  Monto asignado: $" + artes + ",  Porcentaje: " + porcentajeArtes + "%\n" +
            "Taller: Futbol,  Monto asignado: $" + futbol + ",  Porcentaje: " + porcentajeFutbol + "%\n" +
            "Taller: Taekuondo,  Monto asignado: $" + taekuondo + ",  Porcentaje: " + porcentajeTaekuondo + "%\n" +
            "Taller: Ajedrez,  Monto asignado: $" + ajedrez + ",  Porcentaje: " + porcentajeAjedrez + "%\n" +
            "Taller: Música,  Monto asignado: $" + musica + ",  Porcentaje: " + porcentajeMusica + "%\n" +
            "Taller: Atletismo,  Monto asignado: $" + atletismo + ",  Porcentaje: " + porcentajeAtletismo + "%";

        JOptionPane.showMessageDialog(null,resultado);
    }
}

    
    
