//Padrão de Estrelas: Escreva um programa que imprima um padrão de estrelas conforme o exemplo a seguir. Quantidade de linhas é variavel e informado pelo usuário.
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int linhas;
        String estrelas = "*";

        System.out.println("Digite um nunmero");
        linhas = sc.nextInt();

        System.out.println();

        for (int x = 0; x < linhas; x++){
            System.out.println(estrelas);
            estrelas = estrelas + "*";
        }
    }
}