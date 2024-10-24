import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numero = input.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = input.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = input.next();

        System.out.println("Digite o saldo da conta: ");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}