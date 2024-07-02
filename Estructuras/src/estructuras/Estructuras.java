
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author juanalvarenga
 */
public class Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        HashMap<String, String> persona = new HashMap<>();
        
        persona.put("nombre", "Juan");
        persona.put("apellido", "Alvarenga");
        
        
        String nombre = persona.get("nombre");
        String apellido = persona.get("Apellido");
        
        System.out.println(nombre + " "+ apellido  );
    }
    
}
