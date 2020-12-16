
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading A = new Overloading();
		addtwonumbers(10,20);
		addtwonumbers(10,20,30);
		
		
	}
	static void addtwonumbers(int a,int b)
	{
		int result;
		result = a+b;
		System.out.println(" addition is  : " + result);
		
	}
	static void addtwonumbers(int a,int b,int c)
	{
		int result;
		result = a+b+c;
		System.out.println(" addition is  : " + result);
		
	}
}
