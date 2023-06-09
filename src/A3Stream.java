import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Operadores Finais
 *  Count: verifica a quantidade de elementos que estão na lista.
 *  min e max:pega o menor ou o menor valor que esta na stream, para isso e necessário passar um comparador como parâmetro  
 *  Collet toList: Serve para armazenar os valores percorridos na stream 
 *  Collet GroupingBy: Cria um mapa para algum critério especifico
 *  Collect joining: trabalha somente com strings, é útil quando você deseja obter uma representação concatenada dos elementos da stream
 *  
 */
public class A3Stream {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 2, 3, 4, 8, 6, 7);
        List<String> nomes = Arrays.asList("Diogo", "alex", "fernando", "eloi");

        System.out.println("\n cont");
        long count = lista.stream()
                .filter(e -> e % 2 == 0) // colocando o filtro o count so ira adicionar ao stream os numeros pares da
                                         // lista
                .count();
        System.out.println(count);

        System.out.println("\n min");

        Optional<Integer> min = lista.stream()
                .filter(e -> e % 2 == 0)
                .min(Comparator.naturalOrder()); // deve-se avaliar qual o parametro que vc quer utilizar para comparar
        System.out.println(min.get());

        Optional<Integer> max = lista.stream()
                .filter(e -> e % 2 == 0) // com esse filtro vai adiconar os numero parares para a stream realizar a
                                         // compração de qual o mair valor do stream
                .max(Comparator.naturalOrder()); // deve-se avaliar qual o parametro que vc quer utilizar para comparar
        System.out.println(max.get());

        List<Integer> novaLista = lista.stream() // novaLista serve como variavel de referencia para o collectors.toList
                                                 // armazenar os valores do stream
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(novaLista);

        Map<Boolean, List<Integer>> mapa = lista.stream() // criado um map de chave boolean que recebe como valor
                                                          // numeros paras como true e false valor impar
                .map(e -> e * 3)
                .collect(Collectors.groupingBy(e -> e % 2 == 0));

        System.out.println(mapa);

        Map<Integer, List<Integer>> mapaR = lista.stream() // dessa forma e agurapdo no mapa os numero conforme o
                                                           // resultado do resto da dvisão
                .collect(Collectors.groupingBy(e -> e % 3));

        System.out.println(mapaR);

        String collect = lista.stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining(", "));

                System.out.println(collect); // retorna uma String 

        String resultado = nomes.stream()
                .map(nome -> nome.substring(0, 1)) // Pega o primeiro caractere de cada nome
                .map(String::toUpperCase) // Converte para maiúsculas
                .collect(Collectors.joining()); // Concatena tudo em uma única string

        System.out.println(resultado);


        // stream = loops implicitos 
        // for - while - do while = loops explicitos  

        
    }
}
