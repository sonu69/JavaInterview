package programs;

class Factorial {

	public static void main(String[] args) {

		int num = 10;

		int fact = 1;

		for(int i=0;num-i>0;i++) {

			fact = fact*(num-i);
		}
		System.out.println(fact);
	}

}

// Concept - Factorial of N
// 10*9*8*7*6*5*4*3*2*1
// num*(num-1)*(num-2)*(num-3)*(num-4)*(num-5)*(num-6)*(num-7)*(num-8)*(num-9)