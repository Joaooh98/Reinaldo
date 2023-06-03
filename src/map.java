import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import objeto.Produto;

public class map {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Camiseta", "Vestuário"),
                new Produto("Calça", "Vestuário"),
                new Produto("Celular", "Eletrônicos"),
                new Produto("Televisor", "Eletrônicos"),
                new Produto("Livro", "Livros"));

        Map<String, List<Produto>> produtosPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));

        System.out.println("Produtos por categoria: " + produtosPorCategoria);
    }
}
