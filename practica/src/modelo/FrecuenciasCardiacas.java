package modelo;

public class FrecuenciasCardiacas {
    private String primerNombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String primerNombre, String apellido, int mes, int dia, int anio) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.mesNacimiento = mes;
        this.diaNacimiento = dia;
        this.anioNacimiento = anio;
    }

    // Getters y Setters (simplificados)
    public String getPrimerNombre() { return primerNombre; }
    public String getApellido() { return apellido; }
    public int getMesNacimiento() { return mesNacimiento; }
    public int getDiaNacimiento() { return diaNacimiento; }
    public int getAnioNacimiento() { return anioNacimiento; }

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

    @Override
    public String toString() {
        return primerNombre + " " + apellido + "\n" +
                "Fecha de nacimiento: " + mesNacimiento + "/" + diaNacimiento + "/" + anioNacimiento;
    }
}