package Assistedpracticeproject;

public class Constructors5 {
	
		String name;
		int rollno;

		public Constructors5 () {
		}

		Constructors5(String name, int rollno) {
			this.name = name;
			this.rollno = rollno;

		}

		public static void main(String[] args) {
			Constructors5 p1 = new Constructors5("ramesh", 243);
			Constructors5 p2 = new Constructors5("ramu", 283);
			System.out.println("Name of p1 is=" +p1.name);
			System.out.println("Name of p2 is=" + p2.name);
			System.out.println("Roll number of p1 is="+p1.rollno);
			System.out.println("Roll number of p2 is="+p2.rollno);

		}

	}


