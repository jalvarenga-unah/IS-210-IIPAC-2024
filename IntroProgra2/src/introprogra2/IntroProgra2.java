/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introprogra2;

import java.util.ArrayList;

/**
 *
 * @author juanalvarenga
 */
public class IntroProgra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.print("Hola \t\tmundo\n");
        System.out.print("Programación 2\n");

        // Variables
        //simples
        int edad = 10;
        char letra = '3';
        float reales = 2.36f;
        double dobles = 2.4536436;

        //estructurados
        String nombre = "Juan Alvarenga";
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] postres = new String[3];
        postres[0] = "Pie de limón";
        postres[1] = "3 leches";
        postres[2] = "pan de coco";
//        postres[3] = "pan de coco"; // ❌ no se puede

        System.out.println(nombre.length()); // devuelve el tamaño de la cadena
        System.out.println(numeros.length);

        System.out.println(nombre);

        int ultimaPosicion = numeros.length - 1;
        int ultimaLetra = nombre.length() - 1;

//        System.out.println(numeros[ ultimaPosicion ]   );
//        System.out.println(nombre.charAt( ultimaLetra ));
        //Condiciones
        boolean resultado = 5 > 10;
//        boolean otraVariable = resultado ==  true;

        if (resultado) {
//            System.out.println("La condicion se cumplió");

        } else {
//                System.out.println("La condicion NO se cumplió");
        }

        // si la edad de una persona está entre 15 y 20 años
        if (edad >= 15 && edad <= 20) {

        }

        //estructuras de repetición
        for (int c = 0; c < postres.length; c++) {
//            System.out.println(postres[c]);
        }

        int c = 0;

        while (c < 3) {
//            System.out.println(postres[c]);
            c++;
        }

        ArrayList<String> vegetales = new ArrayList<>();

        vegetales.add("Brocoli");
        vegetales.add("zanahoria");
        vegetales.add("papa");
        vegetales.add("chile dulce");

        for (int cc = 0; cc < vegetales.size(); cc++) {

            System.out.println(vegetales.get(cc));
        }

        //TODO: INVESTIGAR EL MANJEO DE FOREACH
//    vegetales.forEach
        
        for (int i = 0; i < numeros.length; i++) {

//            break
//            continue
            
            
            if (numeros[i] % 2 == 0) {
                System.out.println(i);
                System.out.println(numeros[i]);
                return;
            }
            
            System.out.println("despues de la condicion");

        }

    }
    
    
    
    // metodos / funciones
    
    
    

}
