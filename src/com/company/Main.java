package com.company;

/**
 * Implementation of the Selection Sort algorithm for study of Data Structures and Algorithms
 * Time Complexity: O(n^2)
 * Type of Sort: Unstable Sort
 */
public class Main {

    public static void main(String[] args) {
        int [] intArray = {20,35,-15,7,55,1,-22};
        printArray(intArray);
        System.out.println("---------------------------");
        selectionSort(intArray);
        printArray(intArray);
    }
    // Selection Sort
    public static void selectionSort(int [] array){
        // Outer loop to keep track of parts of array that were already sorted
        for (int unsortedLength = array.length-1; unsortedLength > 0; unsortedLength--){
            // keep track of the largest item in each traversal
            int maxIndex = 0; // The first item in the array is always the default
            for (int i=1; i <= unsortedLength; i++){
                // compare current element to maxItem - if bigger, then new element position becomes maxIndex
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }
            // If we are at the end of our loop, perform the swap
            swap(array,maxIndex,unsortedLength);
        }
    }
    // function to swap array elements
    public static void swap(int [] array, int i, int j){
        if (i == j){ // No need to swap if values are equal
            return;
        }
        // Create holder for i element
        int holder = array[i];
        // Perform swap
        array[i] = array[j];
        array[j] = holder;
    }

    // method to print array
    public static void printArray(int [] array){
        for (int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
