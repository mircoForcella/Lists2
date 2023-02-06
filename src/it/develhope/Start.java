package it.develhope;

import java.util.*;

public class Start {
    public static void main(String[] args) {
        ArrayList<Integer> divisorsOf52 = new ArrayList<>();
        divisorsOf52.addAll(Arrays.asList(1,2,4,13,26,52));
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.addAll(Arrays.asList(1, 60, 13, 12));

        //Adding
        randomNumbers.addAll(divisorsOf52);
        System.out.println(randomNumbers + " " + randomNumbers.size());

        //Removing duplicates
        Set<Integer> setRandomNumbers = new HashSet<>(randomNumbers);
        randomNumbers.clear();
        randomNumbers.addAll(setRandomNumbers);
        System.out.println("-----------");
        System.out.println(randomNumbers);

        //Sorting in a descending order
        Collections.sort(randomNumbers, Collections.reverseOrder());
        System.out.println("-----------");
        System.out.println(randomNumbers);
    }
}
