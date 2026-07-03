package Recursion;

//write the BS code using the recursion.
/*
* Binary Search Using Recursion (Java)
Problem Statement

Given a sorted array, find the index of a target element using recursion.

Example:

Array = [2, 5, 8, 12, 16, 23, 38, 56]
Target = 23

Output = 5
* */

public class BinarySearchRec {

    // This method performs Binary Search recursively.
    //
    // Parameters:
    // arr    -> The sorted array in which we are searching.
    // target -> The number we want to find.
    // start  -> Left boundary of the current search space.
    // end    -> Right boundary of the current search space.
    //
    // Returns:
    // Index of target if found.
    // -1 if target does not exist.

    static int binarySearch(int[] arr, int target, int start, int end) {

        // ---------------------------------------------------------
        // STEP 1 : Base Case
        // ---------------------------------------------------------
        //
        // If the starting index becomes greater than the ending index,
        // it means there are no elements left to search.
        //
        // Example:
        //
        // start = 6
        // end   = 5
        //
        // Search space has become empty.
        //
        // Therefore the target is not present.
        //

        if (start > end) {
            return -1;
        }


        // ---------------------------------------------------------
        // STEP 2 : Find the Middle Element
        // ---------------------------------------------------------
        //
        // We calculate the middle index.
        //
        // Instead of:
        //
        // int mid = (start + end) / 2;
        //
        // we use:
        //
        // start + (end - start) / 2
        //
        // because it prevents integer overflow for very large arrays.
        //

        int mid = start + (end - start) / 2;


        // ---------------------------------------------------------
        // STEP 3 : Check if middle element is the target
        // ---------------------------------------------------------
        //
        // If yes, we're done.
        //

        if (arr[mid] == target) {
            return mid;
        }


        // ---------------------------------------------------------
        // STEP 4 : Decide Which Half To Search
        // ---------------------------------------------------------
        //
        // Binary Search works because the array is SORTED.
        //
        // If target is smaller than middle element,
        // ignore the right half.
        //
        // Example:
        //
        // [2 5 8 12 16 23 38 56]
        //          ^
        //         mid =16
        //
        // target = 8
        //
        // Since 8 < 16,
        // search only left side.
        //

        if (target < arr[mid]) {

            // Recursive call on LEFT HALF
            return binarySearch(arr, target, start, mid - 1);
        }


        // ---------------------------------------------------------
        // STEP 5 : Otherwise search the RIGHT HALF
        // ---------------------------------------------------------
        //
        // Example:
        //
        // [2 5 8 12 16 23 38 56]
        //          ^
        //         mid =16
        //
        // target = 38
        //
        // Since 38 > 16,
        // ignore left half.
        //

        return binarySearch(arr, target, mid + 1, end);
    }


    // ---------------------------------------------------------
    // Main Method
    // ---------------------------------------------------------
    public static void main(String[] args) {

        // Sorted array
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56};

        // Element to search
        int target = 23;

        // Call recursive binary search
        int ans = binarySearch(arr, target, 0, arr.length - 1);

        // Print result
        System.out.println("Target found at index: " + ans);
    }
}
