package modelo;

public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double altura; // en centímetros
    private double peso;   // en kilogramos

    public PerfilMedico(String primerNombre, String apellido, String sexo,
                        int dia, int mes, int anio, double altura, double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = dia;
        this.mesNacimiento = mes;
        this.anioNacimiento = anio;
        this.altura = altura;
        this.peso = peso;
    }

    // Getters y Setters (omito por brevedad, pero están disponibles si los necesitas)

    public int calcularEdad(int anioActual) {
        return anioActual - anioNacimiento;
    }

    public int frecuenciaCardiacaMaxima(int edad) {
        return 220 - edad;
    }

    public String rangoFrecuenciaEsperada(int max) {
        int min = (int) (max * 0.50);
        int maxR = (int) (max * 0.85);
        return min + " - " + maxR;
    }

    public double calcularBMI() {
        double alturaMetros = altura / 100.0;
        return peso / (alturaMetros * alturaMetros);
    }

    @Override
    public String toString() {
        return primerNombre + " " + apellido + " (" + sexo + ")\n" +
                "Fecha de nacimiento: " + diaNacimiento + "/" + mesNacimiento + "/" + anioNacimiento + "\n" +
                "Altura: " + altura + " cm\n" +
                "Peso: " + peso + " kg";
    }
}