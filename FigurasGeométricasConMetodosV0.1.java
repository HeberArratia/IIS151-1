package figurasgeométricasconmetodos;

import javax.swing.JOptionPane;

public class FigurasGeométricasConMetodos {

    public static void main(String[] args) {
       String cadena = "";
        int opción = 0;
        double pi = 3.14;
        boolean  ejecuta = true;
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
            switch (opción) {
                case 1:
                   círculo();
                   break;
                case 2:
                    cuadrado();
                    break;
                case 3:
                    triángulo();
                    break;
                case 4:
                    rectángulo();
                    break;
                case 5:
                    cilindro();
                    break;
                case 6:
                    esfera();
                    break;
                case 7:
                    cubo();
                    break;
                case 8:
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
        String captura = JOptionPane.showInputDialog("Ingrese " + variable);
        a = Double.parseDouble(captura);
        if (a>=0) {
        comprobar = true;
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un número positivo!!");
        }
         } catch (NumberFormatException nfe) {
             JOptionPane.showMessageDialog(null, "Valor incorrecto!!");
         }
        }
        return a;
    }
    public static void mensaje(String figura, double perimetro, double area){
        JOptionPane.showMessageDialog(null, "El perímetro del " + figura + " es: " +  perimetro + "\n" + "El área es del " + figura + " es: "+area);
    }
    public static void mensajevolumen(String variante, double volumen){
        JOptionPane.showMessageDialog(null, "El volumen  " + variante + " es: " +  volumen);
    }
    public static void círculo() {
    double radio = dato("radio del círculo");
    double pi = 3.14;
    double perimetro_circulo=2*radio*pi;
    double area_circulo=pi*(2*radio);
    mensaje("círculo",perimetro_circulo,area_circulo);
}
    public static void cuadrado() {
        double lado_cuadrado=dato("lado del cuadrado");
        double perimetro_cuadrado=4*lado_cuadrado;
        double area_cuadrado=2*lado_cuadrado;
        mensaje("cuadrado",perimetro_cuadrado,area_cuadrado);
    }
    public static void triángulo() {
        double lado_triangulo=dato("lado del triángulo");
        double base_triangulo=dato("base del triángulo");
        double altura_triangulo=dato("altura del triángulo");
        double perimetro_triangulo=3*lado_triangulo;
        double area_triangulo=(base_triangulo*altura_triangulo)/2;
        mensaje("triángulo",perimetro_triangulo,area_triangulo);
    }
    public static void rectángulo(){
        double lado1_rectangulo = dato("primer lado del rectángulo");
        double lado2_rectangulo = dato("segundo lado del rectángulo");
        double perimetro_rectangulo=2*lado1_rectangulo+2*lado2_rectangulo;
        double area_rectangulo=lado1_rectangulo*lado2_rectangulo;
        mensaje("rectángulo",perimetro_rectangulo,area_rectangulo);
    }
    public static void cilindro(){
        double pi = 3.14;
        double radio_cilindro = dato("radio del círculo");
        double altura_cilindro = dato("altura del círculo");
        //double area_cilindro = 2*pi*radio_cilindro*(altura_cilindro*radio_cilindro);
        double volumen_cilindro = pi*(2*radio_cilindro)*altura_cilindro;
        // me falta el perimetro
        // me falta imprimir resultados 
        mensajevolumen("del cilindro",volumen_cilindro);
    }
    public static void esfera(){
        double pi = 3.14;
        double radio_esfera = dato("radio de la esfera");
        //double area_esfera = 2*pi*radio_esfera;
        double volumen_esfera=(4/3)*pi*Math.pow(radio_esfera,3);
        // me falta el perimetro
        // me falta imprimir resultados 
        mensajevolumen("de la esfera",volumen_esfera);
    }
    public static void cubo(){
        //double lado_cubo =dato("lado del cubo");
        double arista_cubo = dato("arista del cubo");
        //double areacara_cubo = 2*lado_cubo;
        //double area_cubo=6*areacara_cubo;
        double volumen_cubo=Math.pow(arista_cubo,3);
        // falta perimetro
        // falta imprimir
        mensajevolumen("del cubo",volumen_cubo);
    }
}
