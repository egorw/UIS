package lesson3;

public class CalculateStaticts {

	private void printStatistics(){
		StudentProvider sp = new StudentProviderFromFile();
		try {
			int averageBirthDayYear = 0;
			for(int i=0;i<sp.getStudents().length;i++){
				Student st = sp.getStudents()[i];
				averageBirthDayYear += st.getBirthDayYear();
			}
			averageBirthDayYear /= sp.getStudents().length;
			System.out.println(averageBirthDayYear);
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
			System.out.println("Sorry, can't complete your request!"
					+ " Please try again later");
		}
	}
	
	public static void main(String[] args) {
		new CalculateStaticts().printStatistics();
	}

}
