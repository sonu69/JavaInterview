package arrayDemo;

import java.util.Arrays;

class ArrayDemo {

	public static void main(String[] args) {

		int[] old = new int[] {10, 12, 14, 16, 18, 20};

		int[] new_arry = new int[old.length - 1];

		int j=2;

		for(int i=0,k=0;i<old.length;i++) {

					if(i!=j){
					new_arry[k]=old[i];
					k++;
			}
		}
		
		System.out.println(Arrays.toString(new_arry));
	}

}

//How to remove element from array in java