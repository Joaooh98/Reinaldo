import java.util.Arrays;
import java.util.List;

/* https://www.youtube.com/watch?v=bTlS_BdS41w&t=80s&ab_channel=RinaldoDev
 * Operaçoes Intermediaria
 *
 *  Skip = pula ou ignora a quantidade de caracter informada no parametro dados, se classifica como operação intermediaria pode ser utilizado mais de uma vez em uma stream
 *  Limit = funciona de forma semelhante ao skip de so que de forma aou contrario vc ira passar no parametro somente ate o elemento que deseja executar. 
 *  Distinct = não perminte que a stream processe elemetos repetidos não e necessario repassar nada no paramentro, ele utiliza a comparação do equals e hashcode
 *  Filter = todos chega ate o metodo filter que aplicado em cada elemento caso passarem chega ate o foreach se nao e discartado  
 *  Map =  serve para realizar uma transformação de dados realiza a alteração no elemento porem a lista original nao e modificada 
 * 
 *  Filtros primeiros
 * 
 * 
 */
public class Stream02 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 4, 5, 2, 6, 7, 9);
        System.out.println("\n com For");
        for (Integer integer : lista) {
            System.out.println(integer);
        }
        System.out.println("\n com stream");

        lista.stream().forEach(e -> System.out.println(e));

        System.out.println("\n com stream usando o .skip");
        lista.stream()
                .skip(2)
                .forEach(e -> System.out.println(e));

        System.out.println("\n com stream usando o .limit");
        lista.stream()
                .limit(2)
                .forEach(e -> System.out.println(e));

        System.out.println("\n com stream usando o .distinct");
        lista.stream()
                .distinct()
                .forEach(e -> System.out.println(e));

        System.out.println("\n com stream usando o .skip.limit.distinct");
        lista.stream() /// (1, 2, 3, 4, 4, 5, 2, 6, 7, 9) elemento
                .skip(2) // somente depois do 2 elemento
                .limit(4) // imprime ate a 4 elemento
                .distinct() // nao repeti o numero
                .forEach(e -> System.out.println(e)); // retona 3, 4, 5

        System.out.println("\n com stream usando o .filter");
        lista.stream()
                .filter(e -> e % 2 == 0) // executa e se o elemento passar chegara ate o for se nao e discartado
                .forEach(e -> System.out.println(e));

        System.out.println("\n com stream usando o map");
        lista.stream()
                .map(e -> e * 2) // realiza a alteração porem a lista original nao e modificada
                .forEach(e -> System.out.println(e));

        System.out.println(lista);

        System.out.println("\n com stream usando o .skip.limit.distinct. map");
        lista.stream() /// (1, 2, 3, 4, 4, 5, 2, 6, 7, 9) elemento
                .skip(2) // somente depois do 2 elemento
                .limit(4) // imprime ate a 4 elemento
                .map(e -> e * 2) // pega os elemetos e multiplica por 2 
                .distinct() // nao repeti os numeros
                .forEach(e -> System.out.println(e)); // retona 6, 8, 10
        
                System.out.println(lista);
    }
}
