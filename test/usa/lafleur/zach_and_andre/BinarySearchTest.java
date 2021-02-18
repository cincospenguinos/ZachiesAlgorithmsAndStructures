package usa.lafleur.zach_and_andre;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    public void test_findsSomethingThatIsThere() {
        int[] values = {1, 2, 3, 4, 5};
        ObservedSearch search = new BinarySearch(values);
        assertTrue(search.contains(3));
        System.out.println(search.retrievals());
    }

    @Test
    public void test_doesNotAlwaysFindSomethingOutOfOrder() {
        int[] values = {5, 2, 4, 1, 3};
        ObservedSearch search = new BinarySearch(values);
        assertTrue(search.contains(3), "Binary search must use arrays that are sorted");
        System.out.println(search.retrievals());
    }

    @Test
    public void evaluate_howManyThingsToFindOurThing() {
        System.out.println("SEARCH\tRETRIEVALS\tRETRIEVALS/SIZE");

        for (final int LENGTH : new int[] { 10, 100, 1000, 10000, 100000 }) {
            Random random = new Random(19950124);
            List<Integer> list = new ArrayList<>();
            int[] values = new int[LENGTH];

            for (int i = 0; i < LENGTH; i++) {
                int value = random.nextInt();
                list.add(value);
            }

            List<Integer> otherList = new ArrayList<>(list);
            list.sort(Comparator.comparingInt(a -> a));

            for (int i = 0; i < values.length; i++) {
                values[i] = list.get(i);
            }

            ObservedSearch search = new BinarySearch(values);
            for (int value : otherList) {
                assertTrue(search.contains(value));
            }
            int retrievals = search.retrievals();
            int retrievalsOverLength = retrievals / LENGTH;
            System.out.println("BinarySearch\t" + retrievals + "\t" + retrievalsOverLength);
        }
    }
}