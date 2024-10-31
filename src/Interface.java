interface Calculavel {
    double calcularImposto();
    double calcularJuros();
    double calcularLucro();
    double calcularDesconto();
    double calcularTaxaManuseio();
    double calcularPrecoFinal();
    double calcularTotal();
}

// Enum para categorias de produto
enum CategoriaProduto {
    ELETRONICO, ALIMENTO, PAPELARIA;
}
