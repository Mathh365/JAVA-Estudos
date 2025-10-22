//Desenvolva um algoritmo que recebe uma opção do usuário (metros, quilômetros, centímetros) e converte uma quantidade para a unidade escolhida usando

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String unidadeMedida = null;
        int num = 0;

        System.out.println("""
                           Escolha uma unidade de medida entre:
                           -Metros
                           -Quilometros
                           -Centimetros
                           """);
        unidadeMedida = sc.nextLine().toLowerCase();
        System.out.println("Agora digite um numero em CENTIMETROS");
        num = sc.nextInt();

        switch (unidadeMedida) {
            case "metros":
                System.out.printf("%dCm em %s: %d ",num, unidadeMedida,(num / 100));
        }
    }
}
