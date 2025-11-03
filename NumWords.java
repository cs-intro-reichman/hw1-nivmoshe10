// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		String number = args[0];
		int n = Integer.parseInt(number);
		int h = (n / 100);
	    n = (n % 100);
		int t = (n / 10);
		int o = (n % 10);
		System.out.println(h + " hundreds, " + t + " tens, and " + o + " ones.");


	}
}
