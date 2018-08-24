
public class Calculator {
	private int retVal;
	
	public void sum(int a, int b){
		retVal = a + b;
	}
	
	public int getRes() {
		return retVal;
	}
	
	public void cleanRes() {
		retVal = 0;
	}
	
	public void dif(int a, int b){
		retVal = a - b;
	}
	
	public void mult(int a, int b){
		retVal = a * b;
	}
	
	public void dev(int a, int b){
		retVal = a / b;
	}
}