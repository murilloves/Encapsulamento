package projetofinalmurillo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriaArquivo {
    String local = "C:\\Users\\Public\\Libraries";
    File diretorio = new File(local);
    File arquivo = new File(diretorio,"dados.txt");

    private static CriaArquivo instancia = null;

    protected CriaArquivo(){
        // Apenas para eliminar a instanciação
    }
    
    
    public String CriaArquivo() throws IOException{
        if(instancia == null){
            FileWriter f = new FileWriter(arquivo);
            f.close();
            return "Arquivo Criado com Sucesso!";
        }
        return "Arquivo já criado";
    }

}
