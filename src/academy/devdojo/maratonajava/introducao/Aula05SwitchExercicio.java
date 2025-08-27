package academy.devdojo.maratonajava.introducao;

public class Aula05SwitchExercicio {
    public static void main(String[] args) {
        //Usar Switch, dados os valores de 1 a 7 imprima se é dia util ou final de semana
        //considere 1 como domingo
        byte dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Dom - Final de Semana");
                break;
            case 2:
                System.out.println("Seg - Dia Útil");
                break;
            case 3:
                System.out.println("Ter-Dia Útil");
                break;
            case 4:
                System.out.println("Qua - Dia Útil");
                break;
            case 5:
                System.out.println("Qui - Dia Útil");
                break;
            case 6:
                System.out.println("Sex - Dia Útil");
                break;
            case 7:
                System.out.println("Sab - Final de Semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
