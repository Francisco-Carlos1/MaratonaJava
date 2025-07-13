package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        //if so executa se o resultado for true
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcolica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Nao autorizado a comprar bebida alcolica");
    }
        System.out.println("Fora do if");
}
}