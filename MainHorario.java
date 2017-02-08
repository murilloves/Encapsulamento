package Encapsulamento;
import java.util.Scanner;

public class MainHorario {

    public static void main(String[] args) {
        Horario horas1 = new Horario();
        Horario horas2 = new Horario();

        Scanner sc = new Scanner(System.in);

        String i;
        
        //Escaneando Horas
        System.out.println("Digite as horas do Horário 1: ");
        i = sc.nextLine();
        String j = "00";

        //Mudando Horario 1
        horas1.setHorario(i,j,j);

        // Imprimindo Horário 1
        if(horas1.validaHora()){
                System.out.print("Horário 1 -> ");
                horas1.mostraHora();
        } else
                System.out.println("Horário inválido!!! ");

        
        //Escaneando Horas
        System.out.println("\n\nAgora, digite A Hora do Horário 2: ");
        i = sc.nextLine();
            // Verifica se as horas são válidas e faz o "Set" em caso afirmativo
            if(horas2.validaHora())
                horas2.setHora(i);

        //Escaneando Minutos
        System.out.println("Digite Os minutos do Horário 2: ");
        i = sc.nextLine();
            // Verifica se os minutos são válidos e faz o "Set" em caso afirmativo
            if(horas2.validaMinuto())
                horas2.setMinuto(i);

        //Escaneando Segundos
        System.out.println("Digite Os segundos do Horario 2: ");
        i = sc.nextLine();
            // Verifica se os segundos são válidos e faz o "Set" em caso afirmativo
            if(horas2.validaSegundo())
                horas2.setSegundo(i);

        
        System.out.println("Horário 2 -> " + horas2.getHorario());

        int HORAS = horas1.difHorario(horas1,horas2);
        
        System.out.println("A diferença é de " + HORAS/3600 +" horas, " + (HORAS%3600)/60 + " minutos e " + HORAS%60 + " segundos.");
        
    }
}
