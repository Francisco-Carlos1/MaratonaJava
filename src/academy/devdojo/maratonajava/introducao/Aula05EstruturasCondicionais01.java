package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        //if so executa se o resultado for true
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcolica");
        }else {
            System.out.println("Nao autorizado a comprar bebida alcolica");
        }










        // ! NOT
        if (!isAutorizadoComprarBebida) {
            System.out.println("Nao autorizado a comprar bebida alcolica");
    }
        System.out.println("Fora do if");
}
}