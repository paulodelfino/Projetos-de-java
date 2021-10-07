package aula.pkg2.pkg23.pkg01;

import javax.swing.JOptionPane;

public class Aula22301 {

    public static void main(String[] args) {
        //Alinhar = shift + alt = f6
        //Declaração, Entrada de dados e conversão dos valores para inteiro
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro Numero Inteiro"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Numero Inteiro"));

        int soma;  //resultado soma
        int subtração;     //resultado subtraçao
        int multiplicação;      //resultado multiplicaçao
        int divisão;       //resultado divisao
        int resto;        //resultado resto

        //Operações dos numeros
        soma = numero1 + numero2;
        subtração = numero1 - numero2;
        multiplicação = numero1 * numero2;
        divisão = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("Resultado da soma é " + soma);
        System.out.println( "Resultado da subtração é " + subtração);
        System.out.println( "Resultado da multiplicação é " + multiplicação);
        System.out.println("Resultado da divisão é " + divisão);
        System.out.println("Resultado do resto é " + resto);
        
        //Apresentação de resultados
        
        //JOptionPane.showMessageDialog(null,"A soma é" +soma,"Resultado:",JOptionPane.PLAIN_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "A soma é " + soma + "\nA subtração é " +subtração+ "\nA multiplicação é " +multiplicação+ "\nA divisão é " + divisão + "\nO Resto é "+resto,"Resutaldo ",JOptionPane.PLAIN_MESSAGE);
        
        //     Faz a leitura de 3 notas e calcula a media aritmetica 
        
        int n1;    //primeiro operando
        int n2;    //segundo operando
        int n3;    //terceiro operando
        int media;  // Resultado da média
        
        //convertendo os strings m numeros inteiros
        
        //Tela de atalho para copiar a linha ctrl + shift + >  e seta pra baixo
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Nota 1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Nota 2"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite Nota 3"));
        
        // Somando os numeros e calculando a média
        
        media = (n1 + n2 + n3)/3;
        
        //System.out.println("O Resultado da media é " + media);
       
        String Status;
        //Verifica valor da media
        
        if (media >=5) { // se maior ou igual a f = aprovado
            Status = "Aprovado";
        }
        
        else { // caso contrario reprovado
            Status = "Reprovado";
           
        }
        
        System.out.println(" A media é " + media + ". O Status é:" + Status);
        
        String Conceito;
        if (media >= 9) 
            Conceito = "A";
        else
            if (media >= 7)
                Conceito = "B";
        else
             if (media >= 5)
                Conceito = "C";
        else
                Conceito = "D";
                
            
         JOptionPane.showMessageDialog(null, "A media é "+media + "-" + Status + "Conceito: " + Conceito, "Resultado da media ",JOptionPane.PLAIN_MESSAGE);   
        // Quando encerra o processo nao é necessario colocar + (*Palavra Conceito por exemplo*, conclui então não é necessario acrescentar o +)
        System.out.println(" O Conceito é: " + Conceito );
        
        // *** 
        
        int num1= Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1"));
        int num2= Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2"));
        
        
        String Comparaçao;
        
        if ( num1 == num2)
            Comparaçao = "Os numeros são iguais";
        else if ( num1 > num2)     
                Comparaçao = " O primeiro número é Maior!";
        else
                Comparaçao = " Segundo é Maior";
   
        JOptionPane.showMessageDialog(null, Comparaçao, "Resultado", JOptionPane.PLAIN_MESSAGE);
        
        
        int no1= Integer.parseInt(JOptionPane.showInputDialog("Digite Numero 1"));
        int no2= Integer.parseInt(JOptionPane.showInputDialog("Digite Numero 2"));
        int no3= Integer.parseInt(JOptionPane.showInputDialog("Digite Numero 3"));
        
       
        String js;
        
        if (no1 == no2) 
            js = "Eles sao Iguais!";
        else if (no2 == no3) 
            js = "Os tres sao iguais!";
        else
            
            
        
              
                 
            
        
   

        
                
       
        
        
     
        System.exit( 0 ); // TERMINA A APLICAÇAO
    } // FECHA O MAIN

} // FECHA A CLASSE
