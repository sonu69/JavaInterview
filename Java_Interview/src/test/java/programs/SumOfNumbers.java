package programs;

class SumOfNumbers {

	public static void main(String[] args) {


		int num = 73625789;

		int sum=0;
		
		int rem;

		for(int i=0;num>0;i++) {
			
			rem = num%10;
			
			sum = sum*10+rem;
			
			num = num/10;
		}

		System.out.println(sum);



	}

}

// 7+3+6+2+5+7+8+9