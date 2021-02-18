package usa.lafleur.zach_and_andre;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BruteForceSearchTest {

    @Test
    public void test_findsSomethingThatIsThere() {
        int[] values = {1, 2, 3, 4, 5};
        ObservedSearch search = new BruteForceSearch(values);
        assertTrue(search.contains(3));
        System.out.println(search.retrievals());
    }

    @Test
    public void test_findsSomethingOutOfOrder() {
        int[] values = {5, 2, 4, 1, 3};
        ObservedSearch search = new BruteForceSearch(values);
        assertTrue(search.contains(3));
        System.out.println(search.retrievals());
    }

    @Test
    public void evaluate_howManyThingsToFindOurThing() {
        System.out.println("SEARCH\tRETRIEVALS\tRETRIEVALS/SIZE");

        for (final int LENGTH : new int[] { 10, 100, 1000, 10000, 100000 }) {
            int[] values = new int[LENGTH];
            Random random = new Random(19950124);
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < values.length; i++) {
                int value = random.nextInt();
                list.add(value);
                values[i] = value;
            }

            list.sort(Comparator.comparingInt(a -> a));

            ObservedSearch search = new BruteForceSearch(values);
            for (int value : list) {
                assertTrue(search.contains(value));
            }
            int retrievals = search.retrievals();
            int retrievalsOverLength = retrievals / LENGTH;
            System.out.println("BruteForce\t" + retrievals + "\t" + retrievalsOverLength);
        }
    }
}