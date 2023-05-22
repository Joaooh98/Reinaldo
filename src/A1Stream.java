import java.util.Arrays;
import java.util.List;

public class A1Stream {
    public static void main(String[] args) {
          // tipo   referenceArrays  
        List<Integer> asList = Arrays.asList(1,2,3,4);
        
        System.out.println("\ntodos os numeros do Arrays com for");
            //tipo  reference  OndePega   
        for (Integer integer : asList) {
            System.out.println(integer);
        }

        // stream - Fluxo de dados 
        
        System.out.println("\ntodos os numeros do Arrays com stream()");
        asList.stream()
              .forEach(e-> System.out.println(e));

        System.out.println("\nnumeros pares com stream()");
        asList.stream()
            .filter(e -> e % 2 ==0)
            .forEach(e-> System.out.println(e));
    }
}
