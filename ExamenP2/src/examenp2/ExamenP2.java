/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenp2;

/**
 *
 * @author juanalvarenga
 */
public class ExamenP2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        System.out.println(reversa("Hola, mundo"));
//        contar('x');

        int[] numeros = {2, 1, 30, 5, 3, 2};

        System.out.println("el repetido es: "+repetido(numeros));

    }
        
    static int repetido(int[] numeros) {

        int result = -1;
        int minIndice = 10000; // TODO: pendiente de revisar
        int[] indices = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            
            //buscar la primera aparicion de los numeros
            int primerAparicion = -1;
            
            for (int j =0; j < i; j++){
                
                if(numeros[j] == numeros[i]){
                
                   primerAparicion = j ;
                   break; // detiene la ejecución del ciclo interno
                }
            } // fin ciclo interno (j)
            
            
            if(primerAparicion != -1){
                
                if(indices[primerAparicion] < minIndice ){
                    minIndice = indices[primerAparicion];
                    result = numeros[i];
                }
                
            }
            
            
        }

        return result;
    }
    
    static String reversa(String texto) {

        String textInverso = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textInverso += texto.charAt(i);
        }

        return textInverso;

    }
      
    static void contar(char letra) {

        String cadena = "Hola mundo, esto es una cadena";

        int conteo = 0;

        for (int i = 0; i < cadena.length(); i++) {

            if (letra == cadena.charAt(i)) {

                conteo++;

            }

        }

        System.out.println("Aparece: " + conteo + " veces");

    }

}
