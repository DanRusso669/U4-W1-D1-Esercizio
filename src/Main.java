import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Esercizio1 eserc1;
       // Esercizio3 eserc3;

        eserc1 = new Esercizio1();
        //eserc3 = new Esercizio3();

        int num1 = 10, num2 = 2, num3 = 25;

        String testo1 = "Oggi è il ";

        String[] arrayDiStringhe = {"lun", "mar", "mer", "gio", "ven"};
        String testo2 = "Intruso";

        System.out.println("La moltiplicazione tra " + num1 + " e " + num2 + " è uguale a: " + eserc1.moltiplica(num1, num2));
        System.out.println("I due elementi concatenati diventano: " + eserc1.concatena(testo1, num3));
        System.out.println(Arrays.toString(eserc1.inserisciInArray(arrayDiStringhe, testo2)));

    }
    }