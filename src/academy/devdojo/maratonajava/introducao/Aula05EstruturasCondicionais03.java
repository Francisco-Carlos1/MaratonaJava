package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!";

        // Operador Ternario: (Condicao) ? verdadeiro : falso;
        String resultado =  salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        //Pode ser usado como na linha abaixo
       //String resultado =  salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda nao tenho condicoes, mas vou ter!" ;

        System.out.println(resultado);

    }
}
