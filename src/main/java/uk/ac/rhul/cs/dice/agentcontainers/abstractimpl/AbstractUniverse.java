package uk.ac.rhul.cs.dice.agentcontainers.abstractimpl;

import java.util.ArrayList;
import java.util.List;

import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Ambient;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Universe;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.UniverseAppearance;

/**
 * 
 * An Implementation of {@link Universe}. It has a {@link UniverseAppearance} and a {@link List} of {@link Ambient}s.
 * 
 * @author cloudstrife9999
 *
 */
public abstract class AbstractUniverse implements Universe {
    private UniverseAppearance appearance;
    private List<Ambient> ambients;
    
    /**
     * 
     * Constructs an {@link AbstractUniverse} from a {@link UniverseAppearance}. It initializes the {@link Ambient}s with an empty {@link List}.
     * 
     * @param appearance a {@link UniverseAppearance}.
     * 
     */
    public AbstractUniverse(UniverseAppearance appearance) {
	this.appearance = appearance;
	this.ambients = new ArrayList<>();
    }
    
    /**
     * 
     * Constructs an {@link AbstractUniverse} from a {@link UniverseAppearance} and a {@link List} of {@link Ambient}s.
     * 
     * @param appearance a {@link UniverseAppearance}.
     * @param ambients a {@link List} of {@link Ambient}s.
     * 
     */
    public AbstractUniverse(UniverseAppearance appearance, List<Ambient> ambients) {
	this.appearance = appearance;
	this.ambients = ambients == null ? new ArrayList<>() : ambients;
    }
    
    /**
     * 
     * Constructs an {@link AbstractUniverse} from a {@link UniverseAppearance} and a single {@link Ambient}.
     * 
     * @param appearance a {@link UniverseAppearance}.
     * @param ambients an {@link Ambient}.
     * 
     */
    public AbstractUniverse(UniverseAppearance appearance, Ambient ambient) {
	this(appearance);
	
	if(ambient != null) {
	    this.ambients.add(ambient);
	}
    }
    
    @Override
    public UniverseAppearance getAppearance() {
	return this.appearance;
    }
    
    @Override
    public List<Ambient> getAmbients() {
	return this.ambients;
    }
    
    @Override
    public Ambient getMainAmbient() {
        return this.ambients == null || this.ambients.isEmpty() ? null : this.ambients.get(0);
    }
    
    @Override
    public void addAmbient(Ambient ambient) {
	this.ambients.add(ambient);
    }
}