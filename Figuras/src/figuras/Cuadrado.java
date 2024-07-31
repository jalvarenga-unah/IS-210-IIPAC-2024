/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author juanalvarenga
 */
public class Cuadrado extends CalcularArea {

    double base;
    double altura;

    Cuadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {

        return base * altura;
    }

    @Override
    double calcularPerimetro() {
        //retorne el perimetro
        return 0;
    }

}
