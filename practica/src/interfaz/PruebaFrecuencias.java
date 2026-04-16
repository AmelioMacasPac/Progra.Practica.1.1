package interfaz;

import modelo.FrecuenciasCardiacas;
import javax.swing.JOptionPane;

public class PruebaFrecuencias {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Primer nombre:");
        String apellido = JOptionPane.showInputDialog("Apellido:");
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes de nacimiento (1-12):"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Día de nacimiento:"));
        int anioNac = Integer.parseInt(JOptionPane.showInputDialog("Año de nacimiento:"));

        int anioActual = 2026; // Año actual aproximado (puedes cambiarlo)

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anioNac);

        int edad = persona.calcularEdad(anioActual);
        int fcMax = persona.frecuenciaCardiacaMaxima(edad);
        String rango = persona.rangoFrecuenciaEsperada(fcMax);

        String mensaje = persona.toString() + "\n\n" +
                "Edad actual: " + edad + " años\n" +
                "Frecuencia cardíaca máxima: " + fcMax + " ppm\n" +
                "Rango de frecuencia esperada: " + rango + " ppm";

        JOptionPane.showMessageDialog(null, mensaje, "Frecuencia Cardíaca", JOptionPane.INFORMATION_MESSAGE);
    }
}