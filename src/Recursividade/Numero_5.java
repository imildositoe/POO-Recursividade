package Recursividade;

import java.util.Scanner;

/**
 *
 * @author Imildo Sitoe
 */
public class Numero_5 {
    /**
     * Metodo que serve para retornar todas as combinacoes da substring do numero introduzido
     *
     * @param n
     */
    private static String letras(int n) {
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nova = a.substring(0, n);
        return nova.concat(",").concat(new StringBuilder(nova).reverse().toString());
    }

    /**
     * Metodo que serve para testar o metodo letras(int n)
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Introduza um numero limite :");

        System.out.println("O valor em binario e : " + letras(e.nextInt()));
    }
}
