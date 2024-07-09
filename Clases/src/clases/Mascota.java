/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author juanalvarenga
 */
public class Mascota {

    //propiedades
    private String nombre;
    private String tipo;
    private String raza;
    private int edad;

    //constructor por defecto
    // definido de forma implicita
    Mascota(String nombre, String tipo, String raza, int edad) {

//        this = una instancia de "Mascota"
        this.nombre = nombre;
        this.tipo = tipo;

        this.raza = raza;
        this.edad = edad;

    }

    Mascota(String nombre) {

//        this = una instancia de "Mascota"
        this.nombre = nombre;

    }

    Mascota() {
    }

    //comportamientos
    public void mostrarInfo() {

        String nombre;
        System.out.println("===========================");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
        System.out.println("===========================");
    }

    //getters y setters
    String getNombre() {
        return nombre;
    }

        void setNombre(String valor) throws Exception {

        if (valor.isEmpty()) {
            
            // genere una excepción
            
            throw new Exception("El nombre no puede ser vacío");
            
//            return;  
        }

        this.nombre = valor;

    }

}
