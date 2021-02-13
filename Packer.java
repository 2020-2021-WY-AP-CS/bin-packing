import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;   // @see workaround

/**
 * The Packer is designed to do the work of packing and shipping bins.
 * Any time a Packer needs to know what bin to place an item in, it should
 * call the its filler's itemPlace method.
 */

public class Packer {
    PackingStrategy filler;

    /**
     * Constructs a Packer that uses the given strategy to fill bins.
     * @param fillStrat a PackingStrategy used by this object to find the next bin to fill.
     */
    public Packer(PackingStrategy fillStrat) {
        filler = fillStrat;
    }
    
    /** 
     * Using the filler <code>PackingStrategy</code> provided in the constructor, create a list of bin numbers showing where each item is placed.
     */
    public List<Integer> packAll(int bin_size, List<Integer> items) {
        /* FIXME */
        return null;
    }

    /**
     *  Find the number of bins used in a list of bin numbers.
     *  Assumes that all bins are filled, beginning with bin 0.
     *   @param binNumber a list of numbers of bins where items are placed
     *   @return how many bins are used in the list of bin numbers
     */
    public static int binsUsed(List<Integer> binNumber) {
        /* FIXME */
        return -1;
    }
        
    /**
     * Create an array with the amount of space filled in each bin.
     *   @param itemSize Specifying each item's size.
     *   @param binNumber Specifying bin number each item is placed in. Corresponds with itemSize.
     *   @return An array specifying space used in each bin.
     */
    public static int[] spaceUsed(List<Integer> itemSize, List<Integer> binNumber) {
        /* FIXME */
        return null;
    }

    /**
     * Remove the items in that bin from both the <code>itemSize</code> and <code>binNumber</code> lists.
     * Part of removing the bin number is renumber bins above that number,
     * reducing their bin number by one.
     * @param itemSize   List of item sizes
     * @param binNumber List of bin numbers corresponding to each item
     * @param bin the bin to remove
     */
    public static void shipBin(List<Integer> itemSize, List<Integer> binNumber, int bin) {
        /* FIXME */
    }

}
