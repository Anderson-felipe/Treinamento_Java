import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String[] placar = new String[6];
        int quantidadeParticipantes, placarV = 0, placarP = 0, grupo1 = 0, grupo2 = 0, grupo3 = 0;

        System.out.println("Digite abaixo quantos participantes estão nesse Torneio de Xadrex.");
        quantidadeParticipantes = sc.nextInt();

        for (int a = 1; a <= quantidadeParticipantes; a++) {

            for (int i = 0; i < 6; i++) {
                System.out.println("Digite abaixo 'V' para VITÓRIA ou 'P' para PERDA do jogador.");
                placar[i] = sc2.next();

                if (placar[i].equalsIgnoreCase("V")) {
                    placarV++;
                } else {
                    placarP++;
                }
            }

            if (placarV == 5 || placarV == 6) {
                grupo1++;
                System.out.println("O participante será alocado no GRUPO 1!!!");
            }

            if (placarV == 3 || placarV == 4) {
                grupo2++;
                System.out.println("O participante será alocado no GRUPO 2!!!");
            }

            if (placarV == 1 || placarV == 2) {
                grupo3++;
                System.out.println("O participante será alocado no GRUPO 3!!!");
            }

            if (placarV == 0) {
                System.out.println("O participante não será alocado em nenhum grupo, pois não ganhou nenhuma rodada.");
            }

        }

        System.out.println("Foram alocados " + grupo1 + " participantes no Grupo 1.");
        System.out.println("Foram alocados " + grupo2 + " participantes no Grupo 2.");
        System.out.println("Foram alocados " + grupo3 + " participantes no Grupo 3.");

    }
}