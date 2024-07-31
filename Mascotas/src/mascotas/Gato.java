/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotas;

/**
 *
 * @author juanalvarenga
 */
public class Gato extends Animal {

    public String apodo;

    Gato(String apodo, String nombre, String especie, int numeroPatas) {
        // al heredar el construcot padre, debe ser la primera instrucción
        super(nombre, especie, numeroPatas);
        this.apodo = apodo;

    }

    @Override //sobreescribiendo por completo la funcionalidad del metodo
    void hablar() {
        System.out.println("miauuuuuu");
    }

    @Override // sobreescrita parcial
    void mostrarInfo() {

        System.out.println("El apodo es: " + apodo);
        super.mostrarInfo(); // reutilizando las instrucciones
    }

}
