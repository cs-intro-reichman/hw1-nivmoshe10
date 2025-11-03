// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		String currentValue = args[0];
		int c = Integer.parseInt(currentValue);
		String rate = args[1];
		double r = Double.parseDouble(rate);
		String year = args[2];
		int y = Integer.parseInt(year);
		double futurevalue = c * Math.pow(1 + (r/100.0), y);
		System.out.println("After " + y + " years, $" + c + " saved at " + r + "% will yield $" + (int)futurevalue);


	}
}