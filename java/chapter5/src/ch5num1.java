public class ch5num1 {
	/**
	 * seven times table ex: 7 x 1 = 7
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans;
		int counter = 1;

		while (counter <= 10) {
			ans = (counter * 7);
			System.out.println("7 x " + counter + " = " + ans);
			counter++;
		}
	}

}