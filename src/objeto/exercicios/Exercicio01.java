package objeto.exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio01 {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Olá", "Mundo", "Isso", "é", "um", "exemplo", "de", "lista");

        long count = palavras.stream()
                .filter(palavra -> palavra.length() > 5)
                .count();
                
        System.out.println("Número de palavras com mais de cinco letras: " + count);
    }
}
