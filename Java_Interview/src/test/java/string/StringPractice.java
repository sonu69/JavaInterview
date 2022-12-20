package string;

class StringPractice {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "sonu";
		
		Integer obj1 = Integer.valueOf(name);
		
		int i = Integer.parseInt(name);
		
		try {
		if(i>0) {
			System.out.println("This is int");
		}
		}catch(Exception e) {
			System.out.println("This is not int");
		}
	}
}