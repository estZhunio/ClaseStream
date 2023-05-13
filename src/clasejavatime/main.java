package clasejavatime;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class main {

    public static ArrayList<Persona> listaPersonas = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Archivo.GuardarRegistros(listaPersonas);
        
        new Index().setVisible(true);
        
        // System.out.println("listaPersonas.size() = " + listaPersonas.size());
        

    }
    
}
