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
     * @param i 
     */
    private static int soma(int n , int i) {
        String numero = Integer.toString(n);
        if (i == 0) {
            return Integer.parseInt(Character.toString(numero.charAt(i)));
        } else {
            return Integer.parseInt(Character.toString(numero.charAt(i))) + soma(n, i - 1);
        }
    }
    
    /**
     * Metodo que serve para fixar o tamanho dos caracteres do numero introduzido
     * @param n 
     */
    private static int soma(int n) {
        return soma(n,Integer.toString(n).length() - 1);
    }
    
    /**
     * Metodo que serve para testar o metodo soma(int n)
     * @param args 
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Introduza o numero :");
        
        System.out.println("O valor da soma e :" + soma(e.nextInt()));
    }
}
