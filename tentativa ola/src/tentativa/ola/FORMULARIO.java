
package tentativa.ola;


public class FORMULARIO {
    static CADASTRO cad = new CADASTRO ();
     public static void main(String[] args) {
         
         
         cad.nomes [0]= "Senai";
         cad.nomes [1]= "Santos";
         
         System.out.println(cad.nomes [1]);
         mostra (); 
              }
              
     public static void mostra (){
         
         System.out.println("Metodo mostra"+ cad.nomes [0]);
         
     }
     
}
