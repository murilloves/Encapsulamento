package galeria;

public class Artista {
    protected String nome;
    protected int dataNascimento;
    protected String localNascimento;
    
    public Artista(String nome, String local, int data){
        this.nome = nome;
        this.dataNascimento = data;
        this.localNascimento = local;
    }
    
// SETS
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setData(int data){
        this.dataNascimento = data;
    }
    public void setLocal(String local){
        this.localNascimento = local;
    }

// GETS
    public String getLocal(){
        return this.localNascimento;
    }
    public String getNome(){
        return this.nome;
    }
    public int getData(){
        return this.dataNascimento;
    }

// Implementar ...
    @Override
    public String toString(){
        return "";
    }
    public void imprimir(){
        System.out.println();
    }
}
