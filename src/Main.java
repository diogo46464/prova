import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {

            K = K + 1;
            SOMA = SOMA + 1;
        }
        System.out.println("Resultado:" + SOMA);
    }
}
