/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author juanalvarenga
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       String resultado =  saludar();
       
       resultado = resultado + " otro texto";
        System.out.println(resultado);
        
        
        System.out.println(saludar("Juan"));
        
//       saludar() = "agrsdg"; // ❌ no es posible


        suma(3,5);
        
        
        try{
        
             division(3,0);
        }catch( Exception error){
            
            System.out.println(error.getMessage());
            
        }
        
        
        int[] numeros = {3,5,8,7,1,0,9,2,-33,4};
        
        
        
        System.out.println(valorMayor(numeros));
        
        
        
        int[] numeros_desordenados = new int[3];
        
        // Instancia que me permite capturar información desde el teclado
        Scanner sc = new Scanner(System.in);
        
        for (int c = 0; c < numeros_desordenados.length ; c++){
            
            
            System.out.print("Ingrese un número: ");
            numeros_desordenados[c] = sc.nextInt(); // le indica que admite solo numeros enteros
                    
        }
         
        
        ordenar(numeros_desordenados);
        
 
    }
    
    //FUERA DE MAIN
    
    private static boolean ordenar(int[] nums ){
        
        int c =0;
        for( c=0; c < nums.length; c ++){
            System.out.println(nums[c]);
            
        }
        
        
        int[] nums_ordenado = new int[4];
        
        boolean test = true;
        

        return test; // el fin de ejecucion de la funcion
        
    } 
    
    
    
    private static String saludar()
    {
        
        return "Hola mundo";     
        
    }
    
        private static String saludar(String nombre)
    {
        
        return "Hola "+ nombre;     
        
    }
    
    private static String saludar(String nombre, String apellido)
    {
        
        return "Hola mundo";     
        
    }
    
    private static void suma(int n1, int n2){
        System.out.println("el resultado es: "+ (n1+n2));
    }
    
    private static void division(double n1, double n2) throws Exception{
        
        if(n2 == 0) 
            throw new Exception("no se puede dividir entre cero");
        
        System.out.println("el resultado es: "+ n1/n2);
    }
 
    
    public static int valorMayor(int[] numeros){
        
        int numMayor = numeros[0];
        int index = 0;
        
        
        for(int a = 0; a< numeros.length; a++){
            
            if( numeros[a] > numMayor ){
                numMayor = numeros[a];
                index = a;
            }
            
        }
        
        System.out.println("se encontró en la posicion: "+ index);
        return numMayor;
    }
    
}
