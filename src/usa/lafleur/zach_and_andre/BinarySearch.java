package usa.lafleur.zach_and_andre;

public class BinarySearch implements ObservedSearch {
    private final int[] _array;
    private int _retrievals;

    public BinarySearch(int[] array) {
        _array = array;
        _retrievals = 0;
    }

    @Override
    public boolean contains(int value) {
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
