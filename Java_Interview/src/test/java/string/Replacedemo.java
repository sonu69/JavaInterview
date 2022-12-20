package string;

public class Replacedemo {
	
	public static void main(String[] args) {
		
		String price = "Rs 12,816";
		
		String newPrice = price.replaceAll("[ ,a-zA-Z]","");
		
		System.out.println(newPrice);
		
		int prc = Integer.parseInt(newPrice);
		
		System.out.println("[ ,a-zA-Z]");
		
	}

}
