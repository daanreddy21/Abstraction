
import java.util.*;
abstract class Shaps{
	final static float pie=3.14f;
	double area;
	abstract void Collectdata();
	abstract void Calculatedata();
	void disaplay() {
		System.out.println(area);
	}
	
}
class Square extends Shaps{
	int a;
	void Collectdata() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a value");
	a=sc.nextInt();
	
	}
	void Calculatedata() {
		area= a*a;
	}
	
}
class Circle extends Shaps{
	int r;
	void Collectdata() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a value");
	r=sc.nextInt();
	
	}
	void Calculatedata() {
		area= pie*(r*r);
	}
	
}
class Triangle extends Shaps{
	int h;int b;
	void Collectdata() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a value");
	b=sc.nextInt();
	System.out.println("enter h value");
	 h=sc.nextInt();
	
	}
	void Calculatedata() {
		area= 0.5*b*h;
	}
	
}
public class Main {
	public static void main(String args[]) {
		Square s=new Square();
		s.Collectdata();
		s.Calculatedata();
		s.disaplay();
		Circle c= new Circle();
		c.Collectdata();
		c.Calculatedata();
		c.disaplay();
		Triangle t= new Triangle();
		t.Collectdata();
		t.Calculatedata();
		t.disaplay();
	}

}
