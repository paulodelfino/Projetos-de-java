
package aula.pkg3.pkg24.pkg01;

import javax.swing.JOptionPane;


public class Aula32401 {

    
    public static void main(String[] args) {
     
        String saida;
        
        int A =Integer.parseInt(JOptionPane.showInputDialog("Digite N1"));
        int B =Integer.parseInt(JOptionPane.showInputDialog("Digite N2"));
        int C =Integer.parseInt(JOptionPane.showInputDialog("Digite N3"));
        
        //Comparando numeros
        if (A == B && A == C )
            saida = "3 Iguais";
        else
            if (A != B && A != C && B!=C)
                saida = "3 Diferentes";
        else
                saida = "2 Iguais";
        
        //Apresentando resultados
        
        JOptionPane.showMessageDialog(null, saida, "Resultado da comparação: ",JOptionPane.PLAIN_MESSAGE);
        
        // **apresenta do menor para o maior
        
        int menor, inter, maior;
        inter = C;
        
        if (A>B){
            maior = A;
            menor = B;
        }
        else {
            maior = B;
            menor = A;
        }
        if (C > maior){
            inter = maior;
            maior = C;
            
        }
        if (C<menor){
            inter = menor;
            menor = C;
        }
           
       JOptionPane.showMessageDialog(null, "Menor =" +menor+ "\nIntermediario =" +inter+ "\n Maior =" +maior,"Resultado da Comparação: ",JOptionPane.PLAIN_MESSAGE);
       
       
       String VTipo;
       
       VTipo = JOptionPane.showInputDialog("Qual o Tipo de Figura - T ou R?");
       
      if (!VTipo.equals ("R") && !VTipo.equals ("T"))// Avisa e finaliza se nao for nem R nem T
           JOptionPane.showInputDialog(null, "Opçao invalida", "Aviso", JOptionPane.PLAIN_MESSAGE);
       else
      {  
          String figura = "", tipo = "";
           
          if (VTipo.equals ("R")){
              figura = "Retangulo";
               int L1 =Integer.parseInt(JOptionPane.showInputDialog("Digite N1"));
               int L2 =Integer.parseInt(JOptionPane.showInputDialog("Digite N2"));
               int area = 0;
               if (L1 == L2)
                   figura = "Quadrado";
               else
                   figura = "Retangulo";
               
             
               
              }
          else {
              figura = "Triangulo";
              int L1 =Integer.parseInt(JOptionPane.showInputDialog("Digite N1"));
              int L2 =Integer.parseInt(JOptionPane.showInputDialog("Digite N2"));
              int L3 =Integer.parseInt(JOptionPane.showInputDialog("Digite N3"));
              
              if (L1 == L2 && L1 == L3)
                  figura = "Tipo Equilatero";
              else 
                  if (L1 == L2 || L2 == L3 || L1 == L3 )
                      figura = "Tipo Isoceles";
              else
                     figura = " Tipo Escaleno" ;
                  
                      
          }
          JOptionPane.showInputDialog(null, "A figura é um" +figura + ".Tipo" +tipo, "Resposta", JOptionPane.PLAIN_MESSAGE);
                if (VTipo.equals("R"))
                   
               
          
      
      
       
          // String FIGURA;
       
       //FIGURA = JOptionPane.showInputDialog("Qual o tipo da Figura - T ou R");
             
      // if ( "T".equals(FIGURA))
          // FIGURA = "triangulo";
                       
       //else
          // if ("R".equals(FIGURA))
              // FIGURA = "RETANGULO";
      // else
                   
      // JOptionPane.showMessageDialog(null, "Opçao invalida", "Aviso", JOptionPane.PLAIN_MESSAGE);
       
       
    }
    
    
}

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
         
       
      
       

       
        
    

