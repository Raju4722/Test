package com.basicrun.addunique;
import java.util.Arrays;
import java.util.Random;
public class DaaLab1 {
	
	
	    public static void main(String[] args) {
	        int[] arraySizes = {1000, 5000, 10000, 20000};
	        for (int n : arraySizes) {
	            int[] arrQuick = generateRandomArray(n);
	            int[] arrMerge = Arrays.copyOf(arrQuick, arrQuick.length);
	            long startTimeQuick = System.currentTimeMillis();
	            quickSort(arrQuick, 0, arrQuick.length - 1);
	            long endTimeQuick = System.currentTimeMillis();
	            System.out.println("Quick Sort: n = " + n + ", Time = " + (endTimeQuick - startTimeQuick) + " ms");
	            long startTimeMerge = System.currentTimeMillis();
	            mergeSort(arrMerge, 0, arrMerge.length - 1);
	            long endTimeMerge = System.currentTimeMillis();
	            System.out.println("Merge Sort: n = " + n + ", Time = " + (endTimeMerge - startTimeMerge) + " ms");
	        }
	    }
	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(arr, low, high);
	            quickSort(arr, low, pivotIndex - 1);
	            quickSort(arr, pivotIndex + 1, high);
	        }
	    }

	    private static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                swap(arr, i, j);
	            }
	        }

	        swap(arr, i + 1, high);
	        return i + 1;
	    }
	    public static void mergeSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int mid = (low + high) / 2;
	            mergeSort(arr, low, mid);
	            mergeSort(arr, mid + 1, high);
	            merge(arr, low, mid, high);
	        }
	    }

	    private static void merge(int[] arr, int low, int mid, int high) {
	        int n1 = mid - low + 1;
	        int n2 = high - mid;

	        int[] left = new int[n1];
	        int[] right = new int[n2];

	        for (int i = 0; i < n1; i++)
	            left[i] = arr[low + i];
	        for (int j = 0; j < n2; j++)
	            right[j] = arr[mid + 1 + j];

	        int i = 0, j = 0, k = low;

	        while (i < n1 && j < n2) {
	            if (left[i] <= right[j]) {
	                arr[k] = left[i];
	                i++;
	            } else {
	                arr[k] = right[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	            arr[k] = left[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            arr[k] = right[j];
	            j++;
	            k++;
	        }
	    }

	    private static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	    private static int[] generateRandomArray(int size) {
	        int[] arr = new int[size];
	        Random rand = new Random();
	        for (int i = 0; i < size; i++) {
	            arr[i] = rand.nextInt(1000);
	        }
	        return {};
	    }
}
