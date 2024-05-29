public class Pedido {
    private String nomeProduto;
    private double valorPedido;
    private int quantidadeItens;

    public Pedido(String nomeProduto, double valorPedido, int quantidadeItens) {
        this.nomeProduto = nomeProduto;
        this.valorPedido = valorPedido;
        this.quantidadeItens = quantidadeItens;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", valorPedido=" + valorPedido +
                ", quantidadeItens=" + quantidadeItens +
                '}';
    }
}
