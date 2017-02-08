package Encapsulamento;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

// Classe principal que lê nomes de livros
public class MainLivro {
    public static void main (String[] args){
        System.out.println("");
        
        // Declarando variáveis necessárias
        Scanner sc = new Scanner(System.in);
        int cod = 1, i = 1;
        ArrayList<Livro> lista = new ArrayList();
        Livro l = new Livro();
        
        // Fazendo o armazenamento dos livros em uma lista
        do {
            System.out.println("CATALOGANDO O "+(i)+"º LIVRO");

            // Escaneando os dados de cada livro da lista
            System.out.println("Nome do livro: ");
                l.setTitulo(sc.nextLine());
            System.out.println("Gênero do livro: ");
                l.setGenero(sc.nextLine());
            System.out.println("Editora do livro: ");
                l.setEditora(sc.nextLine());
            System.out.println("Edição do livro: (Ex.: 8ª edição reformulada)");
                l.setEdicao(sc.nextLine());
            System.out.println("Ano: ");
                l.setAno(sc.nextInt());
            System.out.println("Local do livro: (Ex.: São Paulo)");
                l.setLocal(sc.nextLine());
            System.out.println("Codigo do livro: ");
                cod = sc.nextInt();
                l.setCodigo(cod);
            System.out.println("Autor do livro: \n- Digite o primeiro Nome e aperte ''enter''");
            System.out.println("- Digite o Nome do Meio e aperte ''enter''");
            System.out.println("- Digite o Sobrenome e aperte ''enter''");

//                Pessoa p = new Pessoa(sc.nextLine(),sc.nextLine(),sc.nextLine());
//                l.setEditora(p.mostraNome(p));

            System.out.println("\n\n\n");
            // Adicionando o livro à lista
            lista.add(l);
            i++;
            // Aumentando variavel STATIC
            l.setNumeroDeLivros(l);
            
            // TESTE
            // System.out.println(l.getAutor());
            
        }while(cod != 0);
        
        // Exibindo o catálogo de livros na ordem em que foram adicionados
        for(i=0; i<l.getNumeroDeLivros(); i++){
            System.out.println("Código: "+ lista.get(i));
            //System.out.println("Título: "+ TítuloDoLivro);
            //System.out.println("Gênero: "+ GêneroDoLivro);
            System.out.println("Referência: "+"Autor. Título. Edição."+" Local: "+"Editora, ano.");
        }
    }
}
