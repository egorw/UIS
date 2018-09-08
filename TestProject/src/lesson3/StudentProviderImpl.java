package lesson3;

public class StudentProviderImpl implements StudentProvider {

	@Override
	public Student[] getStudents() {
		return new Student[]{
				new Student("Ivan", "Ivanov", 1996),
				new Student("Ivan", "Ivanov", 1998),
				new Student("Ivan", "Ivanov", 1997)
		};
	}

}
