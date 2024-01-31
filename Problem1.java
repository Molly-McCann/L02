
// Molly McCann 
// 01.30.2024

public class Problem1 {

	public static void main(String[] args) {
		// Create a string array
		String[] names1 = {"Alice", "Bob", "Charlie", "David"};
		String[] names2 = {"Hannah", "Alice", "Mary", "Olivia"};
		
		boolean found = false; 
		
		for (int i = 0; i < names1.length; i++) {
			String name1 = names1[i];
			for (int j = 0; j < names2.length; j++) {
				String name2 = names2[j]; 
				if (name1.equals(name2)) {
					System.out.println("Yes, the duplicate name is: " + name1);
					found = true; 
					break;
				}
				
			}
			if (found) {
				break;
			}
		
		}

	}

}
