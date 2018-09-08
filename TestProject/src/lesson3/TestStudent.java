package lesson3;

public class TestStudent {

	public static void main(String[] args) {
		String firstname = "Ivan";
		String lastname = "Ivanov";
		int birthDayYear = 1991;
		
		Student s = new Student("Ivan", "Ivanov", 1900);
		s.setBirthDayYear(1990);
		s.setBirthDayYear("1990");
		
		System.out.println(s.toString());
	}

}
