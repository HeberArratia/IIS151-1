package figurasgeométricassinmetodos;

import javax.swing.JOptionPane;

public class FigurasGeométricasSinMetodos {

    public static void main(String[] args) {
        String cadena = "";
        int opción = 0;
        double pi = 3.14;
        boolean  ejecuta = true, comprueba=true;
        String menu[] = new String[]{"Figuras geométricas disponibles: ", "1.- Círculo", "2.- Cuadrado", "3.- Triángulo", "4.- Rectángulo", "5.- Cilindro", "6.- Esfera", "7.- Cubo","8.- Salir"};
        for (String menu1 : menu) {
            cadena = cadena + menu1 + "\n";
        }
        while (ejecuta) {
            boolean comprobar = false;
            while (!comprobar) {
                try {
                    String captura = JOptionPane.showInputDialog(cadena + "Ingrese opción: ");
                    opción = Integer.parseInt(captura);
                    comprobar = true;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "No se ingreso opción válida");
                }
            }
        
         try {
            switch (opción) {
                case 1:
                    
                    while (comprueba){
                    String capturaradiocirculo = JOptionPane.showInputDialog("Ingrese radio del circulo");
                    double rc = Double.parseDouble(capturaradiocirculo);
                    double perimetrocirculo=2*rc*pi;
                    if (rc>=0) {
                    double areacirculo=pi*(2*rc);
                    JOptionPane.showMessageDialog(null, "El perimetro del circulo es: " +  perimetrocirculo + "\n" + "El area es: " + areacirculo);
                    comprueba= false;  
                    } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un número positivo!!");
                    }
                    }
                    
                    break;
                case 2:
                    while (comprueba){
                    String capturaladocuadrado = JOptionPane.showInputDialog("Ingrese lado del cuadrado");
                    Double lc = Double.parseDouble(capturaladocuadrado);
                    if (lc>=0){
                     double perimetrocuadrado=4*lc;
                    double areacuadrado=2*lc;
                    JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: " +  perimetrocuadrado + "\n" + "El area es: " + areacuadrado);   
                    }
                    JOptionPane.showMessageDialog(null, "Ingrese un número positivo!!");
                    }
                    break;
                case 3:
                    String capturaladotriangulo = JOptionPane.showInputDialog("Ingrese lado del triangulo");
                    Double lt = Double.parseDouble(capturaladotriangulo);
                    String capturabasetriangulo = JOptionPane.showInputDialog("Ingrese base del triangulo");
                    Double bt = Double.parseDouble(capturabasetriangulo);
                    String capturaalturatriangulo = JOptionPane.showInputDialog("Ingrese altura del triangulo");
                    Double at = Double.parseDouble(capturaalturatriangulo);
                    double perimetrotriangulo=3*lt;
                    double areatriangulo=bt*at/2;
                    JOptionPane.showMessageDialog(null, "El perimetro del trangulo es: " +  perimetrotriangulo + "\n" + "El area es: " + areatriangulo);
                    break;
                case 4:
                    String capturaprimerlado = JOptionPane.showInputDialog("Ingrese un lado del rectangulo");
                    Double lr1 = Double.parseDouble(capturaprimerlado);
                    String capturasegundolado = JOptionPane.showInputDialog("Ingrese el otro lado del rectangulo");
                    Double lr2 = Double.parseDouble(capturasegundolado);
                    double perimetrorectangulo=2*lr1+2*lr2;
                    double arearectangulo=lr1*lr2;
                    JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: " +  perimetrorectangulo + "\n" + "El area es: " + arearectangulo);
                    break;
                case 5:
                    String capturaradiocilindro = JOptionPane.showInputDialog("Ingrese el radio del cilindro");
                    Double rca = Double.parseDouble(capturaradiocilindro);
                    String alturacilindro = JOptionPane.showInputDialog("Ingrese la altura del cilindro");
                    Double ac = Double.parseDouble(alturacilindro);
                    double volumen_cilindro = pi*(2*rca)*ac;
                    JOptionPane.showMessageDialog(null, "El volumen del cilindro es: " +volumen_cilindro);
                    break;
                case 6:
                    String capturaradioesfera = JOptionPane.showInputDialog("Ingrese el radio del cilindro");
                    Double re = Double.parseDouble(capturaradioesfera);
                    double volumen_esfera=(4/3)*pi*Math.pow(re,3);
                    JOptionPane.showMessageDialog(null, "El volumen de la esfera es es: " +volumen_esfera);
                    break;
                case 7:
                    String capturaaristacubo = JOptionPane.showInputDialog("Ingrese el radio del cilindro");
                    Double acu = Double.parseDouble(capturaaristacubo);
                    double volumen_cubo=Math.pow(acu,3);
                   JOptionPane.showMessageDialog(null, "El volumen del cubo es: " + volumen_cubo);
                    break;
                case 8:
                    ejecuta = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Debe acceder a una operación");
            }
            } catch (NumberFormatException nfe) {
             JOptionPane.showMessageDialog(null, "Valor incorrecto!!");
         }
        }
        
    }
}
