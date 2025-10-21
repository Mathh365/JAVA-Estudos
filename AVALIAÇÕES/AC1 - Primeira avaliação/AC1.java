//Matheus Marcelo Cassiolato Crudi - 200284 - ADS - CÓDIGO: <AC1-27>

package com.mycompany.ac1;
import java.util.Scanner;

public class AC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ac1, ac2, ag, af, notaCorte, mediaFinal, mediaSemAG = 0;

        System.out.println("Todas as notas devem estar entre 0 - 10");
        System.out.print("Digite a nota da AC1 \nNota:");
        ac1 = sc.nextDouble();
        System.out.print("Digite a nota da AC2 \nNota:");
        ac2 = sc.nextDouble();
        System.out.print("Digite a nota da AG \nNota:");
        ag = sc.nextDouble();
        System.out.print("Digite a nota da AF \nNota:");
        af = sc.nextDouble();
        System.out.print("Digite a nota de corte (o minimo necessario para passar)\nNota:");
        notaCorte = sc.nextDouble();

        mediaFinal = (ac1 * 0.15) + (ac2 * 0.3) + (ag * 0.1) + (af * 0.45);
        System.out.println("Sua media e " + mediaFinal);

        if (mediaFinal >= notaCorte){
            System.out.println("Parabens, voce foi aprovado");
        } else {
            System.out.println("Infelizmente voce foi reprovado, faltou " + (mediaFinal - notaCorte) + " para voce conseguir" );
        }

        System.out.printf("""
                Suas notas foram respectivamente:
                AC1: %.2f
                AC2: %.2f
                AG: %.2f
                AF: %.2f
                E sua nota de corte era: %.2f
                """, ac1, ac2, ag, af, notaCorte);

        mediaSemAG = (ac1 * 0.15) + (ac2 * 0.3) + (af * 0.45);
        System.out.println("Caso sua nota da AG tivesse sido 0, sua nota seria seria: " + mediaSemAG + " com uma diferença de: " + (mediaFinal - mediaSemAG));

    }
}
