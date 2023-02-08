package Gerenciamento;

import java.util.Scanner;

public class Menu {

    public Menu() {

        Scanner scan = new Scanner(System.in);

        int quantidade;
        int decisao;
        int cont = 0;
        int i;

        System.out.println("Quantos usuarios o programa suporta?");
        int n = scan.nextInt();
        Usuario usuarios[] = new Usuario[n];

        do {

            System.out.println("\n\n----------------MENU----------------\n");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários cadastrados");
            System.out.println("3 - Atualizar um dado do usuário");
            System.out.println("4 - Atualizar usuário");
            System.out.println("5 - Login");
            System.out.println("6 - Sair");
            System.out.println("Apartir do menu exibido acima, digite uma opção com relação aos números!");
            decisao = scan.nextInt();
            System.out.println("......................................................\n");

            switch (decisao) {

                case 1:
                    // CADASTRAR USUÁRIO

                    System.out.println("Quantos usuarios você deseja cadastrar?");
                    quantidade = scan.nextInt();

                    for (i = 0; i < quantidade; i++) {

                        Cadastrar cadastrar = new Cadastrar();
                        Usuario usuario = new Usuario(cadastrar.nome, cadastrar.email, cadastrar.senha);

                        for (int x = 0; x < usuarios.length; x++) {

                            if (usuarios[x] == null) {

                                usuarios[x] = usuario;

                                break;

                            } else if (x == usuarios.length - 1) {

                                System.out.println("O programa já atingiu o número máximo de usuário!");

                            }

                        }

                    }

                    break;

                case 2:
                    // LISTAGEM DOS USUÁRIOS CADASTRADOS

                    for (int m = 0; m < usuarios.length; m++) {
                        if (usuarios[m] == null) {
                            cont++;
                        }

                        if (usuarios[m] != null) {
                            System.out.println("" + usuarios[m].nome);
                        }

                        if (usuarios[m] != null) {
                            System.out.println("" + usuarios[m].email);
                        }

                    }

                    if (cont == usuarios.length) {
                        System.out.println("\nNão há usuários cadastrados!!!\n");
                    }

                    break;

                case 3:
                    // ATUALIZAR UM DADO DO USUÁRIO

                    break;

                case 4:
                    // ATUALIZAR USUÁRIO

                    break;

                case 5:
                    // LOGIN

                    break;

                case 6:
                    // SAIR DO PROGRAMA

                    System.out.println("-------------------SAINDO DO PROGRAMA-------------------");

                    break;

                default:
                    // INVALIDAÇÃO OCORRIDA

                    System.out.println("-------------------OPÇÃO INVÁLIDA-------------------");

                    break;

            }

        } while (decisao != 6);

    }

}