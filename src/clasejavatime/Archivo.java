
package clasejavatime;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public abstract class Archivo {
    
    
    
    // Este metodo permite guardar los datos del .txt en un ArrayList
    public static void GuardarRegistros(ArrayList<Persona> listaPersonas) {
        try {
            /**
             * Creamos una instancia de Stream para almacenar todas las lineas (registros)
             * del archivo .txt, con ayuda de la clase File y el metodo .lines
             * Luego con la clase Paths y el metodo .get() especificamos la ruta de ese archivo.
             */                       
            Stream<String> registros = Files.lines(Paths.get("C:\\Users\\cuent\\OneDrive\\Documents\\ArchivosExternos\\Archivo.txt"));
            
            // Hacemos uso del metodo .map para convertir cada linea en un objeto persona
            registros.map(registro -> {
                // Separamos los campos de cada registro por medio del metodo .split() con el parametor " ". 
                String[] campo = registro.split(" ");
                
                return new Persona(campo[0], campo[1], campo[2]);
            }).forEach(listaPersonas::add); // Por ultimo agregamos el objeto en la lista de personas
            
            // System.out.println("Tiempo Transcurridos = " + (System.currentTimeMillis() / 1000) + " segundos");
        } catch(Exception e) {
            System.out.println("e = " + e);
        }
    }
}
