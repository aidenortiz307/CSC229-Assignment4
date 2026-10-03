
package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if (a[inner] > a[inner + 1]) {
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        bubbleSort(numbers, numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
