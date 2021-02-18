package runtimePolymorphismExample;

/**
 * Model a light dusting of snow as it's reported by TV weather talkspeople
 * @author nicomp
 *
 */
public class SnowFlurry extends WeatherEvent {
	
	
	/**
	 * @param description How the Blizzard object is described by the TV weather talkspeople
	 */
	public SnowFlurry(String description) {
		super(description);
	}

	/**
	 * Get a description of how this event will affect us
	 * @return
	 */
	public String getImpactOfWeatherEvent() {
		// Note this method automagically overrides the same method in the base class
		return "You may have to clean your car before you leave the house, but otherwise no big deal";
	}
	/**
	 * String representation of the object
	 * @return the representation of the object
	 */
	public String toString( ) {
		return "SnowFlurry: " + super.getDescription();
	}
}
