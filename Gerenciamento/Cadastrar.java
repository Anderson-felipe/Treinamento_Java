package Gerenciamento;

import java.util.Scanner;

public class Cadastrar {

    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);

    int i;
    String nome;
    String email;
    String senha;
    int quantidade;

    public Cadastrar() {

        System.out.println("Digite seu nome completo: ");
        nome = scan2.nextLine();
        System.out.println("Digite seu e-mail:");
        email = scan2.nextLine();
        System.out.println("Digite a senha do seu email: ");
        senha = scan2.nextLine();

    }

}
