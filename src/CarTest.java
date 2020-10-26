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
        System.out.print("Test 0 (enum skal give OFF): ");
        testEnum();
        System.out.print("Test 1 (bilen skal være tændt): ");
        testStartCarWithCorrectKey();
        System.out.print("Test 2 (bilen skal ikke være tændt): ");
        testStartCarWithWrongKey();
        System.out.print("Test 3 (aircon skal tænde automatisk): ");
        testAircon();
        System.out.print("Test 4 (aircon må kun tænde hvis motoren er tændt): ");
        testAirconShouldOnlyTurnOnIfEnfgineIsRunning();
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

    private static void testAircon() {
        Car patrickCar = new Car();
        UserInteface ui = new UserInteface();
        patrickCar.setUI(ui);
        // ???
        // patrickCar.getUI().uiAircon();
        patrickCar.autoAircon();
    }

    // Aircondition
    // OK Aircondition slukkes
    // OK Aircondotion tændes
    // LAVER NU Airconditon skal kun tænde, hvis bilen er tændt
    private static void testAirconShouldOnlyTurnOnIfEnfgineIsRunning() {
        Car saraCar = new Car();
        CarKey key = new CarKey("password1234");
        saraCar.turnEngineOn(key);
        saraCar.airconditionOn();
        System.out.println("Nu tester vi om aircon kan tændes når bilen er ikke tændt:");
        saraCar.turnEngineOff();
        saraCar.airconditionOn();

    }

    private static void testEnum() {
        System.out.println("Engine State: " + EngineState.values());
    }
}
