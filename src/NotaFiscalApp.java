import java.util.Scanner;

public class NotaFiscalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inserindo dados do cliente
        System.out.println("---- Cadastro de Cliente ----");
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o endereço do cliente: ");
        String enderecoCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente, enderecoCliente);

        // Criando a nota fiscal e adicionando o cliente
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.adicionaCliente(cliente);

        // Inserindo produtos
        for (int i = 1; i <= 3; i++) {
            System.out.printf("---- Cadastro do Produto %d ----%n", i);
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = scanner.nextLine();
            System.out.print("Digite o preço base do produto: ");
            double precoBase = scanner.nextDouble();
            scanner.nextLine();  // Limpar o buffer de nova linha

            System.out.println("Selecione a categoria do produto:");
            System.out.println("1 - ELETRONICO");
            System.out.println("2 - ALIMENTO");
            System.out.println("3 - PAPELARIA");
            System.out.print("Escolha a categoria (1, 2 ou 3): ");
            int categoriaEscolha = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer de nova linha

            CategoriaProduto categoria;
            switch (categoriaEscolha) {
                case 1 -> categoria = CategoriaProduto.ELETRONICO;
                case 2 -> categoria = CategoriaProduto.ALIMENTO;
                case 3 -> categoria = CategoriaProduto.PAPELARIA;
                default -> {
                    System.out.println("Categoria inválida. Usando PAPELARIA como padrão.");
                    categoria = CategoriaProduto.PAPELARIA;
                }
            }

            Produto produto = new Produto(nomeProduto, precoBase, categoria);

            // Adicionando o produto à nota fiscal
            switch (i) {
                case 1 -> notaFiscal.adicionaProduto1(produto);
                case 2 -> notaFiscal.adicionaProduto2(produto);
                case 3 -> notaFiscal.adicionaProduto3(produto);
            }
        }

        // Exibindo a nota fiscal com os dados inseridos
        notaFiscal.exibirNotaFiscal();
        scanner.close();
    }
}