
package aula11;


public class POJO2 extends POJO3 {
    
    private String endereço = "Santos";
    private String estado = "São Paulo";
    private String país = "Brasil";
    
    public POJO2 (){
        
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }
    
}
