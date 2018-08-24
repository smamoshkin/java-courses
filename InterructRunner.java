import java.util.Scanner;

public class InterructRunner{
	
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		Calculator calc = new Calculator();
		String exit = "yes";
		while (exit.equals("yes")){
			System.out.println("Enter first arg ");
			String first = reader.next();
			System.out.println("Enter second arg ");
			String second = reader.next();
			System.out.println("Enter operation brief (sum/dif/mult/dev) ");
			String oper = reader.next();
			if (oper.equals("sum"))	calc.sum(Integer.valueOf(first),Integer.valueOf(second));
			else if (oper.equals("dif")) calc.dif(Integer.valueOf(first),Integer.valueOf(second));
			else if (oper.equals("mult")) calc.mult(Integer.valueOf(first),Integer.valueOf(second));
			else if (oper.equals("dev")) calc.dev(Integer.valueOf(first),Integer.valueOf(second));
			else System.out.println("Unknown command!");
			System.out.println("Result is " + calc.getRes());
			calc.cleanRes();
			System.out.println("Continue? (yes/no)");
			exit = reader.next();
		}
	}
}