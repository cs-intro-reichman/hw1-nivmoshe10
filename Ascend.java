// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		String limit = args[0];
		int l = Integer.parseInt(limit);
		int a = (int)(Math.random() * l);
		int b = (int)(Math.random() * l);
		int c = (int)(Math.random() * l);
		int x = Math.min(a, (Math.min(c, b)));
		int z = Math.max(a, (Math.max(c, b)));
		int y = ((a + b + c) - ( x + z)); 
		System.out.println(x + " " + y + " " + z);
	}
}
