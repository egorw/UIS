package lesson3;

public class StudentProviderFromDataBase implements StudentProvider {

	@Override
	public Student[] getStudents() {
		return new Student[]{
				new Student("Ivan", "Ivanov", 1996)
		};
	}

}
