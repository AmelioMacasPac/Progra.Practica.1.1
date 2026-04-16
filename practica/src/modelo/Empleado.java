package modelo;

public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        setSalarioMensual(salarioMensual);
    }

    public String getPrimerNombre() { return primerNombre; }
    public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }

    public String getApellidoPaterno() { return apellidoPaterno; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }

    public double getSalarioMensual() { return salarioMensual; }
    public void setSalarioMensual(double salario) {
        if (salario > 0.0) this.salarioMensual = salario;
    }

    public double getSalarioAnual() {
        return salarioMensual * 12;
    }

    public void aumentar10Porciento() {
        salarioMensual = salarioMensual * 1.10;
    }

    @Override
    public String toString() {
        return primerNombre + " " + apellidoPaterno;
    }
}