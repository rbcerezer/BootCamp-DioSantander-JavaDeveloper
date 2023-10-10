package edu.rbcerezer.terminalArgs;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        //imprimindo os dados coletados
        System.out.println("Olá pessoal! Eu sou: " + nome + " " + sobrenome);
        System.out.println("Tenho apenas " + idade + " anos ");
        System.out.println("E minha altura é: " + altura);
    }
    
}
