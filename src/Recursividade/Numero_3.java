package Recursividade;

import java.util.Scanner;

/**
 *
 * @author Imildo Sitoe
 */
public class Numero_3 {

    /**
     * Metodo que calcula a soma dos caracteres do numero introduzido
     * @param n 
     */
    private static int soma(int n) {
        return (n == 0) ? 0 : (n % 10) + soma(n / 10);
    }
    
    /**
     * Metodo que serve para testar o metodo soma(int n)
     * @param args 
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Introduza o numero :");
        
        System.out.println("O valor da soma e : " + soma(e.nextInt()));
    }
}
