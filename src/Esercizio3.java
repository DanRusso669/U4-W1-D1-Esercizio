import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcoliamo il perimetro del rettangolo. Inserisci la base: ");
        int base = Integer.parseInt(scanner.nextLine());
        System.out.println("Molto bene. Ora inserisci l'altezza: ");
        int altezza = Integer.parseInt(scanner.nextLine());
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo(base, altezza));

        System.out.println("Inserisci un numero. Se il risultato è 0 allora è pari, altrimenti è dispari:  ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Il risultato è: " + pariDispari(numero));

        System.out.println("Calcoliamo il perimetro del triangolo. Inserisci il primo a lato: ");
        double lato1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Molto bene. Inserisci il secondo lato: ");
        double lato2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Infine inserisci l'ultimo lato:  ");
        double lato3 = Double.parseDouble(scanner.nextLine());
        System.out.println("Il perimetro del triangolo è uguale a: " + perimetroTriangolo(lato1, lato2, lato3));

    }

    public static int perimetroRettangolo (int base, int altezza) {
        return 2 * (base + altezza);
    }

    public static int pariDispari (int num){
        if (num%2 == 0){
            return 0;
        } else {
            return 1;
        }
    }

    public static int perimetroTriangolo(double num1, double num2, double num3) {
        double s = ((num1 + num2 + num3) / 2);

        double perimetro = Math.sqrt(s * (s - num1) * (s - num2) * (s - num3));

        int value = (int) perimetro;
        return value;
    }
}
