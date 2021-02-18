package usa.lafleur.zach_and_andre;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Test
    public void test_isSorted() {
        int[] array = new int[] {4, 1, 5, 2, 0, 9, 3, 6, 7, 8};
        SelectionSort sort = new SelectionSort(array);
        sort.sort();

        for (int i = 0; i < sort.getArray().length - 1; i++) {
            assertTrue(sort.getArray()[i] <= sort.getArray()[i + 1]);
        }
    }
}