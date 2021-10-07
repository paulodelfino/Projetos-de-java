
package aula.pkg1.pkg22.pkg01;


//importação classe JOptionPane- responsavel por apresentar janelas de mensagens
import javax.swing.JOptionPane; 

public class Aula12201 {
    
    public static void main(String[] args) {
        
        //comando que apresenta um display (mensagem) na saida
        System.out.println("Curso de Java");
        
        //Caixa de Mensagem com parâmetros de texto/titulo e type 0-3
        JOptionPane.showMessageDialog(null, "Texto da Mensagem", "Titulo da Caixa de Mensagem", 0);
        
        //Declaração de variável tipo String = vai guardar o valor da caixa de mensagem
        String primeiroNumero; 
        primeiroNumero = JOptionPane.showInputDialog("Digite o Primeiro Numero");
        //tecla de atalho para o comando abaixo = sout+tab
        System.out.println(primeiroNumero);
        // Tecla de atalho para executar e projetar = f6
        
        String segundoNumero;
        segundoNumero = JOptionPane.showInputDialog("Digite o Segundo Numero");
        
        System.out.println(segundoNumero);
        int soma;
        //soma=primeiroNumero: ERRO DE CONVERSÃO
        int numero1;          //primeiro operando de adiçao
        int numero2;          // segundo operando de adição
        //convertendo a string em numeros inteiros
        numero1 = Integer.parseInt(primeiroNumero);
        numero2 = Integer.parseInt(segundoNumero);
        
        //somando
        soma = numero1 + numero2;
        System.out.println(soma);
        //Apresentando resultado
        
        
        
    }
    
}
