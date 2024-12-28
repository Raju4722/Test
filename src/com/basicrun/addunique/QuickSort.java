package com.basicrun.addunique;

public class QuickSort {
	public static void quicksort(int[] ab, int low, int high) {
		if(low<high) {
		int pivot=partition(ab, low, high);
		quicksort(ab, low, pivot-1);
		quicksort(ab, pivot+1, high);
	}}
	
	private static int partition(int[] ab, int low, int high) {
	int low1=-1;
	int temp=0;
    for(int i=low;i<high;i++) {
    	if(ab[i]<ab[high]) {
    		low1++;
    		temp=ab[i];
    		ab[i]=ab[low1];
    		ab[low1]=temp;
    	}
    	
    }
    temp=ab[high];
    ab[high]=ab[++low1];
    ab[low1]=temp;
    
    return low1++;
	}

	public static void main(String[] args) {
		int[] ab = { 10, 100,70,20,90};
		long Start = System.nanoTime();
		quicksort(ab, 0, 4);
		long end = System.nanoTime();
		
		long end2 = end-Start;
		
		for(int i:ab) {
	    	System.out.println(i);
	    }
		System.out.println(end2);
	}

}
