public class FahrenheitToCelsius {
	public static void main(String[] args){

		// variable declaration
		int saturdayFahrenheit;
		int sundayFahrenheit;

		// variable initialization
		saturdayFahrenheit = 78;
		sundayFahrenheit = 81;

		// using a 5.0 instead of a 5 makes it more precise
		double saturdayCelsius = (5.0/9) * (saturdayFahrenheit - 32);
		double sundayCelsius = (5.0/9) * (sundayFahrenheit - 32);
		
		System.out.println("Weekend Averages:");
		System.out.println("Saturday: " + saturdayCelsius);
		System.out.println("Sunday: " + sundayCelsius);
	}
}