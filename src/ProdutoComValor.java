public class ProdutoComValor {
    private String nomeProduto;
    private double valorUnitario;

    public ProdutoComValor(String nomeProduto, double valorUnitario) {
        this.nomeProduto = nomeProduto;
        this.valorUnitario = valorUnitario;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    @Override
    public String toString() {
        return "ProdutoComValor{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
