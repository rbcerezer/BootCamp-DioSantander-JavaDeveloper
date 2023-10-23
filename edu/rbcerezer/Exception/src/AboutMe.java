import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
        //criando o scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu NOME: ");
        String nome = scanner.next();

        System.out.println("Digite o seu SOBRENOME: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua IDADE: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua ALTURA: ");
            double altura = scanner.nextDouble();

            //imprimindo os dados coletados
            System.out.println("Olá pessoal! Eu sou: " + nome + " " + sobrenome);
            System.out.println("Tenho apenas " + idade + " anos ");
            System.out.println("E minha altura é: " + altura + " cm ");
            scanner.close();
        }
        catch (InputMismatchException e){
            System.out.println("Os campos IDADE e ALTURA precisam ser numéricos");
        }
    }
        
}

