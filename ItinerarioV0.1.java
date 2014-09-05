package ejercicioitinerario;

import javax.swing.JOptionPane;

public class EjercicioItinerario {

    public static void main(String[] args) {
        preguntarCiudades();
    }

    public static void preguntarCiudades() {
        int cantidadCiudades = ingresarNúmeroPositivo("¿Cuántas ciudades?");
        llenadoMatriz(cantidadCiudades);
    }

    public static void llenadoMatriz(int c) {

        int cc = c + 1;
        String Basededatos[][] = new String[cc][cc];
        for (int i = 0; i < cc; i++) {
            for (int j = 0; j < cc; j++) {
                Basededatos[i][j] = "-";
            }
        }
        llenadoCiudadesYCeros(Basededatos, cc);
    }

    public static void llenadoCiudadesYCeros(String[][] Basededatos, int cc) {
        Basededatos[0][0] = "Dis";
        for (int i = 0; i + 1 < cc; i++) {
            boolean comprobar=true;
            while (comprobar) {
            String ciudad = ingresarString("Ingrese nombre ciudad " + (i + 1));
            if (esNúmero(ciudad)==true){
                JOptionPane.showMessageDialog(null, "Por favor no ingrese sólo números");
            } else{
                Basededatos[0][i + 1] = ciudad;
                Basededatos[i + 1][0] = ciudad;
                comprobar= false;
            }          
           } 
            Basededatos[i + 1][i + 1] = "0";
        }
        
        distanciasCiudades(Basededatos, cc);
    }

    public static void distanciasCiudades(String[][] Basededatos, int cc) {
        for (int i = 0; i + 1 < cc + 1; i++) {
            for (int j = 0; j + 1 < cc + 1; j++) {
                if (Basededatos[i][j].equals("-")) {
                    int capturadistancia = ingresarNúmeroPositivo("Distancia entre " + Basededatos[0][i] + "-" + Basededatos[j][0]);
                    String distancia = String.valueOf(capturadistancia);
                    Basededatos[i][j] = distancia;
                    Basededatos[j][i] = distancia;

                }
            }

        }
        cantidadItinerario(Basededatos, cc);
    }

    public static void cantidadItinerario(String[][] Basededatos, int cc) {
        int cc2 = 0;
        boolean comprobarcc2 = true;
        while (comprobarcc2) {
            int cantidadCiudadesItinerario = ingresarNúmeroPositivo("¿Cuántas ciudades tiene el itinerario?");
            if (cantidadCiudadesItinerario <= cc-1) {
                cc2 = cantidadCiudadesItinerario + 1;
                comprobarcc2 = false;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese número válida!");
            }
        }
        itinerario(Basededatos,cc,cc2);
    }
    public static void itinerario (String[][] Basededatos, int cc, int cc2) { 
        String cadenaa = "";
        for (int i = 0; i + 1 < cc; i++) {
            cadenaa = cadenaa + "* " + Basededatos[0][i + 1] + "\n";
        }
        int guarda = 0;
        int s = 1;
        double acu = 0;
        for (int i = 0; i + 1 < cc2; i++) {
            boolean comprobar = true;
            while (comprobar) {
                String llenar = ingresarString("Ciudades disponibles: //" + cadenaa + "Ingrese nombre ciudad " + (i + 1));
                for (int j = 0; j + 1 < cc; j++) {
                    if (llenar.equals(Basededatos[0][j + 1])) {
                        if (s == 1) {
                            guarda = j + 1;
                        }
                        comprobar = false;
                        Double aux = Double.parseDouble(Basededatos[j + 1][guarda]);
                        guarda = j + 1;
                        acu = acu + aux;
                        s = 2;
                    }
                }
                if (comprobar) {
                    JOptionPane.showMessageDialog(null, "Ingrese ciudad válida!");
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La distancia es: " + acu);

    }

    public static int ingresarNúmeroPositivo(String texto) {
        int dato = 0;
        boolean comprobar = false;
        while (!comprobar) {
            try {
                String datostring = JOptionPane.showInputDialog(texto);
                dato = Integer.parseInt(datostring);
                if (dato > 0) {
                    comprobar = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Valor incorrecto!!");
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Valor incorrecto!!");
            }
        }
        return dato;
    }
    public static boolean esNúmero(String dato){
        try {
            Double.parseDouble(dato);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static String ingresarString(String texto) {
        String cadena = "";
        String lista = texto;
        String menu[] = lista.split("//");
        for (String menu1 : menu) {
            cadena = cadena + menu1 + "\n";
        }
        String datostring = JOptionPane.showInputDialog(cadena);
        if (null == datostring) {
            preguntarCiudades();
        }
        return datostring;
    }
}

