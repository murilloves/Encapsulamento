package projetofinalmurillo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Murillo Vieira
 * 
 * O trabalho consiste em mostrar ao usuário uma relação do dinheiro
 * que ele ganhou e gastou durante um certo período de tempo.
 * 
 */
public class Teste {

//    public static void main(String[] args) throws IOException {
        // Exibir através do arquivo a lista de tudo o que entrou e saiu

        String local = "C:\\Users\\Public\\Libraries";
        File diretorio = new File(local);

        public Teste() throws FileNotFoundException{
            File arquivo = new File(diretorio,"dados.txt");
            PrintWriter fr = new PrintWriter(arquivo);
            
            fr.println("segundalinha");
            
            fr.close();
            
            
            System.out.println("Deu ruim");
         
        }
    }
    
//}
