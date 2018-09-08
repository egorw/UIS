package lesson3;

public interface StudentProvider {

	Student[] getStudents() throws StudentNotFoundException;
}
