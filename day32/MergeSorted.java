package com.algorithms.day32;

public class MergeSorted {
    public void mergeSort(int[] arr, int[] temp,int size){
        m_sort(arr,temp,0,size-1);
    }

    private void m_sort(int[] arr, int[] temp, int left, int right) {
        int mid;
        if (right > left){
            mid = (right + left)/2;
            m_sort(arr, temp, left, mid);
            m_sort(arr, temp, mid+1,right);
            merge(arr, temp, left, mid+1, right);
        }
    }

    private void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i, left_last, n_elements, temp_pos;

        left_last = mid -1;
        temp_pos = left;
        n_elements = right-left+1;

        while ((left <=left_last) && (mid<=right)){
            if (arr[left] <= arr[mid]){
                temp[temp_pos] = arr[left];
                temp_pos = temp_pos +1;
                left = left +1;
            } else {
                temp[temp_pos] = arr[mid];
                temp_pos = temp_pos +1;
                mid = mid +1;
            }
        }

        while(mid <= right){
            temp[temp_pos] = arr[left];
            left = left+1;
            temp_pos = temp_pos +1;
        }

        while (mid <= right){
            temp[temp_pos] = arr[mid];
            mid = mid +1;
            temp_pos = temp_pos +1;
        }

        for ( i = 0; i <= n_elements; i++) {
            if (right ==-1){
                right++;
            }
            arr[right] = temp[right];
            right = right -1;
        }

    }
}
