package runtimePolymorphismExample;

/**
 * Model a heavy snowfall as it's reported by TV weather talkspeople
 * @author nicomp
 *
 */
public class Blizzard extends WeatherEvent {

	/**
	 * Init the object
	 * @param description How the Blizzard object is described by the TV weather talkspeople
	 */
	public Blizzard(String description) {
		super(description);
	}

	/**
	 * Get a description of how this weather event will affect us
	 * @return
	 */
	// Note this method automagically overrides the same method in the base class
	public String getImpactOfWeatherEvent() {
		return "You can stay home and eat all the food you panic-bought yesterday.";
	}

}
