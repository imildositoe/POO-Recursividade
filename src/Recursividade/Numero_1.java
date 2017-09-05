package Recursividade;

import java.util.Scanner;

/**
 *
 * @author Imildo Sitoe
 */
public class Numero_1 {

    /**
     * Metodo que serve para converter para binario o numero introduzido
     *
     * @param n
     */
    private static String conversor(int n) {
        String a = "";
        return (n == 0) ? a.trim() : a.concat(conversor(n/2) + (n % 2));
    }

    /**
     * Metodo que serve para testar o metodo conversor(int n)
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Introduza um numero inteiro :");

        System.out.println("O valor em binario e :" + conversor(e.nextInt()));
    }
}
