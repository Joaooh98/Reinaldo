package objeto.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio02 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Stream", "Exemplo", "Desafio");

        List<Integer> comprimentos = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("Comprimentos das strings: " + comprimentos);
    }
}
