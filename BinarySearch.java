
package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(runBinarySearchIteratively(
                numbers, 40, 0, numbers.length - 1));
        System.out.println(runBinarySearchIteratively(
                numbers, 99, 0, numbers.length - 1));
    }
}
