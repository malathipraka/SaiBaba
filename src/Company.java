

public class Company {


public static class CompanyInfo {
	private void CompanyName(int a) {
		System.out.println("Argument : "+a);
	

	}
	
	private void CompanyName(int a,int b) {
		System.out.println("Argument : "+a+" and "+b);

	}

	private void CompanyName(int a,int b,int c) {
		System.out.println("Argument : "+ a+" and "+b+" and "+c);
	}
	
	public static void main(String[] args) {
		CompanyInfo A= new CompanyInfo();
		A.CompanyName(1);
		A.CompanyName(1, 2);
		A.CompanyName(1, 2, 3);
		
	}}
	}

