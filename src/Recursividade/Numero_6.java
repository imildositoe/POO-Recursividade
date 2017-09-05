package Recursividade;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Imildo Sitoe
 */
public class Numero_6 {

    /**
     * Metodo que serve para mostrar todos os arquivos de um dado directorio
     *
     * @param caminho 
     */
    private static void directorio(Path caminho) {
        if (Files.isRegularFile(caminho)) {
            System.out.println(caminho.toAbsolutePath().toString());
        } else {
            try (DirectoryStream<Path> s = Files.newDirectoryStream(caminho)) {
                for (Path path : s) {
                    directorio(path);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Metodo que serve para testar o metodo directorio(int n)
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Introduza um caminho :");   // D:\Musicas
        Path caminho = Paths.get(e.next());

        directorio(caminho);
    }
}
