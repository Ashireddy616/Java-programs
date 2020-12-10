
public class PositiveOrNegetive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		CheckPositiveorNegetive(n);
		int x = -10;
		CheckPositiveorNegetive(x);
	
	}

	private static void CheckPositiveorNegetive(int n) {
		// TODO Auto-generated method stub
		System.out.println("pgm to ceck the number is positive Or negetive");
		if(n>0) {
			System.out.println( n+ " is Positive " );
		}
		else
		{
			System.out.println( n+ "  is negetive ");
		}
	}

}
