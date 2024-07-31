/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotas;

/**
 *
 * @author juanalvarenga
 */
abstract public class Animal {
    
    private String nombre;
    private String especie;
    private int numeroPatas;
    
    Animal(String nombre, String especie, int numeroPatas){
        this.nombre = nombre;
        this.especie = especie;
        this.numeroPatas = numeroPatas;
    }
    
    
    void hablar(){
        System.out.println("emitir sonido");
    
    }
    
    void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Especie: "+especie);
        System.out.println("tiene: "+numeroPatas+" patas");
    }
          
    
}
