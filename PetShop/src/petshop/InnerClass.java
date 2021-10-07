
package petshop;


public class InnerClass {
    
    public static void main(String[] args) {
          
 
    ClasseDeFora f = new ClasseDeFora();
    ClasseDeFora.ClasseDeDentro m = new ClasseDeFora.ClasseDeDentro();
    
         
    
    m.mess();
    
    Bebida b1 = new Bebida ();
    
    b1.prepara();
    
    Bebida b2 = new Bebida (){
        
        
        public void prepara (){
            
            
            System.out.println("Adicionar agua");
            
            
            
            
           }
    };
    b2.prepara();
    
        
        
        
    }
    
    
    
    
    
    
    
    
      
    
    
}
