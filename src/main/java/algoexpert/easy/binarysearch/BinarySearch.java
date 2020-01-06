package algoexpert.easy.binarysearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        return binarySearch(arr , 0, arr.length-1, target);
    }

    public static int binarySearch(int[] arr, int left, int right, int target){
        if( left > right ) {
            return -1;
        }
        int middle = (left+right)/2;
        int potentialMatch = arr[middle];
        if (potentialMatch == target){
            return middle;
        }else if (target > arr[middle]){
            return binarySearch(arr, middle+1, right, target);
        }else {
            return binarySearch(arr, left, middle-1, target);
        }
    }
}
