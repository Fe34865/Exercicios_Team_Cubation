import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido("Produto A", 1500.0, 15));
        pedidos.add(new Pedido("Produto B", 500.0, 5));
        pedidos.add(new Pedido("Produto C", 1200.0, 20));
        pedidos.add(new Pedido("Produto D", 200.0, 8));

        // a) todos os pedidos com valores acima de 1000 reais
        List<Pedido> pedidosAcimaDe1000 = pedidos.stream()
                .filter(p -> p.getValorPedido() > 1000)
                .collect(Collectors.toList());
        pedidosAcimaDe1000.forEach(System.out::println);

        // b) todas os pedidos com quantidade acima de 10 itens
        List<Pedido> pedidosAcimaDe10Itens = pedidos.stream()
                .filter(p -> p.getQuantidadeItens() > 10)
                .collect(Collectors.toList());
        pedidosAcimaDe10Itens.forEach(System.out::println);

        // c) todas os pedidos com valores acima de 1000 reais E acima de 10 itens
        List<Pedido> pedidosAcimaDe1000E10Itens = pedidos.stream()
                .filter(p -> p.getValorPedido() > 1000 && p.getQuantidadeItens() > 10)
                .collect(Collectors.toList());
        pedidosAcimaDe1000E10Itens.forEach(System.out::println);

        // Transformar pedidos em produtos
        List<Produto> produtos = pedidos.stream()
                .map(p -> new Produto(p.getNomeProduto()))
                .collect(Collectors.toList());
        produtos.forEach(System.out::println);

        // Produtos com valor unitário
        List<ProdutoComValor> produtosComValor = new ArrayList<>();
        produtosComValor.add(new ProdutoComValor("Produto A", 150.0));
        produtosComValor.add(new ProdutoComValor("Produto B", 50.0));
        produtosComValor.add(new ProdutoComValor("Produto C", 120.0));
        produtosComValor.add(new ProdutoComValor("Produto D", 20.0));

        // Converter o valor de reais para dólares
        List<ProdutoComValor> produtosEmDolares = produtosComValor.stream()
                .map(p -> new ProdutoComValor(p.getNomeProduto(), p.getValorUnitario() / 5.0))
                .collect(Collectors.toList());
        produtosEmDolares.forEach(System.out::println);

        // Ordenar por nome crescente
        List<ProdutoComValor> produtosOrdenadosCrescente = produtosComValor.stream()
                .sorted((p1, p2) -> p1.getNomeProduto().compareTo(p2.getNomeProduto()))
                .collect(Collectors.toList());
        produtosOrdenadosCrescente.forEach(System.out::println);

        // Ordenar por nome decrescente
        List<ProdutoComValor> produtosOrdenadosDecrescente = produtosComValor.stream()
                .sorted((p1, p2) -> p2.getNomeProduto().compareTo(p1.getNomeProduto()))
                .collect(Collectors.toList());
        produtosOrdenadosDecrescente.forEach(System.out::println);
    }
}