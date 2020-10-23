import java.util.Random;

public class LinearSearch {

    /** The method for finding a key in the list */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] talArray = new int[10];
        int i = 0;
        for (int x : talArray) {
            x = (int) (Math.random() * 10);
            talArray[i++] = x;
            System.out.println(x);
        }
        System.out.println("Find tallet 5 i arrayet?");
        int resultat = linearSearch(talArray, 5) +1;
        if (resultat>0) {
            System.out.println("Tallet findes på position " + resultat + ". ");
        } else {
            System.out.println("Tallet findes ikke.");
        }
    }

}