package lesson2;

public class ForContinue {

	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}

	}

}