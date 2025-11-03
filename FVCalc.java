// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		String currentValue = args[0];
		int c = Integer.parseInt(currentValue);
		String rate = args[1];
		double r = Integer.parseInt(rate);
		String year = args[2];
		int y = Integer.parseInt(year);
		double futurevalue = c * Math.pow(1 + (r/100.0), y);
		System.out.println("future value: $" + futurevalue);


	}
}