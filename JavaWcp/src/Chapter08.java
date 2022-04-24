
public class Chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number ++;
		}
		int[] array = { 11, 22, 33, 44 };
		for (int num: array) {
			if (num % 2 == 0) {
				continue;
			}
			System.out.println(num);
		}
	}
}
