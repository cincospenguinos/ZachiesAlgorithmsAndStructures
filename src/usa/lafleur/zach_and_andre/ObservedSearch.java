package usa.lafleur.zach_and_andre;

public interface ObservedSearch {
    /**
     * Returns true if the search finds the value provided.
     */
    public boolean contains(int value);

    /**
     * Returns the number of times the algorithm had to check an index in the array.
     */
    public int retrievals();

    /**
     * Reset the number of retrievals.
     */
    public void reset();
}
