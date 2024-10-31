public class Produto implements Calculavel {
    private String nome;
    private double precoBase;
    private CategoriaProduto categoria;

    public Produto(String nome, double precoBase, CategoriaProduto categoria) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    // Implementação dos métodos da interface Calculavel
    @Override
    public double calcularImposto() {
        return precoBase * 0.1;  // Exemplo: 10% de imposto
    }

    @Override
    public double calcularJuros() {
        return precoBase * 0.02;  // Exemplo: 2% de juros
    }

    @Override
    public double calcularLucro() {
        return precoBase * 0.3;  // Exemplo: 30% de lucro
    }

    @Override
    public double calcularDesconto() {
        return precoBase * 0.05;  // Exemplo: 5% de desconto
    }

    @Override
    public double calcularTaxaManuseio() {
        return precoBase * 0.01;  // Exemplo: 1% de taxa de manuseio
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + calcularImposto() + calcularJuros() + calcularLucro() + calcularTaxaManuseio() - calcularDesconto();
    }

    @Override
    public double calcularTotal() {
        return calcularPrecoFinal();
    }
}