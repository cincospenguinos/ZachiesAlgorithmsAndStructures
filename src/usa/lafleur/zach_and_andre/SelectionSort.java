package usa.lafleur.zach_and_andre;

public class SelectionSort {
    private int[] _array;

    public SelectionSort(int[] array) {
        _array = array;
    }

    public void sort() {
        for (int indexWeAreChanging = 0; indexWeAreChanging < _array.length; indexWeAreChanging++) {
            int indexOfSmallestElement = indexWeAreChanging;

            for (int currentIndex = indexOfSmallestElement; currentIndex < _array.length; currentIndex++) {
                int candidateValue = _array[currentIndex];

                if (candidateValue < _array[indexOfSmallestElement]) {
                    indexOfSmallestElement = currentIndex;
                }
            }

            int tmp = _array[indexWeAreChanging];
            _array[indexWeAreChanging] = _array[indexOfSmallestElement];
            _array[indexOfSmallestElement] = tmp;
        }
    }

    public int[] getArray() {
        return _array;
    }
}
