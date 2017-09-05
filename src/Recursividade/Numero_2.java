package Recursividade;

import java.util.Scanner;

/**
 *
 * @author Imildo Sitoe
 */
public class Numero_2 {

    /**
     * Metodo que serve para multiplicar os valores introduzidos
     *
     * @param n
     */
    private static int multiplicacao(int a, int b) {
        return (a == 1) ? b : b + multiplicacao(a-1, b);
    }

    /**
     * Metodo que serve para testar o metodo multiplicacao(int n)
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Introduza o primeiro numero :");
        int a = e.nextInt();
        System.out.print("Introduza o segundo numero :");
        int b = e.nextInt();

        System.out.println("O valor da multiplicacao e : " + multiplicacao(a,b));
    }
}
