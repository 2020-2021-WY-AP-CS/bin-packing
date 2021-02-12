import java.util.*;

/*
The Packer is designed to do the work of packing and shipping bins.
Any time a Packer needs to know what bin to place an item in, it should
call the its filler's itemPlace method.
*/

public class Packer {
    PackingStrategy filler;
    public Packer(PackingStrategy fillStrat) {
        filler = fillStrat;
    }
    
    /** 
     * packAll
     * Purpose: using the given filler strategy, create a list of bin numbers showing where each item is placed. 
     */
    public List<Integer> packAll(int bin_size, List<Integer> items) {
        return null;
    }

    /**
     * binsUsed
     * Input: 
     *   List<Integer> binNumber
     * Output:
     *   int how many bins are used in the list of bin numbers
     * You may assume that there are no empty bins before a used bin.
     */
    public int binsUsed(List<Integer> binNumber) {
        return -1;
    }
        
    /**
     * spaceUsed
     * Input: 
     *   @param itemSize Specifying each item's size.
     *   @param binNumber Specifying bin number each item is placed in. Corresponds with itemSize.
     * Output:     
     *   An array specifying space used in each bin. 
     */
    public int[] spaceUsed(List<Integer> itemSize, List<Integer> binNumber) {
        return null;
    }

    /**
     * shipBin
     * Purpose: A bin is packed and shipped out. Remove the items in that bin from both the
     * itemSize and binNumber lists. Part of removing the bin number is renumber bins above that number.
     * @param itemSize
     * @param binNumber
     * @param bin
     */
    public void shipBin(List<Integer> itemSize, List<Integer> binNumber, int bin) {

    }

}
