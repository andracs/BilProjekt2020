import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 19/10/2020
 */

public class UserInteface {


    public int uiAircon() {
        // UI indlæser dagens temperatur fra brugeren, f.eks. 10 celsius
        Scanner input = new Scanner(System.in);
        System.out.print("Hvad er temperaturen udenfor? ");
        int outdoorTemperature = input.nextInt();
        return outdoorTemperature;
    }
}
