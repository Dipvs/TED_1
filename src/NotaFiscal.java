public class NotaFiscal {
    private Cliente cliente;
    private Produto produto1, produto2, produto3;

    public void adicionaCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionaProduto1(Produto produto) {
        this.produto1 = produto;
    }

    public void adicionaProduto2(Produto produto) {
        this.produto2 = produto;
    }

    public void adicionaProduto3(Produto produto) {
        this.produto3 = produto;
    }

    public void exibirNotaFiscal() {
        System.out.println("---- Nota Fiscal ----");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println();

        double totalNota = 0;

        if (produto1 != null) {
            totalNota += exibirDetalhesProduto(produto1);
        }
        if (produto2 != null) {
            totalNota += exibirDetalhesProduto(produto2);
        }
        if (produto3 != null) {
            totalNota += exibirDetalhesProduto(produto3);
        }

        System.out.println("----------------------");
        System.out.printf("Total da Nota Fiscal: R$ %.2f%n", totalNota);
    }

    private double exibirDetalhesProduto(Produto produto) {
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Categoria: " + produto.getCategoria());
        System.out.printf("Preço Base: R$ %.2f%n", produto.calcularTotal());
        System.out.printf("Imposto: R$ %.2f%n", produto.calcularImposto());
        System.out.printf("Juros: R$ %.2f%n", produto.calcularJuros());
        System.out.printf("Lucro: R$ %.2f%n", produto.calcularLucro());
        System.out.printf("Desconto: R$ %.2f%n", produto.calcularDesconto());
        System.out.printf("Taxa de Manuseio: R$ %.2f%n", produto.calcularTaxaManuseio());
        System.out.printf("Preço Final: R$ %.2f%n", produto.calcularPrecoFinal());
        System.out.println();
        return produto.calcularTotal();
    }
}
