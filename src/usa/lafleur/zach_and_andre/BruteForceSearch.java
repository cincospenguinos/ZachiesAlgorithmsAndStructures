package usa.lafleur.zach_and_andre;

public class BruteForceSearch implements ObservedSearch {
    private final int[] _array;
    private int _retrievals;

    public BruteForceSearch(int[] array) {
        if (array == null) {
            throw new RuntimeException("Cannot give me a null array");
        }

        _array = array;
        _retrievals = 0;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < _array.length; i++) {
            if (getAt(i) == value) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int retrievals() {
        return _retrievals;
    }

    @Override
    public void reset() {
        _retrievals = 0;
    }

    private int getAt(int index) {
        _retrievals += 1;
        return _array[index];
    }
}
