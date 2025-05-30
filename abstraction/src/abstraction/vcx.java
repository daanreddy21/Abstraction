package abstraction;
abstract class plain{
	void fly() {
		System.out.println("ready to fly");
	}
	abstract int a();
	abstract void name();
	void go() {
		System.out.println("signal to fly");
	}
	
}
class Cargo extends plain{
	int x;
	int a(int x) {
		return x;
		
	}
	void name() {
		System.out.println("indigo");
	}
	@Override
	int a() {
		// TODO Auto-generated method stub
		return 0;
	}
}


public class vcx {
	public static void main(String args[]) {
		Cargo c= new Cargo();
		c.name();
		System.out.println("no of passengers:"+c.a(56));
		c.fly();
		c.go();
	}
	

}
