
package aula.pkg6.operacao;

public class Calculadora {
    public int soma( String v1, String v2 ) {
        
        int somatoria = Integer.parseInt(v1)+ Integer.parseInt(v2);
                
        return somatoria; 
        
    }
    public int subtracao( String v1, String v2 ) {
        int sub = Integer.parseInt(v1)- Integer.parseInt(v2);
        
        return sub;
    }
    
    public int multiplicacao ( String v1, String v2 ) {
        
        int mult = Integer.parseInt(v1)* Integer.parseInt(v2);
        
        return 0;
    }
    
    public double divisao (String v1, String v2 ) {
        double d = (double)Integer.parseInt(v1)/ Integer.parseInt(v2);
        return d;
    }
    
}
