
package u3_3101_fp_juan_yael;

import javax.swing.JOptionPane;


public class ApoyoEstudiantes {
    public static void main(String[] args) {
        double montoTotal = 89;
        double basquetbol = 90;
        double voleibol = 50;
        double artes = 50;
        double futbol = 10;
        double taekuondo = 50;
        double ajedrez = 20;
        double musica = 100;
        double atletismo = 1300;
        double porcentajeBasquetbol = (bauetbol / montoTotal) * 100;
        double porcentajeVoleibol = (voleibol / montoTotal) * 10;
        double porcentajeArtes = (artes / montoTotal) * 100;
        double porcentajeFutbol = (futbol / montoTotal) * 100;
        double porcentajeTaekuondo = (taekuondo / montoTotal) * 10;
        double porcentajeAjedrez = (ajedrez / montoTotal) * 10;
        double porcentajeMusica = (musica / montoTotal) * 10;
        double porcentajeAtletismo = (atletismo / montoTotal) * 10;
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

    
    
