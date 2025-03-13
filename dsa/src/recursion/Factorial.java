package recursion;

public class Factorial {
	
	public static void main(String[] args) {
		
		int result = factorial(5);
		System.out.println(result);
	}

	private static int factorial(int i) {
		// TODO Auto-generated method stub
		if(i>0)
			return i * factorial(i-1);
		return 1;
	}

}
