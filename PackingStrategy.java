import java.util.*;
/**
 * Identify the bin in which an itemSize item should be placed.
 * Return <code>bins.size()</code> to indicate a new bin should be started.
 * Does not alter its inputs.
 * @param bins a list containing the current quantity stored in each bin
 * @param binCapacity the maximum capacity of each bin
 * @param itemsize the size if the item to be placed
 */
public interface PackingStrategy {
    public int itemPlace(List<Integer> bins,
                         int binCapacity,
                         int itemSize);
}
