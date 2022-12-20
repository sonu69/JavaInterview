package programs;

class NumberReverse {

	public static void main(String[] args) {
		

		int num = 73625736;
		
		int rem;

		int sum=0;
		
		for(int i=0;i<num;i++) {
			
			rem = num%10;
			
			sum = sum+rem;
			
			num = num/10;
		}
		
		System.out.println(sum);

	}

}
