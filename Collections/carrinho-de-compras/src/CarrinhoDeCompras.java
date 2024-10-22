import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.itens.add(new Item(nome, preco, quantidade));
    }

    public String removeItem(String nome) {

        int index = 0;

        if (this.itens.isEmpty()) {
            return "O carrinho está vazio.";
        } else {
            for (Item item : this.itens) {
                if (item.getNome().equals(nome)) {
                    index = this.itens.indexOf(item);
                }
            }
            this.itens.remove(index);
            return "Item: " + nome + ", removido com sucesso!\n";
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public String exibirItens() {
        String itensAExibir = "Itens no carrinho: \n";
        for (Item item : itens) {
            itensAExibir += item.toString() + "\n";
        }
        return itensAExibir;
    }
}
