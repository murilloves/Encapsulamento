package projetofinalmurillo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ArmazenaDados {
/*
    Formato do Arquivo:
        modelo:     id|aaaammdd|&|valor|origemDoDinheiro|descricao\n
        exemplo:    00|20160711|+|90.00|Aluguel de caixa|emprestimo para fulano de tal para tal finalidade\n
    
    | = separação entre uma cadeia de dados e outra
    00 = número id;
    20160711 = ano mês e dia
    + = ganho(+) ou despesa(-)
    90.00 = o valor recebido ou gasto
    Aluguel de caixa = Resumo de onde veio o dinheiro ou para onde foi
*/

    //Armazena Ganhos em Arquivo
    //Armazena Gastos em Arquivo
    //Armazena Saldo em Arquivo
    //Armazena em Arquivo

    String path = "C:\\Users\\Public\\Libraries\\dados.txt";
    
    public void Armazenar() throws FileNotFoundException{
        FileInputStream inp = new FileInputStream("dados.txt");
        System.out.println("Falha ao gravar dados no arquivo");
    }
    
}
