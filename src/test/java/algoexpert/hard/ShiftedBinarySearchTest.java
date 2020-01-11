package algoexpert.hard;

import org.junit.Assert;
import org.junit.Test;

public class ShiftedBinarySearchTest {

    @Test
    public void testCase1(){
        Assert.assertEquals(ShiftedBinarySearch.shiftedBinarySearch(new int[]{2, 4, 6, 8, 0, 1}, 0),4);
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(ShiftedBinarySearch.shiftedBinarySearch(new int[]{2, 4, 6, 8, 0, 1}, 3),-1);
    }
    @Test
    public void testCase3(){
        Assert.assertEquals(ShiftedBinarySearch.shiftedBinarySearch(new int[]{71, 72,73,74, 76, 0, 1}, 74),3);

    }
}
