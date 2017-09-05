package Recursividade;

import java.util.Scanner;

/**
 *
 * @author Imildo Sitoe
 */
public class Numero_4 {

    /**
     * Metodo que verifica as ocorrencias da chave introduzida no numero
     * introduzido
     *
     * @param n
     * @param i
     * @param chave
     */
    private static int ocorrencia(int n, int chave, int i, int k) {
        String numero = Integer.toString(n);
        if (i < 0) {
            return k;
        } else if (chave == Integer.parseInt(Character.toString(numero.charAt(i)))) {
            ++k;
            return ocorrencia(n, chave, i - 1, k);
        } else {
            return ocorrencia(n, chave, i - 1, k);
        }
    }

    /**
     * Metodo que serve para fixar o tamanho dos caracteres do numero
     * introduzido e fixar o inicio do k, i.e(k=0)
     *
     * @param n
     * @param chave
     */
    private static int ocorrencia(int n, int chave) {
        return ocorrencia(n, chave, Integer.toString(n).length() - 1, 0);
    }

    /**
     * Metodo que serve para testar o metodo ocorrencia(int n,int chave)
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Introduza o numero :");
        int numero = e.nextInt();
        System.out.print("Introduza a chave :");
        int chave = e.nextInt();
        System.out.println("O valor das ocorrencias e :" + ocorrencia(numero, chave));
    }
}
