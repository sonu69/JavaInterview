package encapsulation;

class EncapsulationP {

	private static int age;

	public static void setAge(int setAge) {
		age=setAge;
	}

	public static int getAge() {
		return age;
	}

	public static void main(String[] args) {
		
		EncapsulationP ep = new EncapsulationP();
		
		ep.setAge(1242);
		System.out.println(EncapsulationP.getAge());
		
	}
	
}
