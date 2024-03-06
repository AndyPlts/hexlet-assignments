package exercise;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        var numbers1 = new ArrayList<>(Arrays.asList(3, 18, 12, 7, 19));
        var actual1 = App.take(numbers1, 3);
        var answer1 = new ArrayList<>(Arrays.asList(3, 18, 12));
        assertThat(actual1).isEqualTo(answer1);

        var numbers2 = new ArrayList<>(Arrays.asList(17, 9, 11));
        var actual2 = App.take(numbers2, 5);
        var answer2 = new ArrayList<>(Arrays.asList(17, 9, 11));
        assertThat(actual2).isEqualTo(answer2);

        var numbers3 = new ArrayList<>(Arrays.asList(21, 8, 11, 3));
        var actual3 = App.take(numbers3, 4);
        var answer3 = new ArrayList<>(Arrays.asList(21, 8, 11, 3));
        assertThat(actual3).isEqualTo(answer3);
        // END
    }
}
