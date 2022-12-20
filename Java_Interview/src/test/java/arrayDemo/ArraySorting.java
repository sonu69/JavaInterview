package arrayDemo;

import java.util.Arrays;

class ArraySorting {

	public static void main(String[] args) {
		
		int age[] = {70,25,30,40,10};

		Arrays.sort(age);
		
		System.out.println(Arrays.toString(age));
		
		System.out.println("Largest number in array "+age[age.length-1]);
		
		System.out.println("Largest number in array "+age[age.length-2]);
		
	}

}
