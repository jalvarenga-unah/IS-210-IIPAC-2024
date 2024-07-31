/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentavehiculo;

/**
 *
 * @author juanalvarenga
 */
public class Moto implements CalculoRenta, ImprimirRecibo {

    private double tarifa;
    private final double depreciacion = 0.03;// valor predeterminado

    Moto(String placa, int cantidadRuedas, String tipo, double tarifa) {
//        super(placa, cantidadRuedas, tipo);
        this.tarifa = tarifa;

    }
    
    @Override
    public double calculoTarifa(int dias){
        //realizo el calculo de la tarifa
        return this.tarifa * dias + (this.tarifa * dias * depreciacion);
    }
    
     @Override
    public double calculoTarifa(int dias, int descuentoEspecial) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    /*
            moto: 500 + 3% diario por depreciacion
            autos: 1000 + 4.5% diario por depreciacion 
        caamion: 2000 + 6% + si tiene mas de 6 llantas 
        cobro un extra de 300 por llanta
     */

    @Override
    public void imprimir() {
//        de la clase ImprimirRecibo
     
    }

     @Override
    public void imprimir(String nombre) {
     //de la interface CalculoRenta
    }

   
}
