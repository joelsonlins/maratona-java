package academy.devdojo.maratonajava.introducao;
/*
Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "José Arlindo";
        String endereco = "Rua Lazário da Silva";
        double salario = 2750.25;
        String dataRecebimentoSalario = "12/03/2025";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+", na data "+dataRecebimentoSalario;

        System.out.println(relatorio);

    }
}
