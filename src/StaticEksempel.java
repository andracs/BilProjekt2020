/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 26/10/2020
 */

public class StaticEksempel {

    private int tal = 5;

    public int getTal() {
        return tal;
    }

    public void setTal(int tal) {
        this.tal = tal;
    }

    public void x() {
        System.out.println("x " + tal );
    }
    public static void y() {
        System.out.println("y " );
    }

    public static void main(String[] args) {
        // kald x()
        StaticEksempel a = new StaticEksempel();
        a.tal = 10;
        StaticEksempel b = new StaticEksempel();
        b.tal = 20;
        a.x();
        b.x();
        // kald y()
        StaticEksempel.y();
    }


}
