import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EliminarPorVocal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce palabras: ");
        String entrada = sc.nextLine();


        List<String> palabras = new ArrayList<>(Arrays.asList(entrada.split("\\s+")));


        System.out.print("Introduce la vocal para filtrar las palabras (separalas con espacios):  ");
        String vocal = sc.nextLine().toLowerCase();


        // con removeIf se elimina segun lo que pidamos
        palabras.removeIf(p -> p.toLowerCase().contains(vocal));

        System.out.println("ista filtrada (sin palabras que contienen '" + vocal + "'):");
        if (palabras.isEmpty()) {
            System.out.println("No quedó ninguna palabra en la lista.");
        } else {
            System.out.println(palabras);
        }

        sc.close();
    }
}
