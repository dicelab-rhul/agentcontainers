package uk.ac.rhul.cs.dice.agentcontainers.interfaces;

import java.util.Collection;

public interface Universe {
    public abstract UniverseAppearance getAppearance();
    public abstract Collection<Ambient> getAmbients();
    
    public default int countSubContainers() {
	return getAmbients().size();
    }
}