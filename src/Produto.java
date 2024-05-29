public class Produto {
    private String nomeProduto;

    public Produto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                '}';
    }
}
