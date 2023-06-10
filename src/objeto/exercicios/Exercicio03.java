package objeto.exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int somaPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println("Soma dos números pares: " + somaPares);
    }
}
