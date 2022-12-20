package inheritance;

class College extends University{

	String collegeName;

	long refID;

	public static void main(String[] args) {

		College cl = new College();
		cl.pincode=81114;
		cl.showPinCode();
		cl.affiliated();
		cl.collegeName="G H Raisoni";
		cl.refID=587265;
		System.out.println(cl.collegeName);
		System.out.println(cl.refID);

	}

}
