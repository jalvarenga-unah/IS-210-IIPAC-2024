/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rentavehiculo;

/**
 *
 * @author juanalvarenga
 */
public interface CalculoRenta {
    
    public double calculoTarifa( int dias );
    
    public double calculoTarifa( int dias, int descuentoEspecial );
    
    public void imprimir(String nombre);
    
}
