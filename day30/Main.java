package com.algorithms.day30;

public class Main {
    public static void main(String[] args) {

        // Insertion Sort

        /*int[] arr = {10, 1, 9, 2, 8, 3};
        int valueHolder;
        int counterValue;
        System.out.println("Original array (unsorted): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+ arr[i]);
            valueHolder = arr[i];
            counterValue = i;
            while ((counterValue > 0) && (arr[counterValue - 1] > valueHolder)) {
                arr[counterValue] = arr[counterValue - 1];
                counterValue = counterValue - 1;

            }
            arr[counterValue] = valueHolder;

        }
        System.out.println("\nSorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }*/

        // Shelling Sort

        int[] nums = {1, 15, 12, 9, 11, 2};
        int mid = nums.length / 2;

        while (mid > 0) {
            for (int i = mid; i < nums.length; i++) {
                int currentValue = nums[i];
                int j = i - mid;

                while (j >= 0 && currentValue < nums[j]) {
                    nums[j + mid] = nums[j];
                    j = j - mid;
                }

                nums[j + mid] = currentValue;
            }
            mid = mid / 2;
        }

        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}
