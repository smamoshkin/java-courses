public class Calculate{
	public static void main(String[] arg){
		System.out.println("Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		double sum = first + second;
		double diff = first - second; 
		double mult = first*second;
		double dev = first/second;
		System.out.println("Sum " + sum);
		System.out.println("Diff " + diff);
		System.out.println("mult " + mult);
		System.out.println("Dev " + dev);
	}
}