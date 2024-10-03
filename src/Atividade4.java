import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votos = 0;
        int votosTaffismoClub = 0;
        int votosPatinhoBranquinho = 0;
        int votosLucasFC = 0;
        int votosSportRedesFC = 0;

        System.out.println("Quantas pessoas irão votar?");
        int qtdePessoas = sc.nextInt();

        for (int i = 0; i < qtdePessoas; i++) {

            int opcao = 0;

            do {
                System.out.println("Lista de Times");
                System.out.println("1 - Taffismo Club");
                System.out.println("2 - Patinho Branquinho");
                System.out.println("3 - Lucas FC");
                System.out.println("4 - Sport Redes FC");
                opcao = sc.nextInt();

             }while (opcao != 1 && opcao !=2 && opcao !=3 && opcao !=4);

            if (opcao == 1){
                votosTaffismoClub++;
            } else if (opcao == 2){
                votosPatinhoBranquinho++;
            } else if (opcao == 3){
                votosLucasFC++;
            } else {
                votosSportRedesFC++;
            }
        }

        if (votosTaffismoClub > votosPatinhoBranquinho && votosTaffismoClub > votosLucasFC && votosTaffismoClub > votosSportRedesFC) {
            System.out.println("Time Taffismo Club Ganhou!");
        }
        if (votosPatinhoBranquinho > votosTaffismoClub && votosPatinhoBranquinho > votosLucasFC && votosPatinhoBranquinho> votosSportRedesFC) {
            System.out.println("Time PatinhoBranquinho Ganhou!");
        }
        if (votosLucasFC > votosPatinhoBranquinho && votosLucasFC > votosTaffismoClub && votosLucasFC > votosSportRedesFC) {
            System.out.println("Time LucasFC Ganhou!");
        }
        if (votosSportRedesFC > votosPatinhoBranquinho && votosSportRedesFC > votosLucasFC && votosSportRedesFC > votosTaffismoClub){
            System.out.println("Time Sport Redes FC Ganhou!");
        }
    }
}