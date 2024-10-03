import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota = 0;

        System.out.println("Digite sua nota de avaliação: ");

        nota = sc.nextDouble();
        if (nota >=6 && nota <=10) {
            System.out.println("Nota Boa");
        } else if (nota <6) {
            System.out.println("Nota Ruim");
        } else if (nota >10 ) {
            System.out.println("Insira uma nota válida");
        }
    }
}