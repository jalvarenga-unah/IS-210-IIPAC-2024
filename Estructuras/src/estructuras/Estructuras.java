
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

        HashMap[] usuarios = new HashMap[3];

        HashMap<String, String> credenciales = new HashMap();
        credenciales.put("usuario", "admin");
        credenciales.put("contrasenia", "1234");

        HashMap<String, String> credenciales2 = new HashMap();
        credenciales2.put("usuario", "caja");
        credenciales2.put("contrasenia", "1122");

        HashMap<String, String> credenciales3 = new HashMap();
        credenciales3.put("usuario", "reportes");
        credenciales3.put("contrasenia", "4321");

        usuarios[0] = credenciales;
        usuarios[1] = credenciales2;
        usuarios[2] = credenciales3;

        String user = "caja";
        String pass = "1122";

//        System.out.println(usuarios[0]); // credenciales
        boolean encontrado = false;
        for (int i = 0; i < usuarios.length; i++) {

            if (user.equals(usuarios[i].get("usuario"))
                    && pass.equals(usuarios[i].get("contrasenia"))) {
                encontrado = true;
                break;
            }

        }

        if (encontrado ) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Verifique los datos");
        }

        /*
        [
            {usuario=admin, contrasenia=1234},
            {usuario=caja, contrasenia=1122},
            {usuario=reportes, contrasenia=4321}
        ]
         */
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
//        if (user.equals(credenciales.get("usuario"))
//                && pass.equals(credenciales.get("contrasenia"))) {
//            System.out.println("Bienvenido");
//
//        } else {
//            System.out.println("Verifique los datos");
//        }
    }

}
