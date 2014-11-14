    public String mostrarArchivo() {
        try {
            // Se crea el arhivo 
            this.arch = new RandomAccessFile("archivo.txt", "r");
        } catch (FileNotFoundException ex) {
            // Si el archivo no se encuentra se imprime el siguiente mensaje
            System.out.println("No se encontro archivo para lectura");
        }
        // "count" lleva la cuenta de cada una de las lineas del archivo
        int cont = 0;
        String Leer;
        String cadena = "";
        try {
            // Mientras la linea sea distinto de nulo se guardan los datos que contiene en "cadena"
            while ((Leer = arch.readLine()) != null) {
                cont++;
                System.out.println("Se muestra el archivo txt");
                cadena = cadena + "Linea " + cont + ": " + Leer + " " + "\n";
            } 
        } catch (IOException ex) {
            // Si lo anterior falla se imprime el siguiente mensaje
            System.out.println("Error al leer archivo");
        }
        // El método retorna el contenido del archivo txt como String
        return cadena;
    }
    
     public ArrayList leerArchivo() {
        try {
            this.arch = new RandomAccessFile("archivo.txt", "r");
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro archivo para lectura");
        }
        // En la variable "aux" se guardara un Alumno
        Alumno aux = null;
        String Leer;
        String cadena = "";
        // En este ArrayList se va guardando cada alumno que se encuentra en el archivo txt
        ArrayList<Alumno> alum = new ArrayList();
        try { 
            while ((Leer = arch.readLine()) != null) {
                // Por cada linea que se lee en el archivo se separan los textos por una coma y se guardan en aux como Alumno
                cadena = Leer;
                String words[] = cadena.split(",");
                aux = new Alumno(words[0], words[1], words[2], words[3]);
                //Se añade cada lectura a un espacio del ArrayList
                alum.add(aux);

            }
            System.out.println("Se leyo el archivo");

        } catch (Exception e) {
            System.out.println("Error al leer archivo");
        } // El método retorna el ArrayList de Alumnos que se encontraban en el archivo
        return alum;
    }
    public void actualizarTXT(ArrayList lista) throws FileNotFoundException { 
        this.pw = new PrintWriter("archivo.txt");
        // Aquí se reccorre el ArrayList y guarda Alumno en una linea diferente
        for (int i = 0; i < lista.size(); i++) {
            pw.println(lista.get(i));
        }
        pw.close();
        System.out.println("Se actualizo txt");
    }
    
    
