import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

      

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Seja bem vindo ao sistema do Banco X, é um prazer em ter você conosco. Agora vamos confirmar alguns dados?");

        System.out.println("Por favor, digite o seu NOME: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu SOBRENOME: ");
        String sobrenomeCliente = scanner.next();
        

        System.out.println("Por favor, digite a sua CONTA: ");
        int numeroConta = scanner.nextInt();
        

        System.out.println("Por favor, digite a sua AGÊNCIA: ");
        String agencia = scanner.next();
        

        System.out.println("Por favor, digite o seu SALDO: ");
        double saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("O Banxo X agradece as confirmações de dados!");
        System.out.println("Olá " + nomeCliente.concat(" ").concat(sobrenomeCliente).concat(" ! Agradecemos por criar uma conta em nosso banco."));
        System.out.println("Sua conta é: " + numeroConta);
        System.out.println("Sua agência é: ".concat(agencia));
        System.out.println("Seu saldo atual é de: " + saldo + " , já disponível para saque!");
        System.out.println("Agora é só aproveitar! Até a próxima.");






    }
}
