
public class Main {

	public static void main(String[] args) {
		GerenciadorDeClientes gerenciador = new GerenciadorDeClientes();
		Cliente venilton = new Cliente("Venilton");
		Cliente lucas = new Cliente("Lucas");

		gerenciador.adicionarCliente(venilton);
		gerenciador.adicionarCliente(lucas);

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca1 = new ContaPoupanca(venilton);

		Conta poupanca2 = new ContaPoupanca(lucas);

		poupanca2.depositar(200);

		cc.depositar(100);
		cc.transferir(100, poupanca1);
		
		cc.imprimirExtrato();
		poupanca1.imprimirExtrato();
		System.out.println("=== Lista De Clientes ===");
		gerenciador.listarClientes();

	}

}
