package Assistedpracticeproject;


	class outerClass {
		int x = 143;

		class innerClass {
			int y = 1432;

		}
	}

	public class Program7a {

		public static void main(String[] arg) {
			outerClass myOuter = new outerClass();
			outerClass.innerClass myInner = myOuter.new innerClass();
			System.out.println(myInner.y+"\n" + myOuter.x);

		}
	}

