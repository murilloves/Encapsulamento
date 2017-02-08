package Encapsulamento;

// Cria classe pessoa com os atributos nome, sobrenome...
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String nomeMeio;

    // Construtor
    public Pessoa(String name, String middleName, String surname){
        nome = name;
        sobrenome = surname;
        nomeMeio = middleName;
    }

    // Função que exibe o nome no formato padrão
    public String mostraNome (Pessoa P){
        String nomePadrao;
        
        nomePadrao = sobrenome+", "+nome.charAt(0)+". "+nomeMeio.charAt(0)+".";
        return nomePadrao;
    }

    // Função Main para teste
    public static void main (String[] args){
        Pessoa p = new Pessoa("Mary","Jane","Wattson");
    
        System.out.println(p.mostraNome(p));
    }
}
