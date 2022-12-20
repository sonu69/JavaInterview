package programs;

class PrimeNumSecMethod {

	public static void main(String[] args) {

		int num=2;
		int m;
		int flag=0;
		
		m=num/2;
		
		for(int i=2;i<=m;i++) {
			if(num%i==0) {
				System.out.println("Number is not prime");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Number is prime");
		}

	}

}
