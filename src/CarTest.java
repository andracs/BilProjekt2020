/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 19/10/2020
 */

public class CarTest {

    public static void main(String[] args) {
        testSuite();
    }

    private static void testSuite() {
        System.out.println("Testsuiten kører.");
        System.out.print("Test 1 (bilen skal være tændt): ");
        testStartCarWithCorrectKey();
        System.out.print("Test 2 (bilen skal ikke være tændt): ");
        testStartCarWithWrongKey();
    }

    private static void testStartCarWithCorrectKey() {
        Car andrasCar = new Car();
        CarKey key = new CarKey("password1234");
        andrasCar.turnEngineOn(key);
    }

    private static void testStartCarWithWrongKey() {
        Car andrasCar = new Car();
        CarKey key = new CarKey("hest");
        andrasCar.turnEngineOn(key);
    }

    private static void testStartCarCanDrive() {
        Car andrasCar = new Car();
        CarKey key = new CarKey("password1234");
        andrasCar.turnEngineOn(key);
        // Tag håndbremsen fra
        andrasCar.releaseHandbreak();
        // Sæt bilen i frigear
        andrasCar.changeToGear(0);
        // Hvis den er i frigear, tryk kobling ned
        andrasCar.pressClutch();
        // Skift gear til 1
        andrasCar.changeToGear(1);
        // Slip koblingen
        andrasCar.releaseClutch();
        // Tryk gaspadelane (halvt) ned
        andrasCar.pressSpeeder(3);


    }

}
