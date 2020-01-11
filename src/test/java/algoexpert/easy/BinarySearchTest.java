package algoexpert.easy;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void testCase1(){
        Assert.assertTrue( BinarySearch.binarySearch(new int[]{1,5,23,111}, 111) == 3);
    }
    @Test
    public void testCase2(){
        Assert.assertTrue(BinarySearch.binarySearch(new int[]{3,5,6,1,2}, 10) == -1);
    }
    @Test
    public void testCase3(){
        Assert.assertTrue(BinarySearch.binarySearch(new int[]{33,44,55,66,77}, 77) == 4);
    }
    @Test
    public void testCase4(){
        Assert.assertTrue(BinarySearch.binarySearch(new int[]{33,55,66,77,0}, 33) == 0);
    }
    @Test
    public void testCase5(){
        Assert.assertTrue(BinarySearch.binarySearch(new int[]{33,55,66,77,0}, 66) == 2);
    }
    @Test
    public void testCase6(){
        Assert.assertTrue(BinarySearch.binarySearch(new int[]{0,1,21,33,45,45,61,71,72,73,355} , 354) == -1);
    }
}
