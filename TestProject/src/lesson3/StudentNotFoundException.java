package lesson3;

public class StudentNotFoundException extends Exception {
	private static final long serialVersionUID = 4350149754895016905L;

	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public StudentNotFoundException(String message) {
		super(message);
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}

}
