/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author juanalvarenga
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona p1 = new Persona("Juan Alvarenga",
                30,
                "19191919191919" );
        
        // Clase "padre"
        // Sub-clases "clases hijas"
        Estudiante juan = new Estudiante(
                "Juan Alvarenga",
                30,
                "19191919191919",
                201210010,
                "Ingenieria en Sistenmas"
        );

        juan.saludar(); // es de la clase Estudiante
        System.out.println(juan.dni);

        Estudiante pedro = new Estudiante(
                "Pedro Pedro Pedro",
                10101010,
                "Sexto grado"
        );

        pedro.saludar();
        System.out.println(pedro.dni);

    }

}
