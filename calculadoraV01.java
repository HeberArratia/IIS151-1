package x;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class x {
    public static void main(String[] args) {
        String cadena="";
        int a,b;
        Scanner sc = new Scanner(System.in);
        boolean ejecuta=true;
        String menu[]= new String[] {"\n Operaciones Disponibles: ","1.- Suma","2.- Resta","3.- Multiplicacion","4.- Division", "5.- Encontrar mayor","6.- Obtener porsentaje de un número", "7.-Exit."};
        for (String menu1 : menu) {
            cadena = cadena + menu1 + "\n";
        }
        while (ejecuta) { 	
                        String captura = JOptionPane.showInputDialog(cadena+"Ingrese operación que desea realizar: ");
                        int operacion = Integer.parseInt(captura);                                             
                        switch(operacion){
                            case 1:  
                                 a = ingresaruno();
                                 b = ingresardos();
                                 suma(a,b);   
                                break;
                            case 2: 
                                 a = ingresaruno();
                                 b = ingresardos();
                                 resta(a,b);   
                                break;
                            case 3:
                                a = ingresaruno();
                                b = ingresardos();
                                multiplicacion(a,b);
                                break;
                            case 4:
                                a = ingresaruno();
                                b = ingresardos();
                                division(a,b);
                                break;
                            case 5:
                                a = ingresaruno();
                                b = ingresardos();
                                mayor(a,b);
                                break;
                            case 6: 
                                String capturanumero = JOptionPane.showInputDialog("Ingrese el numero numero ");
                                int c = Integer.parseInt(capturanumero);
                                String capturporsentaje = JOptionPane.showInputDialog("Ingrese el porsentaje ");
                                int d = Integer.parseInt(capturporsentaje);
                                porsentaje(c,d);
                                break;
                            case 7: 
                                ejecuta=false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No se ingreso número valido");
                        }                      
            }            
    }
    public static int ingresaruno(){
        //boolean comprobar = true;
        //while (comprobar) {
        // try {
         String captura = JOptionPane.showInputDialog("Ingrese primer numero ");
         int a = Integer.parseInt(captura);
         //} catch (NumberFormatException nfe????) {
          //      System.out.println("No ingreso número");
          //  }
       // }
      return a;  
}
     public static int ingresardos(){
        String captura = JOptionPane.showInputDialog("Ingrese segundo numero ");
         int b = Integer.parseInt(captura);   
      return b;  
} 
    public static void suma(int a, int b){
        int c=a+b;
        JOptionPane.showMessageDialog(null, "La suma es: "+ c);
    }
    public static void resta(int a, int b){
        int c=a-b;
        JOptionPane.showMessageDialog(null, "La resta es: "+ c);
    }
     public static void multiplicacion(int a, int b){
        int c=a*b;
        JOptionPane.showMessageDialog(null, "La multiplicacion es: "+ c);
    }
     public static void division(int a, int b){
        int c=a/b;
        JOptionPane.showMessageDialog(null, "La division es: "+ c);
    }
      public static void mayor(int a, int b){
        int mayor=a;
        if (mayor<b){
            mayor=b;
        } if (a==b){
            JOptionPane.showMessageDialog(null, "Son iguales");
        } else {
        JOptionPane.showMessageDialog(null, "El numero mayor es: "+ mayor);
        }
    }
       public static void porsentaje(int a, int b){
        int c=a*b/100;
        JOptionPane.showMessageDialog(null, "El prociento es:  "+ c + "%");
    }
}
