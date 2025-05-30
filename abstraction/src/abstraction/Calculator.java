package abstraction;

abstract class Cal{
	void add() {
		int a=10;
		int b=20;
		System.out.println("Addition:"+ (a+b));
		
	}
	abstract void sub();
	void mul() {
		int a=10;
		int b=20;
		System.out.println(a*b);
		
	}
}
class Ab extends Cal{
	void sub() {
		int a=10;
		int b=20;
		System.out.println(a-b);
	}
}

public class Calculator {
	public static void main(String args[]) {
		Ab ab =new Ab();
		ab.add();
		ab.sub();
		ab.mul();
	}

}
