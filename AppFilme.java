package appfilme;
import javax.swing.JOptionPane;

public class AppFilme {

    public static void main(String[] args) {
        
        String str;
        Filme n = new Filme("","");
        
        do{
            str = JOptionPane.showInputDialog("Digite o nome de um filme: ");
            Filme f = new Filme("","");
        } while(!"0".equals(str));
        
        System.out.println("O total de filmes criados é de: " + n.getTotalFilmes());
    }
}
