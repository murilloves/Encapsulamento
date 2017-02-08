package Encapsulamento;

// Cria classe Livro
public class Livro {
    private String titulo;
    private String genero;
    private String editora;
        private String edicao;
        private int ano;
        private String local;
    private int codigo;
    private Pessoa autor;

// ******* MÉTODOS SETS ******* \\
    public void setTitulo(String titl){
        titulo = titl;
    }
    public void setGenero(String genr){
        genero = genr;
    }
    public void setEditora (String edit){
        editora = edit;
    }
        public void setEdicao (String edc){
            edicao = edc;
        }
        public void setAno (int ona){
            ano = ona;
        }
        public void setLocal (String lcl){
            local = lcl;
        }
    public void setCodigo (int code){
        codigo = code;
    }
    public void setAutor (Pessoa p){
    //    autor = new Pessoa(p.nome, p.nomeMeio, p.sobrenome);
    }

// ******* METODOS GETS ******* \\
    public String getTitulo(){
        return this.titulo;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getEditora(){
        return this.editora;
    }
        public String getEdicao (){
            return edicao;
        }
        public int getAno (){
            return ano;
        }
        public String getLocal (){
            return local;
        }
    public int getCodigo(){
        return this.codigo;
    }
    public Pessoa getAutor(){
        return this.autor;
    }
    
// STATIC
    private static int qtdLivros = 0;
    public void setNumeroDeLivros(Livro l){
        qtdLivros++;
    }
    public int getNumeroDeLivros(){
        return Livro.qtdLivros;
    }
    
}
