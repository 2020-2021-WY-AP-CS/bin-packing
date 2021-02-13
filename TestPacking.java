import java.lang.reflect.Array;
import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class TestPacking {
    List<Integer> ex1, ex1extended, ex2, ex3, ex3bins;

    @Before
    public void setup_examples() {
        ex1 = new ArrayList<>(Arrays.asList(10,5,6,11,4,3));
        ex1extended = new ArrayList<>(Arrays.asList(10,5,6,11,7,4,3));
        ex2 = new ArrayList<>(Arrays.asList(10,12,3,6,4,11,3));
        ex3 = new ArrayList<>(Arrays.asList(10,12,3,6,4,11,3));
        ex3bins = new ArrayList<>(Arrays.asList(0,1,1,2,0,3,3));
    }

    public void testPacking(List<Integer> correct, List<Integer> nums, int binCapacity, PackingStrategy fitter) {
        Packer packer = new Packer(fitter);
        List<Integer> result = packer.packAll(binCapacity, nums);
        assertEquals(correct, result);
    }
    @Test
    public void test_nextFit() {
        int binCapacity = 20;
        PackingStrategy fitter = new NextFit();
        // remember: bins number starting at 0
        List<Integer> correct = Arrays.asList(0,0,1,1,2,2);
        testPacking(correct, ex1, binCapacity, fitter);
    }
    @Test
    public void test_bestFit_1() {
        int binCapacity = 20;
        PackingStrategy fitter = new BestFit();
        List<Integer> correct1 = Arrays.asList(0,0,1,1,0,1);
        testPacking(correct1, ex1, binCapacity, fitter);
    }

    /**
     * Bins of size 20 with the BestFit strategy.
     * Input sizes: [10,5,6,11,7,4,3]
     * Correct:     [ 0,0,1, 1,2,0,1]
     */
    @Test
    public void test_bestFit_2() {
        testPacking(Arrays.asList(0,0,1,1,2,0,1), ex1extended, 20, new BestFit());
    }

    /**
     * Bins of size 15 with the BestFit strategy.
     * Input: [10,12,3,6,4,11,3]. Output: [0,1,1,2,0,3,3]
     */
    @Test
    public void test_bestFit_hard() {
        int binCapacity = 15;
        PackingStrategy fitter = new BestFit();
        List<Integer> correct = ex3bins;
        testPacking(correct, ex3, binCapacity, fitter);
    }

    /**
     * Input:
     * items [10,12,3,6,4,11,3]
     * bins: [ 0, 1,1,2,0, 3,3]
     * Output:
     * items [10,6,4,11,3]
     * bins [0,1,0,2,2]
     */
    @Test
    public void test_shipBin() {
        Packer.shipBin(ex3, ex3bins, 1);
        List<Integer> correct_items = Arrays.asList(10,6,4,11,3);
        List<Integer> correct_bins = Arrays.asList(0,1,0,2,2);
        assertEquals(ex3, correct_items);
        assertEquals(ex3bins, correct_bins);
    }

    @Test
    public void test_spaceUsed() {
        int[] correct = {14,15,6,14};
        int[] ans = Packer.spaceUsed(ex3, ex3bins);
        assertArrayEquals(correct, ans);
    }

    @Test
    public void test_binsUsed() {
        int ans = Packer.binsUsed(ex3bins);
        assertEquals(4, ans);
    }
}