package lesson3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StudentProviderFromFile implements StudentProvider {

	@Override
	public Student[] getStudents() throws StudentNotFoundException {
		try {
			String path = "C:\\test.txt";
			String data = new String(Files.readAllBytes(Paths.get(path)));
			return null;
		} catch (IOException e) {
			throw new StudentNotFoundException("Can't retrive data of students: ", e);
		}
	}

}
