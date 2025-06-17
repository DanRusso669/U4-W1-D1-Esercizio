package es1;

public class Esercizio1 {

    public static int moltiplica (int num1, int num2){
        return num1 * num2;
    }

    public static String concatena(String testo, int num3){
        return testo + num3;
    }

    public static String[] inserisciInArray(String[] array, String testo){
        String[] nuovoArray = new String[6];

        for(int i = 0; i < nuovoArray.length; i++) {

            if(i<2){
                nuovoArray[i] = array[i];
            } else if (i == 2) {
                nuovoArray[i] = testo;
            } else {
                nuovoArray[i] = array[i-1];
            }
        }

        return nuovoArray;
    }
}

