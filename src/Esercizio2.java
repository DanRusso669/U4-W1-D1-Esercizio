import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        threeStrings();
    }

    public static void threeStrings () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola o una frase: ");
        String str1 = scanner.nextLine();
        System.out.println("Inserisci un'altra parola o frase: ");
        String str2 = scanner.nextLine();
        System.out.println("Inserisci un'ultima parola o frase: ");
        String str3 = scanner.nextLine();

        System.out.println("Ordine corretto: " + str1 + str2 + str3);
        System.out.println("Ordine inverso: " + str3 + str2 + str1);

    }
}
