import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeClientes {
    private final List<Cliente> clientes;

    public GerenciadorDeClientes() {
        clientes = new ArrayList<>();
    }
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
    public void listarClientes() {
        clientes.forEach((e) -> System.out.println(e.getNome()));
    }
}
