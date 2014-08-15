package x;
// número a binario de 8bits @HeberArratia 

import javax.swing.JOptionPane;

public class x {

    public static void main(String[] args) {
        boolean comprobar = true;
        int numero = 0, digito;
        String cadena = "";
        int binario[] = new int[8];
        while (comprobar) {
            try {
                String numero1 = JOptionPane.showInputDialog("Intruducir número de 0 a 255");
                numero = Integer.parseInt(numero1);
                if ((numero >= 0) && (numero <= 255)) {
                    comprobar = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Número invalido");
                }
            } catch (Exception e) {
                System.out.println("No ingreso número");
            }

        }
        for (int i = 7; i >= 0; i--) {
            digito = numero % 2;
            numero = numero / 2;
            binario[i] = digito;
        }
        for (int l = 0; l < 8; l++) {
            cadena = cadena + binario[l];

        }
        JOptionPane.showMessageDialog(null, cadena);

        /* System.out.println(Integer.toBinaryString(numero)); */
    }
}
