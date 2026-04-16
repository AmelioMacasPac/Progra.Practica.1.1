package interfaz;

import modelo.PerfilMedico;
import java.util.Scanner;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anioActual = 2026;

        System.out.print("Primer nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Sexo (M/F): ");
        String sexo = sc.nextLine();
        System.out.print("Día de nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Mes de nacimiento: ");
        int mes = sc.nextInt();
        System.out.print("Año de nacimiento: ");
        int anio = sc.nextInt();
        System.out.print("Altura (cm): ");
        double altura = sc.nextDouble();
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        int edad = perfil.calcularEdad(anioActual);
        int fcMax = perfil.frecuenciaCardiacaMaxima(edad);
        String rango = perfil.rangoFrecuenciaEsperada(fcMax);
        double bmi = perfil.calcularBMI();

        System.out.println("\n=== PERFIL MÉDICO ===");
        System.out.println(perfil);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Frecuencia cardíaca máxima: " + fcMax + " ppm");
        System.out.println("Rango esperado: " + rango + " ppm");
        System.out.printf("Índice de Masa Corporal (BMI): %.2f\n", bmi);

        System.out.println("\n=== VALORES DE BMI ===");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");

        sc.close();
    }
}