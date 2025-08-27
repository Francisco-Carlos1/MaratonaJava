package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10){// dentro do while tem q ser um valor booleano ou seja true or false
            System.out.println(count);
            count += 1;
        }
        count = 0;
        do { //executa pelo menos uma vez msm se o valor for false
            System.out.println("dentro do do-while"+count);
            count ++;
        } while (count < 10);
        count = 0;
        for (int i= 0;i<10; i++){
            System.out.println("For"+i);
        }
    }
}
