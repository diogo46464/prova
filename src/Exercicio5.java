
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String original = scanner.nextLine();

        System.out.println("String original: " + original);

        String invertida = "";
        StringBuilder inverterString = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) {
            inverterString.append(original.charAt(i));
        }
        invertida= inverterString.toString();

        System.out.println("String invertida: " + invertida);

        scanner.close();
    }
}
