
// Molly McCann
// 01.30.2024

public class Problem2 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int z = 13;
		int max = (x > y) ? x : y;
		
		System.out.println("The maximum value is: " + max);

		String evenOrOdd = (z % 2 == 0) ? " even" : " odd"; 
		
		System.out.println("The maximum value is: " + max);
		System.out.println("The number " + z + " is" + evenOrOdd);
		
	}

}
