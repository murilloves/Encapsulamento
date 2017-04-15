package galeria;

public class ObraDeArte {
    protected String titulo;
    protected double preco;
    protected int dataCriacao;
    protected boolean vendida;
    protected String material;
    protected Artista artista;
    
    public ObraDeArte(String titulo, double price, int dataCriacao, String material, Artista art){
        this.titulo = titulo;
        this.preco = price;
        this.dataCriacao = dataCriacao;
        this.material = material;
        this.artista = art;
        this.vendida = false;
    }
    
// SETS
    public void setPreco(double novoPreco){
        this.preco = novoPreco;
    }
    public void setDataCriacao(int data){
        this.dataCriacao = data;
    }
    public void setMaterial(String mat){
        this.material = mat;
    }
    public void setVendida(){
        if (vendida == false)
            vendida = true;
        else
            System.out.println("Obra de arte já foi vendida!!");
    }
    public void setTitulo(String novoTitulo){
        this.titulo = novoTitulo;
    }
    public void setArtista(Artista art){
        this.artista = art;
    }

// GETS
    public double getPreco(){
        return this.preco;
    }
    public int getDataCriacao(){
        return this.dataCriacao;
    }
    public String getMaterial(){
        return this.material;
    }
    public boolean getSeVendida(){
        if (vendida == false)
            System.out.println("Obra de arte disponível no estoque.");
        else
            System.out.println("Obra de arte já foi vendida!!");
        return this.vendida;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getArtista(){
        return this.artista.toString();
    }

    
    
}
