
public class BikeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color;
		String Company;
		int Milage;
		Bike b1 = new Bike();
		System.out.println(" Color: "+b1.color);
		System.out.println(" company: " +b1.Company);
		System.out.println(" Milage :" +b1.Milage);
		System.out.println("===================");
		Bike b2 = new Bike("Red","Pulsar",45);
		System.out.println(" Color: "+b2.color);
		System.out.println(" company: " +b2.Company);
		System.out.println(" Milage :" +b2.Milage);
		
	}

}
