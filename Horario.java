package Encapsulamento;

public class Horario {
    private String hora, minuto, segundo;
    
// ******* MÉTODOS SET ******* \\
    public void setHora(String hour){
        hora = hour;
    }
    public void setMinuto(String min){
        minuto = min;
    }
    public void setSegundo(String sec){
        segundo = sec;
    }
    public void setHorario(String hour, String min, String sec){
        segundo = sec;
        minuto = min;
        hora = hour;
    }
    
// ******* MÉTODOS GET ******* \\
    public String getHora(){
        return hora;
    }
    
    public String getMinuto(){
        return minuto;
    }
    
    public String getSegundo(){
        return segundo;
    }
    
    public String getHorario(){
        return (hora+":"+minuto+":"+segundo);
    }

    // ******* MÉTODOS de VALIDAÇÃO ******* \\
    public boolean validaHora(){
        return (Integer.parseInt(this.hora) < 24);
    }
    public boolean validaMinuto(){
        return (Integer.parseInt(this.minuto) < 60);
    }
    public boolean validaSegundo(){
        return (Integer.parseInt(this.segundo) < 60);
    }
    
    // ******* OUTROS MÉTODOS ******* \\
    public void mostraHora(){
        System.out.println(Integer.parseInt(hora)+"h"+Integer.parseInt(minuto)+"m"+Integer.parseInt(segundo)+"s");
    }
    public static int difHorario(Horario hor1 , Horario hor2){
        int H1 = Integer.parseInt(hor1.getHora());
        int M1 = Integer.parseInt(hor1.getMinuto());
        int S1 = Integer.parseInt(hor1.getSegundo());

        int H2 = Integer.parseInt(hor2.getHora());
        int M2 = Integer.parseInt(hor2.getMinuto());
        int S2 = Integer.parseInt(hor2.getSegundo());

        int HF1 = H1*3600 + M1*60 + S1;
        int HF2 = H2*3600 + M2*60 + S2;
        int HFF;
        
        if (HF1 >= HF2)
        {
            return (HF1 - HF2);
        }
        return (HF2 - HF1);
    }

}
