package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        var resultMap = new HashMap<String, Integer>();
        if (sentence.isEmpty()) {
            return resultMap;
        }
        var wordsArray = sentence.split(" ");
        for (var word : wordsArray) {
            if (resultMap.containsKey(word)) {
                resultMap.put(word, resultMap.get(word) + 1);
            } else {
                resultMap.put(word, 1);
            }
        }
        return resultMap;
    }

    public static String toString(Map<String, Integer> wordCount) {
        if (wordCount.isEmpty()) {
            return "{}";
        }
        var entries = wordCount.entrySet();
        StringBuilder resultStringBuilder = new StringBuilder("{");
        for (var entry : entries) {
            resultStringBuilder.append("\n  ").append(entry.getKey()).append(": ").append(entry.getValue());
        }
        var resultString = resultStringBuilder.toString();
        resultString = resultString + "\n}";
        return resultString;
    }
}
//END
