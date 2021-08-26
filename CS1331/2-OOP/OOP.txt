# Why Object Oriented Coding?
* OOP enables creating modular code that can be easily reused and managed. Primarily this makes it very easy to revise a small portion to large effect
* on the other hand, Procedural coding, which predates OOP, are essentially a bunch of methods/functions not contained within classes. This makes it much more verbose and harder to manage.


## Notes about Java coding
* Java identifier are names coders use to label methods, classes and variable
* can contain letter, digits, underscore and dollar sign
* digit cannot start an identifier
* identifiers cannot be a reserved word: public, class, abstract, continue...
* Java is ***case sensitive***
* variables are usually camelcase with lower case first letter
* Java is statically typed: one must declare a variable before using it
* literal or a static type. many of which has a inehrent type. ex: 78 default is int


## Data Types
* byte: 8 bits, -128 to 127
* short 16 bits, -32,768 to 32,767
* int: 32 bits, -2,147,483,647 to 2,147,483,647
* long: 64 bits, -9E18 to 9E18 (approx)
* ...

```
public class FahrenheitToCelsius {
	pulic static void main(String[] args{

		// variable declaration
		int saturdayFahrenheit;
		int sundayFahrenheit;

		// variable initialization
		saturdayFahrenheit = 78;
		sunday Fahrenheit = 81;

		// using a 5.0 instead of a 5 makes it more precise
		double saturdayCelsius = (5.0/9) * (saturdayFahrenheit - 32)
		double sundayCelsius = (5.0/9) * (sundayFahrenheit - 32)

		System.out.println("Weekend Averages:")
		System.out.println("Saturday: " + saturdayCelsius)
		System.out.println("Sunday: " + sundayCelsius)
	}
	)
}
