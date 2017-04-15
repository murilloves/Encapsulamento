package galeria;

public class Venda {
    protected int dataVenda;
    protected Cliente client;
    protected ObraDeArte obra;
    
    public Venda (int data, Cliente cc, ObraDeArte oo){
        this.dataVenda = data;
        this.client = cc;
        this.obra = oo;
    }
    
    
}
