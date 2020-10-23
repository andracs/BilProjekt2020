/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 19/10/2020
 */

public class Car {

    private String password;
    public boolean engineOn = false;
    private UserInteface ui;
    private int temperature;
    private boolean aircondition = false;
    private Color color = Color.BLUE;
    private Object brand = Brand.FORD.KUGA;

    Car() {
        this.password = "password1234";
        this.engineOn = false;
    }

    public void turnEngineOn(CarKey key) {
        if (key.password.equals(password)) {
            System.out.println("Bilen er tændt.");
            engineOn = true;
        } else {
            System.out.println("Bilen kan ikke tænde, pga. forkert nøgle.");
        }
    }

    public void turnEngineOff() {
        this.engineOn = false;
    }

    public void releaseHandbreak() {
    }

    public void changeToGear(int i) {
    }

    public void pressClutch() {
    }

    public void releaseClutch() {
    }

    public void pressSpeeder(int i) {
    }


    public void setUI(UserInteface ui) {
        this.ui = ui;
    }

    public UserInteface getUI() {
        return ui;
    }

    public void autoAircon() {
        int outdoorTemperature = ui.uiAircon();
        // Hvis det er over 20 grader, skal aircon tændes
        if (outdoorTemperature > 20) {
            airconditionOn();
        }
        // Ellers skal aircon slukkes
        else {
            airconditionOff();
        }
    }

    public void airconditionOn() {
        // LAVER NU Airconditon skal kun tænde, hvis bilen er tændt
        if (engineOn) {
            System.out.println("Aircondion er tændt.");
        } else {
            System.out.println("Airconditon kan ikke tændes, fordi bilen ikke er tændt.");

        }
    }

    public void airconditionOff() {

    }

    enum Color {
        RED, WHITE, BLUE
    }

    class Hest {

    }

}

