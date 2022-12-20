package wrapper;

class WrapperDemo {

	public static void main(String[] args) {
		
		float f = 123.345f;
		
		double d = 123.45678;
		
		long l = 9905040207l;
		
		String s = "0";
		boolean b = true;
		
		Boolean obj1 = Boolean.valueOf(b);
		Boolean obj2 = Boolean.valueOf(s);
		
		String w = obj1.toString();
		String x = obj2.toString();
		boolean y = obj1.booleanValue();
		boolean z = obj2.booleanValue();
		
		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
