package academy.devdojo.maratonajava.introducao;
/*
Pratica
Crie varíaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>
confirmo que recebi o salario de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Pedroca";
        String  endereco ="FATEC";
        double salario = 2000;
        String datarecebimentoSalario = "21/02/2025";
        String relatorio = "Eu "+nome+" morando no endereço "+endereco+" confirmo que recebi o salario "+salario+" na data de "+datarecebimentoSalario;

        System.out.println(relatorio);
    }
}
