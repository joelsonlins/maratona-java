package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = (int )100000L;
        double salarioDouble = (long) 155.23;
        float salarioFloat = (float)2500.0D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        String nome = "Goku";
        
        System.out.println("A idade é: "+idade+" anos");
        System.out.println(falso);
        System.out.println("char"+caractere);
        System.out.println(numeroGrande);
        System.out.println("Olá, me nome é: "+nome);
    }
}
