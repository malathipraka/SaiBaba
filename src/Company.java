

public class Company {


public static class CompanyInfo {
	private void CompanyName(int a) {
		System.out.println("1: "+a);
	

	}
	
	private void CompanyName(int a,int b) {
		System.out.println("2 : "+a+" and "+b);

	}

	private void CompanyName(int a,int b,int c) {
		System.out.println("3 : "+ a+" and "+b+" and "+c);
	}
	
	public static void main(String[] args) {
		CompanyInfo A= new CompanyInfo();
		A.CompanyName(1);
		A.CompanyName(1, 2);
		A.CompanyName(1, 2, 3);
		
	}}
	}

