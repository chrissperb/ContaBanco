import java.util.Scanner;

public class ContaTerminal {
    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("***************************************************");
        System.out.println("           Bem vindo ao DIO Home Banking           ");
        System.out.println("***************************************************");
        System.out.println(" ");
        System.out.println("Este é o sistema de cadastramento de novos clientes.");
        System.out.println(" ");

        System.out.print("Digite o seu nome completo: ");
            String nome = "MARIO ANDRADE";
            System.out.println(nome);

        System.out.print("Qual o valor do depósito inicial? ");
            Double saldo = 237.48;
            System.out.println(saldo);

        String agencia = "067-8";
        int conta = 1021;

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta nº " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
