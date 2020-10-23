/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 19/10/2020
 */

public class Sekunder {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("Sekund " + i);
            Thread.sleep(1000);
        }
    }
}
