package Assistedpracticeproject;

public class DiffrentMethodesReturntypes4 {


		public void ma(String name) {
			System.out.println("UpperCase is :" + name.toUpperCase());
		}

		public int mb(int x, int y) {
			return x + y;
		}

		public double mc(double x, double y) {
			return x + y;
		}

		public String md(String s1, String s2) {
			return s1 + s2;
		}

		public static void main(String args[]) {
			DiffrentMethodesReturntypes4 object = new DiffrentMethodesReturntypes4();
			object.ma("nitheesh");
			System.out.println(object.mb(100, 6));
			System.out.println(object.mc(4, 6));
			System.out.println(object.md("546", "789"));

		}

	}

