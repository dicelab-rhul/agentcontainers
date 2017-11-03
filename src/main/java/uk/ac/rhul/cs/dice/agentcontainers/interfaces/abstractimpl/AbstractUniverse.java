package uk.ac.rhul.cs.dice.agentcontainers.interfaces.abstractimpl;

import java.util.Collection;
import java.util.Collections;

import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Ambient;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Universe;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.UniverseAppearance;

public abstract class AbstractUniverse implements Universe {
    private UniverseAppearance appearance;
    private Collection<Ambient> ambients;
    
    public AbstractUniverse(UniverseAppearance appearance) {
	this.appearance = appearance;
	this.ambients = Collections.emptySet();
    }
    
    public AbstractUniverse(UniverseAppearance appearance, Collection<Ambient> ambients) {
	this.appearance = appearance;
	this.ambients = ambients == null ? Collections.emptySet() : ambients;
    }
    
    public AbstractUniverse(UniverseAppearance appearance, Ambient ambient) {
	this(appearance);
	
	if(ambient != null) {
	    this.ambients.add(ambient);
	}
    }
    
    @Override
    public UniverseAppearance getAppearance() {
	return appearance;
    }
    
    @Override
    public Collection<Ambient> getAmbients() {
	return ambients;
    }
}