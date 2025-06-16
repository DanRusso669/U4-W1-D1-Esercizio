import com.sun.security.jgss.GSSUtil;

public class Esercizio3 {
    public static void main(String[] args) {
        System.out.println("Il perimetro è uguale a " + perimetroRettangolo(5, 3));
        System.out.println(pariDispari(4));
        System.out.println(pariDispari(3));
        System.out.println(perimetroTriangolo(10,  12, 15));
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

        double area = Math.sqrt(s * (s - num1) * (s - num2) * (s - num3));

        int value = (int) area;
        return value;
    }
}
