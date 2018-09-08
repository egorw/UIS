package lesson2;

public class While {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println("Hello world: " + i);
			i++;
		}
		i = 0;
		while (i < 10) {
			System.out.println("Hello world: " + i);
			i++;
			if (i == 8) {
				break;
			}
		}
		i = 0;
		while (i < 10) {
			if (i == 8) {
				continue;
			}
			System.out.println("Hello world: " + i);
			i++;

		}

		while (3 > 2) {
			break;
		}
		while (true) {
			break;
		}
	}

}
