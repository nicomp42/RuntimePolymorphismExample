package runtimePolymorphismExample;

/**
 * Model a boring weather day as it's reported by TV weather talkspeople 
 * * @author nicomp
 *
 */
public final class SunnyAndPleasant extends WeatherEvent {		// We made this final. Why?

/**
 * @param description How the object is described by the TV weather talkspeople
 */
	public SunnyAndPleasant(String description) {
		super(description);
	}

}
