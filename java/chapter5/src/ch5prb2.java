public class ch5prb2 {
	/**
	 * displays 20 numbers and their squares and cubes
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int square, cube;

		while (num <= 20) {
			square = (num * num);
			cube = (square * num);
			System.out.println(num + " " + square + " " + cube);
			num++;
		}
	}

}
