import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){ 
        // Criação de um objeto para receber os dados do usuário. 
        Scanner scanner = new Scanner(System.in);
    
        //Solicitando ao usuário os dados da conta.
        System.out.println("Qual o número da sua agência?");

        String agencia = scanner.nextLine(); //Captura a agência como texto

        //Solicitando número da conta.
        System.out.println("Qual o número da sua conta?");

        Integer conta = scanner.nextInt(); //Recebe número da conta como inteiro

        scanner.nextLine(); //Limpa o buffer
        
        //Solicitando nome do Cliente.
        System.out.println("Qual o nome do cliente?");

        String nomeCliente = scanner.nextLine(); //Recebe o nome do cliente

        //Solicitando o saldo do cliente.
        System.out.println("Qual o saldo do cliente?");

        Double saldoCliente = scanner.nextDouble(); //Recebe o saldo da conta do cliente

        //Exibindo mensagem final para o usuário.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldoCliente + " já está disponível para saque.");

        scanner.close();
    }
}
