
package aula11;


public class Aula11 {

    
    public static void main(String[] args) {
       
        POJO pj = new POJO ();
        System.out.println(pj.getNome());
        pj.setNome("Joaquim");
        System.out.println(pj.getNome());
        System.out.println(pj.getEndereço());
        pj.setEndereço("Santos");
        System.out.println(pj.getEndereço());
        
        
        
    }
    
}
