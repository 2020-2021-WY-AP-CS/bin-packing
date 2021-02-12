import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

/* This file still a work in progress, check back later */

public class TestPacking {
    List<Integer> ex1;
    List<Integer> ex2;
    @Before
    void setup_examples() {
        ex1 = new ArrayList<Integer>(Arrays.asList(10,5,6,11,4,3));
        ex2 = new ArrayList<Integer>(Arrays.asList(10,12,3,6,4,11,3));
    }
    @Test
    public void test_nextFit_1() {
        int binCapacity = 20;
        NextFit fitter = new NextFit();
        List<Integer> partial = Arrays.asList(1,1,2,2);
        List<Integer> correct = Arrays.asList(1,1,2,2,3,3);
        int itemSize = 20; // fixme
        int loc = fitter.itemPlace(partial, binCapacity, itemSize);
    }
}