package algoexpert.hard;

public class ShiftedBinarySearch {

    public static int shiftedBinarySearch(int[] array, int target){
        return shiftedBinarySearchHelper(array, target, 0, array.length-1);
    }

    private static int shiftedBinarySearchHelper(int[] array, int target, int left, int right) {
        if (left >= right)
            return -1;
        int middleIndex = (left+right)/2;
        int potentialMatch = array[middleIndex];
        int leftNum = array[left];
        int rightNum = array[right];
        if (potentialMatch == target){
            return middleIndex;
        }else if (leftNum <= potentialMatch){
            if (leftNum < target && target < potentialMatch){
                return shiftedBinarySearchHelper(array, target, left, middleIndex-1);
            }else {
                return shiftedBinarySearchHelper(array, target, middleIndex+1, right);
            }
        }else{
            if (potentialMatch < target && target < rightNum){
                return shiftedBinarySearchHelper(array, target, middleIndex+1, right);
            }else {
                return shiftedBinarySearchHelper(array, target, left, middleIndex-1);
            }
        }

    }
}
