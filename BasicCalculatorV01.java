package basiccalculator;
import javax.swing.JOptionPane;
public class BasicCalculator {
    public static void main(String[] args) {
        String cadena = "";
        double a, b;
        int operacion=0;
        boolean ejecuta = true;
        String menu[] = new String[]{"\n Operaciones Disponibles: ", "1.- Suma", "2.- Resta", "3.- Multiplicacion", "4.- Division", "5.- Encontrar mayor", "6.- Obtener porsentaje de un número", "7.-Exit."};
        for (String menu1 : menu) {
            cadena = cadena + menu1 + "\n";
        }
        while (ejecuta) {
            boolean comprobar = false;
        while (!comprobar) {
         try {
            String captura = JOptionPane.showInputDialog(cadena + "Ingrese operación que desea realizar: ");
            operacion = Integer.parseInt(captura);
            comprobar = true;
         } catch (NumberFormatException nfe) {
             JOptionPane.showMessageDialog(null, "No se ingreso opción válida");
         }
        }
            switch (operacion) {
                case 1:
                    a = dato("primer");
                    b = dato("segundo");
                    suma(a, b);
                    break;
                case 2:
                    a = dato("primer");
                    b = dato("segundo");
                    resta(a, b);
                    break;
                case 3:
                    a = dato("primer");
                    b = dato("segundo");
                    multiplicacion(a, b);
                    break;
                case 4:
                    a = dato("primer");
                    b = dato("segundo");
                    division(a, b);
                    break;
                case 5:
                    a = dato("primer");
                    b = dato("segundo");
                    mayor(a, b);
                    break;
                case 6:
                    a = dato("el");
                    b = dato("porsentaje del");
                    porcentaje(a, b);
                    break;
                case 7:
                    ejecuta = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Debe acceder a una operación");
            }
        }
    }
    public static double dato(String variable) {
        double a=0;
        boolean comprobar = false;
        while (!comprobar) {
         try {
        String captura = JOptionPane.showInputDialog("Ingrese " + variable + " número ");
        a = Double.parseDouble(captura);
        comprobar = true;
         } catch (NumberFormatException nfe) {
             JOptionPane.showMessageDialog(null, "Valor incorrecto!!");
         }
        }
        return a;
    }
    public static void suma(double a, double b) {
        double c = a + b;
        JOptionPane.showMessageDialog(null, "La suma es: " + c);
    }
    public static void resta(double a, double b) {
        double c = a - b;
        JOptionPane.showMessageDialog(null, "La resta es: " + c);
    }
    public static void multiplicacion(double a, double b) {
        double c = a * b;
        JOptionPane.showMessageDialog(null, "La multiplicación es: " + c);
    }
    public static void division(double a, double b) {
        double c = a / b;
        JOptionPane.showMessageDialog(null, "La división es: " + c);
    }
    public static void mayor(double a, double b) {
        double mayor = a;
        if (mayor < b) {
            mayor = b;
        }
        if (a == b) {
            JOptionPane.showMessageDialog(null, "Son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
        }
    }
    public static void porcentaje(double a, double b) {
        double c = a * b / 100;
        JOptionPane.showMessageDialog(null, "El prociento es:  " + c + "%");
    }
}
