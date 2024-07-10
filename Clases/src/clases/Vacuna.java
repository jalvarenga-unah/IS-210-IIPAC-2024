/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author juanalvarenga
 */
public class Vacuna {

    private String nombre;
    private String tipo;
    private String fechaAplicada;
    

    Vacuna( String nombre, String fecha, String tipo ) {
        
        this.nombre = nombre;
        this.fechaAplicada = fecha;
        this.tipo = tipo;
        
    }
    
    
    void mostrarInformacion(){
    
        System.out.println("tiene aplicada la vacuna "+ this.nombre);
        System.out.println("sirve para el  "+ this.tipo);
        System.out.println("fue aplicada el "+ this.fechaAplicada);
    }

}
