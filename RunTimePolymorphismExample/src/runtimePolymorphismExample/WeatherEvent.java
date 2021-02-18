package runtimePolymorphismExample;

/**
 * Model a weather event as it's reported by TV weather talkspeople
 * @author nicomp
 *
 */
public class WeatherEvent {
	private String description;
	
	
	/**
	 * @param description How the Blizzard object is described by the TV weather talkspeople
	 */
	public WeatherEvent(String description) {
		setDescription(description);
	}
	
	/**
	 * Get a description of how this event will affect us
	 * @return
	 */
	public String getImpactOfWeatherEvent() {
		return "We don't know yet";
	}
	/**
	 * Get the description of the object
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Define the description of the object
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Get a string representation of the object
	 */
	public String toString() {return description;}
}
