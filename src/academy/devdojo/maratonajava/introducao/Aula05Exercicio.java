package academy.devdojo.maratonajava.introducao;

public class Aula05Exercicio {
    public static void main(String[] args) {
        int salario = 70000;
        String imposto;

        if (salario <= 34712){
            imposto = "Voce ira pagar 9,70% de imposto";
        } else if (salario >= 34713 && salario <= 68507) {
            imposto = "Voce ira pagar 37,55% de imposto";
        }else {
            imposto = "Voce ira pagar 49,50% de imposto";
        }
        System.out.println(imposto);
    }
}
