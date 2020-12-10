
public class SumOfDigitsUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=259;
		SumOfDigits(m);
		int n = 156;
		SumOfDigits(n);
	}

	private static void SumOfDigits(int x) {
		// TODO Auto-generated method stub
		int n, sum = 0;
    	do
    	{
    	    n = x % 10;
    	    sum = sum + n;
    	    x = x / 10;
    	}
    	while(x>0);
	   {
		System.out.println( " Sum of Digits: " +sum);
	   }
		
	}

}
