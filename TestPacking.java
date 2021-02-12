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
        int[] items1 = {10,5,6,11,4,3};
        ex1 = new ArrayList<>(Arrays.asList(items1));

        int[] items2 = {10,12,3,6,4,11,3};
        ex2 = new ArrayList<>(Arrays.asList(items2));
    }
    @Test
    public void test_nextFit_1() {
        int binCapacity = 20;
        NextFit fitter = new NextFit();
        List<Integer> partial = Arrays.asList(1,1,2,2);
        List<Integer> correct = Arrays.asList(1,1,2,2,3,3);
        ArrayList<Integer> bins = new ArrayList<>();
        List<Integer> answer;
        answer = fitter.itemPlace(bins, binCapacity, items1.remove(0));
        List<Integer> answer = fitter.itemPlace(bins, binCapacity, items1.remove(0));
        List<Integer> answer = fitter.itemPlace(bins, binCapacity, items1.remove(0));
        List<Integer> answer = fitter.itemPlace(bins, binCapacity, items1.remove(0));
        assertEquals(correct, partial, "NextFit 1.1");  
        assertEquals(correct, answer, "NextFit 1.1");  
    }
    @Test
    public void test_nextFit_2() {
        NextFit fitter = new NextFit();
        List<Integer> correct = Arrays.asList(1,1,2,2,3,3);
        ArrayList<Integer> bins = new ArrayList<>();
        List<Integer> answer = fitter.itemPlace(bins, binCapacity, itemSize);
        assertEquals(correct, answer, "NextFit on example 1");  
    }
}