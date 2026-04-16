package interfaz;

import modelo.Fecha;
import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese mes (1-12): ");
        int mes = sc.nextInt();
        System.out.print("Ingrese día: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese año: ");
        int anio = sc.nextInt();

        Fecha fecha = new Fecha(mes, dia, anio);

        System.out.print("\nFecha ingresada: ");
        fecha.mostrarFecha();

        sc.close();
    }
}