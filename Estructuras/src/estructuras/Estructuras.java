
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
        String apellido = persona.get("apellido");

        persona.remove("nombre"); //elimina la clave y valor enviada

        System.out.println(nombre + " " + apellido);
        System.out.println(persona);

        HashMap<String, String> credenciales = new HashMap();
        credenciales.put("usuario", "admin");
        credenciales.put("contrasenia", "1234");

        String user = "admin";
        String pass = "1234";

//        String a = "a"; // instancias
//        String b = "b";
//        String c = a + b;
//
//        if ((a + b) == (c)) {
//        if ((a + b).equals(c)) {
//
//            System.out.println("SE CUMPLE!!!");
//
//        } else {
//            System.out.println("ooops!! NO SE CUMPLE!!!");
//        }

        if (user.equals(credenciales.get("usuario")) && 
                pass.equals(credenciales.get("contrasenia"))) {
            System.out.println("Bienvenido");
        
        }else {
            System.out.println("Verifique los datos");
        }
    }

}
