
	abstract class A {
		public abstract void disp();
	}

	public class InnerClassDemo {
		
	public static void main(String[] args) {
		A a = new A() {
			public void disp() {
				System.out.println("Inside anonymous inner class");
			}
		};
		a.disp();
	}
	}

