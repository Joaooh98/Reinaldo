
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class A5reduce {
    public static void main(String[] args) {
        String s = "Joao Carlos Progamador BackEnd Java Treine";
        String[] split = s.split(" ");
        List<String> listStr = Arrays.asList(split);
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        lista.stream()
                .forEach(System.out::println);

        Optional<Integer> reduce = lista.stream() // função de acumulação "soma"
                .reduce((n1, n2) -> n1 + n2); // formula do calculo que esta sendo realizado: 1 + 2 = 3 + 3 = 6 + 4 = 10
                                              // + 5 = 15 + 6 = 21 + 7 = 28 + 8 = 36 + 9 = 45
        System.out.println(reduce.get());

        Optional<Integer> multiplica = lista.stream()// função de Multiplicação
                .reduce((n1, n2) -> n1 * n2);
        System.out.println(multiplica.get());

        Optional<String> concate = listStr.stream()
                .reduce((s1, s2) -> s1.concat(s2));
        System.out.println(concate);

    }
}
