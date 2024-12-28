package com.basicrun.addunique;

public class arrayaddunique {
	public static void main(String[] args) {
		int[] abc = { 1, 2, 3, 4, 1, 2, 3 };
		int addunique = addunique(abc);

		System.out.println(addunique);
	}

	private static int addunique(int[] abc) {

		int length = abc.length;
		int counting;
		int count2 = 0;
		int count3 = 0;
		int sum = 0;
		
		int[] sub =  new int[length];

		for (int i = 0; i < length; i++) {
			counting = 0;
			for (int j = 0; j < length; j++) {
				if (abc[i] == abc[j]) {
					counting++;
				}
			}
			if (counting == 1) {
				sum += abc[i];
			} else {
				count3=0;
				for(int num:sub) {
					if(abc[i]==num) {
						count3++;
					}
				}
				if(count3==0) {
					sub[count2++]=abc[i];
					sum+=abc[i];
				}
//				for(int k=0;k<count3+1;k++) {
//					if(k<abc.length-2) {
//					if(  abc[i]==sub[k] ) {
//						break;
//					}
//					sub[count2++]=abc[i];
//					count3++;
//					sum+=abc[i];
//					
//				}}
//				
//				
			}
			

		}

		return sum;

	}

}
