/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 19/10/2020
 */

public class Car {

    private String password;
    public boolean engineOn = false;

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
}
