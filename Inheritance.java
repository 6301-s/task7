class Calculator{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
}
class AdvanceCalculator extends Calculator{
	public int multi(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
}

public class Inheritance{
	public static void main(String args[]) {
		AdvanceCalculator c=new AdvanceCalculator();
		System.out.println(c.add(4,5));
		System.out.println(c.sub(8,3));
		System.out.println(c.multi(5,2));
		System.out.println(c.div(15,3));
		
	}
}

