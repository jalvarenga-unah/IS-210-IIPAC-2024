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
    public String nombre;// pertenece a Estudiante

    Estudiante(String nombre, int edad, String dni, int numeroCuenta, String carrera) {

//        Persona p = new Persona(); // crea una nueva referencia
        // "super" es la forma de ejecutar el constructor de la clase "Padre"
        super(nombre, edad, dni);

        this.nombre = "Estudiante: "+nombre;

        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }
    
    Estudiante(String nombre, int numeroCuenta, String carrera){
    
        super(nombre);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    
    }
    
        public void saludar(){
            super.saludar();// Esta instrucción ejecuta la funcion de la calse padre           
        System.out.println("Hola, me llamo "+ super.nombre);// hace referencia a la propiedad Estudfiante
    }
    
    

}
