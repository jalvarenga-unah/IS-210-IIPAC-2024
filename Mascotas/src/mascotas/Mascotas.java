/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotas;

/**
 *
 * @author juanalvarenga
 */
public class Mascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Animal a = new Animal("Mishi", "felino", 4);
        
        Gato mishi = new Gato("Mishifus", "Mishi", "felino", 4);
        
        mishi.mostrarInfo();
        mishi.hablar(); // hablar, hace referencia al padre
        
    }
    
}
