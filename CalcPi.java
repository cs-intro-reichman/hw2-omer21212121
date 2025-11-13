// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int wanted = Integer.parseInt(args [0]);
		int numIt = 0;
		double sum = 0; 
		int denominator = 1;
		while (numIt < wanted) {
			if (numIt%2 == 0) {
				sum = sum + ((double)1/denominator);

			} else {
				sum = sum - ((double)1/denominator);
			}
			numIt++;
			denominator = denominator + 2;

		}
		System.out.println("pi according to Java " + sum*4);
		System.out.println("pi, approximated: " + Math.PI);


	}
}
