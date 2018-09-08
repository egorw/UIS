package lesson3;

import java.util.Calendar;

public class Student extends Object {
	private String firstname;
	private String lastname;
	private int birthDayYear;
	
	public Student() {
		this(null, null, 0);
	}

	public Student(String firstname, String lastname, int birthDayYear) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		setBirthDayYear(birthDayYear);
	}

	public void setBirthDayYear(int birthDayYear) {
		if(birthDayYear > 1980 && birthDayYear < calculateMaxPossibleBirthDayYear()) {
			this.birthDayYear = birthDayYear;
		}
		else{
			this.birthDayYear = 1990;
		}
	}
	
	public void setBirthDayYear(String birthDayYear) {
		setBirthDayYear(Integer.parseInt(birthDayYear));
	}
	
	public int getBirthDayYear() {
		return birthDayYear;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	private int calculateMaxPossibleBirthDayYear(){
		Calendar cl = Calendar.getInstance();
		cl.add(Calendar.YEAR, -17);
		return cl.get(Calendar.YEAR);
	}

	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + ", birthDayYear=" + birthDayYear + "]";
	}
	
	
}
