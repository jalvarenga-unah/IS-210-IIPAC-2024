/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

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
    private Vacuna infoVacuna;
    
    // PARA QUE JUEGUEN UN RATO
//    Vacuna[] vacunas = new Vacuna[12];
//    ArrayList<Vacuna> vacunas= new ArrayList();
    
    
    //constructor por defecto
    // definido de forma implicita
    Mascota(String nombre, String tipo, String raza, int edad, Vacuna info) {

//        this = una instancia de "Mascota"
        this.nombre = nombre;
        this.tipo = tipo;

        this.raza = raza;
        this.edad = edad;
        
        this.infoVacuna = info;

    }

    Mascota(String nombre) {

//        this = una instancia de "Mascota"
        this.nombre = nombre;

    }

    Mascota() {
    }

    //comportamientos
    public void mostrarInfo() {
        System.out.println("===========================");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
        System.out.println("===========================");
        
        System.out.println("===Información de la vacuna===");
        this.infoVacuna.mostrarInformacion();// es un metodo existente en la clase Vacuna
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
