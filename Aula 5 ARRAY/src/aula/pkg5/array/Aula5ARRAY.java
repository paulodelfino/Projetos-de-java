
package aula.pkg5.array;

import javax.swing.JOptionPane;


public class Aula5ARRAY {

   
    public static void main(String[] args) {
      
        String valor = JOptionPane.showInputDialog("Entre com um valor ate 999");
        
        String []unidade = {"zero","um","dois","tres","quatro","cinco", "seis", "sete","oito", "nove"};
        String []dezena = {"zero","dez","vinte","trinta","quarenta","cinquenta", "sessenta", "setenta","oitenta", "noventa"};
        String []centena = {"zero","cem","duzentos","trezentos","quatrocentos","quinhentos", "seiscentos", "setecentos","oitocentos", "novecentos"};
        
        if (valor.length()==1) {
            System.out.println(unidade[Integer.parseInt(valor.substring(0,1))]); 
        }
        if (valor.length()==2) {
            System.out.println(dezena[Integer.parseInt(valor.substring(0,1))]+ "e" +unidade[Integer.parseInt(valor.substring(1,2))]);
            
        }
        if (valor.length()==3) {
            System.out.println(centena[Integer.parseInt(valor.substring(0,1))]+ "e" +dezena [Integer.parseInt(valor.substring(1,2))]+ "e" +unidade [Integer.parseInt(valor.substring(2,3))]);
        }
                       
        
    }
    
}
