import java.util.Scanner;

public class Programs1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double massa, kecepatan, ketinggian, potensial, kinetik, mekanik;

        System.out.println("Menghitung energi potensial, kinetik, dan mekanik");
        System.out.print("Massa = ");
        massa = input.nextDouble();
        System.out.print("Kecepatan = ");
        kecepatan = input.nextDouble();
        System.out.print("Ketinggian = ");
        ketinggian = input.nextDouble();
        potensial = massa * 10 * ketinggian;
        kinetik = (double) 1 / 2 * massa * (kecepatan * kecepatan);
        mekanik = potensial + kinetik;
        System.out.println("Energi potensial = " + potensial);
        System.out.println("Energi kinetik = " + kinetik);
        System.out.println("Energi mekanik = " + mekanik);
    }
}

