package inheritance;


// HAS-A Relationship

class Student {

	String name;

	long mobileNum;

	int pincode;

	float percentile = 64.333333333333333333f;

	double weight = 69.6969696969696969696969696969696123;

	public void getUniversity(University u) {
		u.pincode=412207;
		u.showPinCode();
		u.affiliated();
	} 

	public static void main(String[] args) {

		Student st = new Student();
		st.getUniversity(new University());
		st.name="Sonu Kumar";
		st.mobileNum = 9905040207l;
		st.percentile = 64.333333333333333333f;
		st.weight = 69.6969696969696969696969696969696123d;
		System.out.println(st.name);
		System.out.println(st.mobileNum);
		System.out.println(st.percentile);
		System.out.println(st.weight);
		
		
	}

}
