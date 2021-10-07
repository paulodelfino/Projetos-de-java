
package aula11;

public class Deputado {
   
    private String nome;
    private String partido; 
    private String estado;

       public Deputado() {
    }
       public String toString (){
           return this.nome;
           
       }
       
    public Deputado(String nome, String partido, String estado) {
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
