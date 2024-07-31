/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentavehiculo;

/**
 *
 * @author juanalvarenga
 */
public class Vehiculo {
    
    private String placa;
    private int cantidadRuedas;
    private String tipo; // moto, auto, camion
    
    Vehiculo(String placa, int cantidadRuedas, String tipo){
        
        this.placa = placa;
        this.cantidadRuedas = cantidadRuedas;
        this.tipo = tipo;
    }
    
    
}
