import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String servico = scanner.nextLine().trim();
        String entradaCliente = scanner.nextLine().trim();

        String[] partes = entradaCliente.split(",");
        boolean contratado;

        contratado = verificaSeOArrayContemOServico(partes, servico);

        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

        scanner.close();

    }

    static boolean verificaSeOArrayContemOServico(String[] servicos, String servico) {
        for (int i = 1; i < servicos.length; i++) {
            if (servicos[i].equals(servico)) {
                return true;
            }
        }
        return false;
    }
}