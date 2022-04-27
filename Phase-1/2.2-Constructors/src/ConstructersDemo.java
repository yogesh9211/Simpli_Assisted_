//default constructor
class A {
	int i;
	int j;
	
	A() {
		i=4;
		j=6;
	}
	//parameterized constructor
	A(int i, int j) {
		this.i = i;
		this.j = j;
	}
}
class B {
	int i;
	String s ;
	
	public B() {
		System.out.println("B constructor is called");
	}
	}
class C extends B {
	public C() {
		System.out.println("C constructor is called");
	}
}
public class ConstructersDemo {
	public static void main(String[] args) {
		System.out.println("Default constructor called");
		
		A a = new A();
		System.out.println(a.i);
		System.out.println(a.j);
		
		System.out.println("parameterized constructor called");
	      C c = new C();
		
	}
}

