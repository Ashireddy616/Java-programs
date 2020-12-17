
public class Bike {
		String color;
		String Company;
		int Milage;
	
	{
		System.out.println(" inside initializationblock1: ");
		
	}
	void Travelling()
	{
		System.out.println(" Travelling ");
	}
	Bike()
	{
		System.out.println("no-argument Constructor");
		color ="black";
		Company = "Honda";
		Milage = 60;
		
	}
	Bike(String inColor,String incompany,int inmilage)
	{
		System.out.println("inside Parameterized Constructor");
		color = inColor;
		Company = incompany;
		Milage = inmilage;
	}
	{
		System.out.println("inside initializationblock2");
		
	}
}
