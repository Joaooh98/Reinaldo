package objeto.exercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercicio04 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream", "Exemplo", "Desafio");

        Optional<String> maiorString = strings.stream()
                .max(Comparator.comparingInt(String::length));

        if (maiorString.isPresent()) {
            System.out.println("Maior string: " + maiorString.get());
        } else {
            System.out.println("A lista está vazia.");
        }
    }
}
