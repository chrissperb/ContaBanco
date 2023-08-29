import java.util.Scanner;

public class ContaTerminal {
    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);

        // Cria o microambiente de trabalho no terminal
        System.out.println("***************************************************");
        System.out.println("           Bem vindo ao DIO Home Banking           ");
        System.out.println("***************************************************");
        System.out.println(" ");
        System.out.println("Este é o sistema de cadastramento de novos clientes.");
        System.out.println(" ");

        // Captura o nome do cliente
        System.out.print("Digite o seu nome completo: ");
            String nome = "MARIO ANDRADE";
            System.out.println(nome);

        // Captura o valor do depósito inicial
        System.out.print("Qual o valor do depósito inicial? ");
            Double saldo = 237.48;
            System.out.println(saldo);

        // Criação da conta com agência e número
        String agencia = "067-8";
        int conta = 1021;

        exibirInformacoesConta(nome, agencia, conta, saldo);
    }        
    // TODO: verificar boas práticas utilizadas pela equipe dev Santander
    // Método para exibir informações da conta
    public static void exibirInformacoesConta(String nome, String agencia, int conta, double saldo) {
        System.out.println(" ");
        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta nº " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
