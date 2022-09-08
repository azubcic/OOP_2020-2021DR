package A_Z_zad_1;

import java.util.ArrayList;
import java.util.Collections;

public class Answer {

    public static ArrayList<Integer> sortAscList(ArrayList<Integer> arr) {
        Collections.sort(arr);
        return(arr);
    }

    public static ArrayList<Integer> sortDescList(ArrayList<Integer> arr) {
        Collections.sort(arr, Collections.reverseOrder());
        return(arr);
    }

    public static float calcAvgList(ArrayList<Integer> arr) {
        float avg = 0;
        for (int i = 0; i < arr.size(); i++) {
            avg += arr.get(i);
        }
        avg = avg / arr.size();
        return avg;
    }

    public static void allMethods(ArrayList<Integer> arr) {
        System.out.println("Originalna lista - nesortirana:\n" + arr);
        System.out.println("Uzlazno sortirana:\n" + sortAscList(arr));
        System.out.println("Silazno Sortirana:\n" + sortDescList(arr));
        System.out.println("AVG:\n" + calcAvgList(arr));

    }
}
