package uk.ac.rhul.cs.dice.agentcontainers.abstractimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

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
	this(appearance, Collections.emptyList());
    }
    
    /**
     * 
     * Constructs an {@link AbstractUniverse} from a {@link UniverseAppearance} and a single {@link Ambient}, which becomes the main ambient.
     * 
     * @param appearance a {@link UniverseAppearance}.
     * @param ambients an {@link Ambient}.
     * 
     */
    public AbstractUniverse(UniverseAppearance appearance, Ambient ambient) {
	this(appearance, ambient == null ? Collections.emptyList() : Arrays.asList(ambient));
    }
    
    /**
     * 
     * Constructs an {@link AbstractUniverse} from a {@link UniverseAppearance} and a {@link List} of {@link Ambient}s.<br /><br />
     * If the {@link List} of {@link Ambient}s is not <code>null</code> and not empty, the first element become the main ambient (see {@link #getMainAmbient()}).<br /><br />
     * All the non-<code>null</code> elements of the {@link List} are added as ambients.
     * 
     * @param appearance a {@link UniverseAppearance}.
     * @param ambients a {@link List} of {@link Ambient}s.
     * 
     */
    public AbstractUniverse(UniverseAppearance appearance, List<Ambient> ambients) {
	this.appearance = appearance;
	this.ambients = new ArrayList<>();
	
	if(ambients != null) {
	    ambients.stream().filter(Objects::nonNull).forEach(this.ambients::add);
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
    
    @Override
    public void addMainAmbient(Ambient ambient) {
	this.ambients.add(0, ambient);
    }
}