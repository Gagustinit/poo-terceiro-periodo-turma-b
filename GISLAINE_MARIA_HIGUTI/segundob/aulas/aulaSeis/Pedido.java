package segundob.aulas.aulaSeis;

public class Pedido {
    
    private Integer id;

    public Pedido(Integer id){
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public boolean isValid(){
        return true;
    }

}
