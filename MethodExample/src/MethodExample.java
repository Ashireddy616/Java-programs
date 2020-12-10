
public class MethodExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1 = 30;
	   FindEven(num1);
	   int num2 = 21;
	   FindEven(num2);
	}
	static void FindEven(int num)
	{
		if(num%2 == 0)
		{
			System.out.println( num + " is Even " );
		}	
		else
		{
			System.out.println( num + " is odd ");
		}
	}
}
