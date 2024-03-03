package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books,
                                                      Map<String, String> checkedBook) {
        var resultList = new ArrayList<Map<String, String>>();
        for (var book : books) {
            if (checkedBook.containsKey("title") && checkedBook.containsKey("author")
                    && checkedBook.containsKey("year")) {
                if (checkedBook.get("author").equals(book.get("author")) &&
                        checkedBook.get("title").equals(book.get("title")) &&
                        checkedBook.get("year").equals(book.get("year"))) {
                    resultList.add(book);
                }
            } else if {

            }
        }
    }
}
//END
