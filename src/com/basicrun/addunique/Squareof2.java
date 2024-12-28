package com.basicrun.addunique;

public class Squareof2 {

	public static void main(String[] args) {
        int num=1555555;
      System.out.println(ispowerof2(num));
	}

	private static boolean ispowerof2(int num) {
		for(int i=0;i<num;i++) {
			if((i*i)==num) {
				return true;
			}
		}
		
		
		return false;
   		
	}

}
