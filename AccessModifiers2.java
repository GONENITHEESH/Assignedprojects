package Assistedpracticeproject;

public class AccessModifiers2 extends A {
		public static void main(String[] args) {
			A object = new A();
			// Private modifier will be accessed Within the class only
			// Only Public Modifier will be Accessed
			System.out.println(object.name1);
			// Only Protected modifier will be Accessed
			System.out.println(object.name3);
			// Only Default modifier will be Accessed
			System.out.println(object.name4);

		}
	}

	class A {

		public String name1 = "nitheesh";
		private String name2 = "ramesh";
		protected String name3 = "Raju";
		String name4 = "SMS";

		private String getName1(String input) {
			return input;

		}

		public String getName2(String input) {
			return input;

		}

		protected String getName3(String input) {
			return input;

		}

		String getName4(String input) {
			return input;
		}

	}


