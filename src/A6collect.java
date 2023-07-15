import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A6collect {
    public static void main(String[] args) {
// exemplos a seguir nao foi realizado no curso necessario revisar as aulas 
        System.out.println("toList\n");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println(squaredNumbers);

        System.out.println("filter\n");

        List<Integer> numbersFilter = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbersFilter.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

        System.out.println("map(Function<? super T, ? extends R> var1)");

        List<Integer> numbersMap = Arrays.asList(1, 2, 3, 4, 5);
        List<String> numberStrings = numbersMap.stream()
                .map(num -> "Number " + num)
                .collect(Collectors.toList());

        System.out.println(numberStrings);

        List<String> words = Arrays.asList("apple", "banana", "cherry");
        int[] wordLengths = words.stream()
                .mapToInt(String::length)
                .toArray();

        System.out.println(Arrays.toString(wordLengths));
    }
}
