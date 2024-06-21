/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

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
    
    
}
