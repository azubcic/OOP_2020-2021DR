package A_Z_zad_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Generator {

    public static ArrayList<Integer> generateList() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int validLngt;
        boolean valid = true;
        while (valid) {
            try {
                System.out.println("Unesite broj elemenata liste --> 7 do maksimalno 20 elemenata...");
                System.out.println("===================================================================");
                String input = sc.next();
                validLngt = Integer.parseInt(input);
                if ((validLngt >= 7) && (validLngt <= 20)) {
                    for (int i = 0; i < validLngt; i++) {
                        valid = false;
                        int generatedNum = ThreadLocalRandom.current().nextInt(99) + 1;
                        while (arr.contains(generatedNum)) {
                            generatedNum = ThreadLocalRandom.current().nextInt(99) + 1;
                        }
                        arr.add(generatedNum);
                    }
                } else {
                    System.out.println("Niste unijeli cjelobrojnu vrijednost u rasponu od 7 do 20");
                }
            } catch (NumberFormatException ex) {
                System.out.println("N**iste unijeli cjelobrojnu vrijednost u rasponu od 7 do 20");
            }
        }
        return arr;
    }
}
