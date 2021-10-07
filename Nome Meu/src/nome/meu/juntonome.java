
package nome.meu;


public class juntonome {
    
    
    public String mostraNome (String sobrenome){
  
        CPF l = new CPF ();
                
//String juntanome = "Yasmin"+sobrenome;
//Aqui n = Yasmin
        
return l.Sra(telefone(sobrenome+ "Saldanha")); 
    }
    // s = Yasmin Saldanha
    public String telefone (String s){
        
        return endereco (s+ " Meu telefone é 9999-9999");
    }
    
    public String endereco (String en){
    
        CPF mi = new CPF ();
        
        return mi.CPF(en+ "Meu endereço é Rua Dr Luis de Campos Moura");
}
    
     //public String CPF (String C){
    
       // return C+ "Meu CPF é 46226403845";
        
        
}
