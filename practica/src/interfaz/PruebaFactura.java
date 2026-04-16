package interfaz;

import modelo.Factura;
import javax.swing.JOptionPane;

public class PruebaFactura {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Ingrese el número de producto:");
        String desc = JOptionPane.showInputDialog("Ingrese la descripción del producto:");
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por artículo:"));

        Factura factura = new Factura(num, desc, cant, precio);

        JOptionPane.showMessageDialog(null, factura.toString(), "Factura", JOptionPane.INFORMATION_MESSAGE);
    }
}