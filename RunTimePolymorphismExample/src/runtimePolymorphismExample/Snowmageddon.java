package runtimePolymorphismExample;

/**
 * Model a civilization-ending overwhelming snowfall as it's reported by TV weather talkspeople 
 * * @author nicomp
 *
 */
public class Snowmageddon extends Blizzard {

	/**
	 * @param description How the Blizzard object is described by the TV weather talkspeople
	 */
	public Snowmageddon(String description) {
		super(description);
	}
	
	// NOTE there is no override of getImpactOfWeatherEvent here. Is that wrong? Should I not have done that?
	
	
	/**
	 * Get a string representation of the object.
	 */
	// Note the override
	public String toString() {return super.getDescription();}
	
}
