
package revisaojson;

// PARA GRAVAR
public class GloriaJSON {
    
    private String nome;
    private String endereco;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override // metodo que existe e esta sobescrito 
   public String toString (){
       return "{"+"nome = "+nome+",endereco = "+endereco+",telefone = "+telefone+"}";
       
    
    
}
    
    
    
}
