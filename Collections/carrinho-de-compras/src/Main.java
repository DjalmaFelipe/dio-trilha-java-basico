public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Tenis", 200.00, 1);
        carrinho.adicionarItem("Calca", 120.00, 2);
        carrinho.adicionarItem("Camisa", 50.00, 6);

        System.out.println(carrinho.exibirItens());

        System.out.println(carrinho.removeItem("Tenis"));

        System.out.println(carrinho.exibirItens());

        System.out.println("Valor Total: " + carrinho.calcularValorTotal());
    }
}
