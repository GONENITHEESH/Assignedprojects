package Assistedpracticeproject;


	public class Program19  extends Parent {

		// method overloading
		public int m1(int x,int y) {
			return x+y;
		}

		public long m1(long x,long y, long z) {
			return x+y+z;
		}

		@Override
		public void m1() {
			System.out.println("hello i am child class methods.");
		}

		public static void main(String[] args) {
			Program19 object = new Program19();
			object.m1();

		}


	}

	class Parent{

		public void m1() {
			System.out.println("Hello i am parent class method");
		}
	}


