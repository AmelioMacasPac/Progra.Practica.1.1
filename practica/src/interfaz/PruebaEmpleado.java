package interfaz;

import modelo.Empleado;
import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Empleado 1
        System.out.print("Primer nombre empleado 1: ");
        String n1 = sc.nextLine();
        System.out.print("Apellido empleado 1: ");
        String a1 = sc.nextLine();
        System.out.print("Salario mensual empleado 1: ");
        double s1 = sc.nextDouble();
        sc.nextLine();

        Empleado emp1 = new Empleado(n1, a1, s1);

        // Empleado 2
        System.out.print("\nPrimer nombre empleado 2: ");
        String n2 = sc.nextLine();
        System.out.print("Apellido empleado 2: ");
        String a2 = sc.nextLine();
        System.out.print("Salario mensual empleado 2: ");
        double s2 = sc.nextDouble();

        Empleado emp2 = new Empleado(n2, a2, s2);

        System.out.println("\n=== SALARIOS ANUALES INICIALES ===");
        System.out.println(emp1 + " → Anual: $" + String.format("%.2f", emp1.getSalarioAnual()));
        System.out.println(emp2 + " → Anual: $" + String.format("%.2f", emp2.getSalarioAnual()));

        emp1.aumentar10Porciento();
        emp2.aumentar10Porciento();

        System.out.println("\n=== SALARIOS ANUALES DESPUÉS DEL AUMENTO DEL 10% ===");
        System.out.println(emp1 + " → Anual: $" + String.format("%.2f", emp1.getSalarioAnual()));
        System.out.println(emp2 + " → Anual: $" + String.format("%.2f", emp2.getSalarioAnual()));

        sc.close();
    }
}