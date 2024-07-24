/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author juanalvarenga
 */
public class Estudiante extends Persona {

    public int numeroCuenta;
    public String carrera;

    Estudiante(String nombre, int edad, String dni, int numeroCuenta, String carrera) {

//        Persona p = new Persona(); // crea una nueva referencia
        // "super" es la forma de ejecutar el constructor de la clase "Padre"
        super(nombre, edad, dni);

        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }
    
    Estudiante(String nombre, int numeroCuenta, String carrera){
    
        super(nombre);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    
    }
    
    
    

}
