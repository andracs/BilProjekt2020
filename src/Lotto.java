import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 23/10/2020
 */

/* OPGAVEN: Lav et array med 5 tilfældige tal mellem 1 og 90, men du må ikke trække de samme tal 2 gange! */
public class Lotto {

    static Random random = new Random();
    static final int MAXIMUM = 90;
    static final int ANTAL_TAL = 5;

    public static void main(String[] args) {

        int lottoTal[] = new int[ANTAL_TAL];

        for (int i = 0; i < ANTAL_TAL; i++) {
            int nytNummer;
            do {
                nytNummer = randomNummer();
                if (talFindes(nytNummer, lottoTal)) System.out.printf("Tallet %d findes, laver nyt.\n", nytNummer);
            } while (talFindes(nytNummer, lottoTal));
            lottoTal[i] = nytNummer;
            System.out.println("Array index " + i + " indeholder nummer  " + lottoTal[i] + ".");
        }
    }

    public static int randomNummer() {
        return random.nextInt(MAXIMUM)+1;
    }

    public static boolean talFindes(int tal, int[] array) {
        boolean findes = false;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == tal) findes = true;
        }
        return findes;
    }
}
