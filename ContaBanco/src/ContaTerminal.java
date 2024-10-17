/*
    desenvolvedor: Djalma Felipe
    data: 17-10-2024

    OBS: código implementado sem seguir padrões de projeto e
    orientação a objetos para seguir a cronologia didática do bootcamp
*/

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String nomeCliente;
        String agencia;
        int numero;
        double saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = entrada.nextLine();
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = entrada.nextLine();
        System.out.print("Por favor, digite o número da conta: ");
        numero = Integer.parseInt(entrada.nextLine());
        System.out.print("Por favor, digite o valor do saldo: ");
        saldo = Double.parseDouble(entrada.nextLine());

        entrada.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + String.format("%.2f", saldo) + " R$ já está disponível para saque.");
    }
}