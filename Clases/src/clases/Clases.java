package clases;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author juanalvarenga
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //PILARES DE LA POO
//        1. ENCAPSULAMIENTO
//        2. ABSTRACCION
//        3. HERENCIA
//        4. POLIMORFISMO


        //instanciar la clase Vacuna
        
        Vacuna informacion = new Vacuna("Pfizer", "2024-07-09", "La rabia");

           // Se puede usar de forma independiente
//        informacion.mostrarInformacion();
        
        Mascota apolo = new Mascota("Apolo", "Perro", "Terrier", 2, informacion);

//           apolo.nombre = "Apolo";
//           apolo.tipo = "Perro";
//           apolo.raza = "Terrier";
//           apolo.edad = -2;
        try {

            //showInputDialog: el boton "cancelar", retoran un "null"
            String nombre = JOptionPane
                    .showInputDialog("Ingrese el nombre de su mascota");

            apolo.setNombre(nombre);
        } catch (Exception error) {

            JOptionPane.showMessageDialog(null, error.getMessage());

//            System.out.println(error.getMessage());
        }

        apolo.mostrarInfo();

    }

}
