package Algorithm;

public class problem2 {
	public static void main(String[]args) {
	
		for (int i = 1; i < 100; i++) {

			if ((i % 7 == 0) && (i % 8 == 0)) {

				System.out.println("찾는정수 : " +i);
			}
		}

	}
}
