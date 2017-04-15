package galeria;

public class Cliente {
    protected String nome;
    protected String cpf;
    protected int telefone;
    
    public Cliente(String nome, String cpf, int telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
// SETS
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(int tel){
        this.telefone = tel;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

// GETS
    public String getCpf(){
        return this.cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public int getTelefone(){
        return this.telefone;
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
