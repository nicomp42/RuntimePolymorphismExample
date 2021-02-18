/*
 * “In dynamic polymorphism the actual method call is resolved dynamically that is at run time only and not at the compile time. “ 
 *   -- http://mrbool.com/dynamic-polymorphism-in-java/29794
 */
package runtimePolymorphismExample;

public class Main {

	public static void main(String[] args) {
		WeatherEvent myWE = new WeatherEvent("We're watching the news to see what will happen.");	// Declare and instantiate
		System.out.println(myWE.toString());					// What method is called?
		System.out.println(myWE.getImpactOfWeatherEvent());		// What method is called?
		

		// Cast the base class object to an instance of the derived class. Note what happens to the methods
		myWE = new SnowFlurry("It's snowing a little");			// Just instantiate. What happened to the original WeatherEvent object?
		System.out.println(myWE.toString());					// What method is called?
		System.out.println(myWE.getImpactOfWeatherEvent());		// What method is called? Try alt-click/Open Declaration. Try the debugger.
		
		
		// OK, now we'll case the WeatherEvent object to a Snowmageddon object... nothing can go wrong, right?
		myWE = new Snowmageddon("IT'S MORE SNOW THAN WE'VE EVER HAD IN HISTORY!!!");
		System.out.println(myWE.toString());					// What method is called?
		System.out.println(myWE.getImpactOfWeatherEvent());		// What method is called? Try alt-click/Open Declaration. Try the debugger.
		
		
		
		
	}

}
