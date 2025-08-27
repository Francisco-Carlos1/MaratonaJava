package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição01Exercicio {
    public static void main(String[] args) {
        // Imprimir todos os números pares de o até 1000000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) { //if foi para manter o código funcionando independente do início dele
                System.out.println(i);
            }
        }
    }
}