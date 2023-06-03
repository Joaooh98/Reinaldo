import java.util.Optional;

public class A4Optional {
    public static void main(String[] args) {
        
        // String s = "joao";
        String s = "1";
    
        
        // Optional<Integer> numero = converteEmNumero(s);
       
        // System.out.println(numero);
        // System.out.println(numero.isPresent());
        // System.out.println(numero.get());
        // numero.ifPresent(arg0 -> System.out.println(arg0));

        Integer numero = converteEmNumero(s).orElse(0);
        System.out.println(numero+"nao foi encontrado valor ");

        converteEmNumero(s)
                .ifPresent(e -> System.out.println(e));
    }
    public static Optional<Integer> converteEmNumero(String numeString) {
        try {
            Integer integer =  Integer.valueOf(numeString);
            return Optional.of(integer);   
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}
