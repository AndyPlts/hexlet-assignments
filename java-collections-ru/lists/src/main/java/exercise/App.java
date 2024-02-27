package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN

public class App {
    public static boolean scrabble(String letters, String word) {
        int count = 0;
        var letterLowerCase = letters.toLowerCase();
        var wordLowerCase = word.toLowerCase();
        var listOfLetters = new ArrayList<Character>();
        var listOfWordLetters = new ArrayList<Character>();
        for (var letter : letterLowerCase.toCharArray()) {
            listOfLetters.add(letter);
        }
        for (var letter : wordLowerCase.toCharArray()) {
            listOfWordLetters.add(letter);
        }
        for (var l : listOfWordLetters) {
            if (listOfLetters.contains(l)) {
                listOfLetters.remove(l);
                count++;
            }
        }
        return count == wordLowerCase.length();
    }
}
//END
