package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static <K, V> List<Map<K, V>> findWhere(List<Map<K, V>> books, Map<K, V> checkedBook) {
        var resultList = new ArrayList<Map<K, V>>();
        for (var book : books) {
            int count = 0;
            for (Map.Entry<K, V> selectedParameter : book.entrySet()) {
                if (checkedBook.containsValue(selectedParameter.getValue())) {
                    count++;
                }
                if (count == checkedBook.size()) {
                    resultList.add(book);
                }
            }
        }
        return resultList;
    }
}
//END
