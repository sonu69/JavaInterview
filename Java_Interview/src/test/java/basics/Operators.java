package basics;

class Operators {

	public static void main(String[] args) {

		String s1="Flower";
		String s2="Flower";
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		int flag = 1;

		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				if(ch1[i]!=ch2[i]) {
					flag=0;
				}
			}
		}

		if(flag==0) {
			System.out.println("Strings are difference");
		}

		if(flag==1) {
			System.out.println("Strings are same");
		}



	}
}
