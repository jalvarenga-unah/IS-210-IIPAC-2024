/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author juanalvarenga
 */
public class Circulo extends CalcularArea {
    
    double radio;
    
    Circulo(double radio){
        super(); // en este caso es opcional
        this.radio = radio;
    }
    
    
    @Override
    double calcularArea(){
        
        return Math.PI * Math.pow(radio, 2);
    
    }

    @Override
    double calcularPerimetro() {
      //retorne el perimetro
      return 0;
    }
    
}
