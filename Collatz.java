// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		
		// Loop through all seeds from 1 to N
		for (int seed = 1; seed <= N; seed++) {
			int currentNum = seed;
			int steps = 1; // Start with 1 to count the seed itself
			
			// In verbose mode, print the seed
			if (mode.equals("v")) {
				System.out.print(seed + " ");
			}
			
			// Generate the hailstone sequence
			// We use a do-while to ensure at least one iteration
			do {
				if (currentNum % 2 == 0) {
					currentNum = currentNum / 2;
				} else {
					currentNum = currentNum * 3 + 1;
				}
				
				// In verbose mode, print each number in the sequence
				if (mode.equals("v")) {
					System.out.print(currentNum + " ");
				}
				
				steps++;
			} while (currentNum != 1);
			
			// In verbose mode, print the number of steps
			if (mode.equals("v")) {
				System.out.println("(" + steps + ")");
			}
		}
		
		// Print the summary line
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
