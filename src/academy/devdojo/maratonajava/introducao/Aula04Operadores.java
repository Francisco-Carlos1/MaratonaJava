package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 =10;
        int numero02 =20;
        int resultado = numero01*numero02;
        double resultado02 =numero01 / numero02;
        //podemos fazer a conta dentro do sout ou guardar um espaço de memorio com a conta e dps imprimir no. sout

        System.out.println(numero02+numero01);
        //diferente maneiras de usar o +
        System.out.println("Valor "+numero02+numero01);
        System.out.println(resultado);
        System.out.println(resultado02);

        // %
        int resto =20 % 2;
        System.out.println(resto);

        // < >, <=, >=, ==, != sempre retornam valores booleanos sempre retornam true or false

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte "+ isDezIgualQueDez);
        System.out.println("isDezIgualQueDez "+ isDezIgualQueDez);
        System.out.println("isDezDiferenteQueVinte "+isDezDiferenteQueVinte);


        // AND &&, || (OR), ! (NOT)
        int idade =29;
        float salario =3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // =, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus  += 1000;
        bonus -= 1000;
        System.out.println(bonus);

    }
}
