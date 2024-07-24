/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author juanalvarenga
 */
public class Persona {
    
    //de preferencia que sean publicas
    public int edad;
    public String nombre;
    public String dni;
    
    Persona(String nombre, int edad, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    
    Persona(String nombre){
        this.nombre = nombre;
    }
      
    public void saludar(){
        System.out.println("Hola, me llamo "+ nombre);
    }
    
}
