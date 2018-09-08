package lesson2;

public class ForBreak {

	public static void main(String[] args) {
		for(int i=0;true;i++){
			System.out.println(i);
			if(i == 100) {
				break;
			}
		}
//
		for(int i=0;i<500;i++){
			System.out.println(i);
			if(i == 100) {
				break;
			}
		}
	}

}
