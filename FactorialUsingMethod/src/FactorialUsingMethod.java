
public class FactorialUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		Findfact(n);
		int x=4;
		Findfact(x);
	}
	static void Findfact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println( n+ " factorial is " +fact);
	}
}
