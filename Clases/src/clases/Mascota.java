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
    private String nombre = "";
    private String tipo;
    private String raza;
    private int edad;
//    private Vacuna infoVacuna;
    private ArrayList<Vacuna> vacunas = new ArrayList();

//    Propietario propietario;
    // Propietario -> nombre, edad, genero
    //constructor por defecto
    // definido de forma implicita
    Mascota(String nombre, String tipo, String raza, int edad, ArrayList<Vacuna> vacunas) {

//        this = una instancia de "Mascota"
        this.nombre = nombre;
        this.tipo = tipo;

        this.raza = raza;
        this.edad = edad;

//        this.infoVacuna = info;
        this.vacunas = vacunas;

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

        System.out.println("===Información de las vacunas===");
//        this.vacunas.mostrarInformacion();// es un metodo existente en la clase Vacuna

        //recorrer todo el listado de vacunas
        for (int i = 0; i < vacunas.size(); i++) {

            //acceder a la instancia que se está iterando
            Vacuna info = vacunas.get(i); // devuelve una inastacia de Vacuna

            //ejecutar el método, para obtener la información 
            info.mostrarInformacion();

            System.out.println("\n");

        }

    }

    //getters y setters
    String getNombre() {
        return nombre;
    }

    void setNombre(String valor) throws Exception {

        if (valor.length() < 5 || valor.isBlank()) {

            throw new Exception("EL nombre de la mascota debe ser mayor a 5 letras"); // es lo que impide que continue

        }

        if (valor.length() >= 20) {

            throw new Exception("Nombre muy largo compa");
        }

        this.nombre = valor;

    }

}
