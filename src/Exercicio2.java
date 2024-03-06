import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos");
        int termos = x.nextInt();
        int n1 = 0, n2 = 1;
        boolean numeroEncontrado = false;

        for (int i = 0; i < termos; i++) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            if (termos == n3) {
                System.out.println("Número encontrado na sequência");
                numeroEncontrado = true;
                break;
            }
        }

        if (!numeroEncontrado) {
            System.out.println("Número não encontrado na sequência");
        }

        System.out.println("Fim");
        x.close();
    }
}

