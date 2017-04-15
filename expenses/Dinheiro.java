package projetofinalmurillo;

public class Dinheiro{
    protected double qtdR$;
    protected String origem;
    protected String maisDetalhes;
    protected int dia, mes, ano;

    public Dinheiro Inclusao(String oqueeh, double valor, int dd, int mm, int aaaa){
        Dinheiro buffer = new Dinheiro();
        buffer.qtdR$ = valor;
        buffer.origem = oqueeh;
        buffer.dia = dd; buffer.mes = mm; buffer.ano = aaaa;
        return buffer;
    }
    public void Exclusao(int numeroLinha){
        //Exclui aquela linha inteira no arquivo
    }
    public void Alteracao(){
        // Implementar utilizando Exclusão e depois Inclusão
    }
    
    public String Consulta(int numeroLinha){
        return maisDetalhes;
    }
    
    public String Lista(){
        // Todo o conteúdo do arquivo, menos os detalhes
        return "";
    }
    
    public double TOTAL(){
        return 0; /*soma de todos os valores*/
    }
    
}
