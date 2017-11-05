package uk.ac.rhul.cs.dice.agentcontainers.abstractimpl;

import java.util.Collections;
import java.util.List;

import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Ambient;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.Universe;
import uk.ac.rhul.cs.dice.agentcontainers.interfaces.UniverseAppearance;

public abstract class AbstractUniverse implements Universe {
    private UniverseAppearance appearance;
    private List<Ambient> ambients;
    
    public AbstractUniverse(UniverseAppearance appearance) {
	this.appearance = appearance;
	this.ambients = Collections.emptyList();
    }
    
    public AbstractUniverse(UniverseAppearance appearance, List<Ambient> ambients) {
	this.appearance = appearance;
	this.ambients = ambients == null ? Collections.emptyList() : ambients;
    }
    
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
}